package br.edu.sr.ifes.leds.LedsCode.tests.parserRules;

import br.edu.sr.ifes.leds.LedsCode.factory.ProjectFactory;
import br.edu.sr.ifes.leds.LedsCodeV001InjectorProvider;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
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
public class CompleteInterfaceTest {
  @Inject
  private ParseHelper<LedsCodeDSL> parser;
  
  @Test
  public void testInterfaceName() {
    final InterfaceBlock iface = this.parseCompleteInfrastructura();
    String _name = iface.getName();
    Assert.assertEquals("InterfaceLibrary", _name);
  }
  
  @Test
  public void testInterfaceApplication() {
    final InterfaceBlock iface = this.parseCompleteInfrastructura();
    EList<InterfaceApplication> _interfaceApplication = iface.getInterfaceApplication();
    int _size = _interfaceApplication.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testTypeInterfaceApplication() {
    final InterfaceBlock iface = this.parseCompleteInfrastructura();
    EList<InterfaceApplication> _interfaceApplication = iface.getInterfaceApplication();
    for (final InterfaceApplication app : _interfaceApplication) {
      String _type = app.getType();
      boolean _contains = "HtmlView RestFull".contains(_type);
      Assert.assertTrue(_contains);
    }
  }
  
  @Test
  public void testAcessPointName() {
    final InterfaceBlock iface = this.parseCompleteInfrastructura();
    EList<InterfaceApplication> _interfaceApplication = iface.getInterfaceApplication();
    for (final InterfaceApplication app : _interfaceApplication) {
      String _name = app.getName();
      boolean _contains = "Interface1 Interface2".contains(_name);
      Assert.assertTrue(_contains);
    }
  }
  
  @Test
  public void testUsedApp() {
    final InterfaceBlock iface = this.parseCompleteInfrastructura();
    EList<InterfaceApplication> _interfaceApplication = iface.getInterfaceApplication();
    for (final InterfaceApplication app : _interfaceApplication) {
      String _nameApp = app.getNameApp();
      Assert.assertEquals("Domain", _nameApp);
    }
  }
  
  public InterfaceBlock parseCompleteInfrastructura() {
    try {
      InterfaceBlock _xblockexpression = null;
      {
        CharSequence _completeProject = ProjectFactory.completeProject();
        final LedsCodeDSL model = this.parser.parse(_completeProject);
        TreeIterator<EObject> _eAllContents = model.eAllContents();
        EObject _head = IteratorExtensions.<EObject>head(_eAllContents);
        final Project project = ((Project) _head);
        _xblockexpression = project.getInterfaceBlock();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
