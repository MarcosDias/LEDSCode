package br.edu.sr.ifes.leds.LedsCode.tests.parserRules;

import br.edu.sr.ifes.leds.LedsCode.factory.ProjectFactory;
import br.edu.sr.ifes.leds.LedsCodeV001InjectorProvider;
import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(LedsCodeV001InjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ApplicationTest {
  @Inject
  private ParseHelper<LedsCodeDSL> parser;
  
  @Test
  public void testApplicationName() {
    final EList<ApplicationBlock> app = this.parseApplication();
    for (final ApplicationBlock single : app) {
      String _name = single.getName();
      boolean _contains = "LibraryPersonApp LibraryPersonApp2".contains(_name);
      Assert.assertTrue(_contains);
    }
  }
  
  @Test
  public void testApplicationDomain() {
    final EList<ApplicationBlock> app = this.parseApplication();
    final ApplicationBlock single = app.get(0);
    EList<String> _applicationDomain = single.getApplicationDomain();
    for (final String domainApp : _applicationDomain) {
      boolean _contains = "Library.* Loan.*".contains(domainApp);
      Assert.assertTrue(_contains);
    }
  }
  
  public EList<ApplicationBlock> parseApplication() {
    try {
      EList<ApplicationBlock> _xblockexpression = null;
      {
        CharSequence _completeProject = ProjectFactory.completeProject();
        final LedsCodeDSL model = this.parser.parse(_completeProject);
        TreeIterator<EObject> _eAllContents = model.eAllContents();
        EObject _head = IteratorExtensions.<EObject>head(_eAllContents);
        final Project project = ((Project) _head);
        _xblockexpression = project.getApplicationBlock();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
