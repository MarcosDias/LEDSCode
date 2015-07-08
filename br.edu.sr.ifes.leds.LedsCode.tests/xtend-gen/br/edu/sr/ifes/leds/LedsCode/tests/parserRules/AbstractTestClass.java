package br.edu.sr.ifes.leds.LedsCode.tests.parserRules;

import br.edu.sr.ifes.leds.LedsCode.factory.ProjectFactory;
import br.edu.sr.ifes.leds.LedsCodeV001InjectorProvider;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.junit.runner.RunWith;

@InjectWith(LedsCodeV001InjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public abstract class AbstractTestClass {
  @Inject
  protected ParseHelper<LedsCodeDSL> parser;
  
  protected Project project;
  
  public Project parseProject() {
    try {
      Project _xblockexpression = null;
      {
        CharSequence _completeProject = ProjectFactory.completeProject();
        final LedsCodeDSL model = this.parser.parse(_completeProject);
        TreeIterator<EObject> _eAllContents = model.eAllContents();
        EObject _head = IteratorExtensions.<EObject>head(_eAllContents);
        _xblockexpression = ((Project) _head);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
