package br.edu.sr.ifes.leds.LedsCode.tests.parserRules;

import br.edu.sr.ifes.leds.LedsCode.tests.parserRules.AbstractTestClass;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class InterfaceTest extends AbstractTestClass {
  private InterfaceBlock iface;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.project = _parseProject;
    InterfaceBlock _interfaceBlock = this.project.getInterfaceBlock();
    this.iface = _interfaceBlock;
  }
  
  @Test
  public void testInterfaceName() {
    String _name = this.iface.getName();
    Assert.assertEquals("InterfaceLibrary", _name);
  }
  
  @Test
  public void testQtdInterfaceField() {
    EList<InterfaceApplication> _interfaceApplication = this.iface.getInterfaceApplication();
    int _size = _interfaceApplication.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testTypeInterfaceFields() {
    EList<InterfaceApplication> _interfaceApplication = this.iface.getInterfaceApplication();
    final InterfaceApplication ifaceField = _interfaceApplication.get(0);
    String _type = ifaceField.getType();
    Assert.assertEquals("HtmlView", _type);
    String _name = ifaceField.getName();
    Assert.assertEquals("Interface1", _name);
    String _nameApp = ifaceField.getNameApp();
    Assert.assertEquals("AppDomain", _nameApp);
  }
}
