package br.edu.sr.ifes.leds.LedsCode.tests.metaModel;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.generator.ProjectConverter;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import model.interfaceLayer.Interface;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class InterfaceTest extends AbstractTestClass {
  private InterfaceBlock ifaceLang;
  
  private Interface ifaceMetaModel;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.projectLang = _parseProject;
    InterfaceBlock _interfaceBlock = this.projectLang.getInterfaceBlock();
    this.ifaceLang = _interfaceBlock;
    ProjectConverter _projectConverter = new ProjectConverter();
    model.mainLayer.Project _convert = _projectConverter.convert(this.projectLang);
    this.projectMetaModel = _convert;
    Interface _iface = this.projectMetaModel.getIface();
    this.ifaceMetaModel = _iface;
  }
  
  @Test
  public void testInterfaceName() {
    String _name = this.ifaceLang.getName();
    String _name_1 = this.ifaceMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
  }
}
