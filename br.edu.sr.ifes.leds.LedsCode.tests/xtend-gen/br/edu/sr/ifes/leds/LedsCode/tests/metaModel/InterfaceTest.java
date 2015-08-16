package br.edu.sr.ifes.leds.LedsCode.tests.metaModel;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.generator.ProjectConverter;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import java.util.LinkedHashSet;
import model.applicationLayer.Application;
import model.interfaceLayer.Interface;
import model.interfaceLayer.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class InterfaceTest extends AbstractTestClass {
  private InterfaceBlock ifaceLang;
  
  private InterfaceApplication ifaceFieldLang;
  
  private Interface ifaceMetaModel;
  
  private model.interfaceLayer.InterfaceApplication ifaceFieldMetaModel;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.projectLang = _parseProject;
    InterfaceBlock _interfaceBlock = this.projectLang.getInterfaceBlock();
    this.ifaceLang = _interfaceBlock;
    EList<InterfaceApplication> _interfaceApplication = this.ifaceLang.getInterfaceApplication();
    InterfaceApplication _get = _interfaceApplication.get(0);
    this.ifaceFieldLang = _get;
    ProjectConverter _projectConverter = new ProjectConverter();
    model.mainLayer.Project _convert = _projectConverter.convert(this.projectLang);
    this.projectMetaModel = _convert;
    Interface _iface = this.projectMetaModel.getIface();
    this.ifaceMetaModel = _iface;
    LinkedHashSet<model.interfaceLayer.InterfaceApplication> _interfaceApplication_1 = this.ifaceMetaModel.getInterfaceApplication();
    model.interfaceLayer.InterfaceApplication _get_1 = ((model.interfaceLayer.InterfaceApplication[])Conversions.unwrapArray(_interfaceApplication_1, model.interfaceLayer.InterfaceApplication.class))[0];
    this.ifaceFieldMetaModel = _get_1;
  }
  
  @Test
  public void testInterfaceName() {
    String _name = this.ifaceLang.getName();
    String _name_1 = this.ifaceMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
  }
  
  @Test
  public void testQtdInterfaceField() {
    EList<InterfaceApplication> _interfaceApplication = this.ifaceLang.getInterfaceApplication();
    int _size = _interfaceApplication.size();
    LinkedHashSet<model.interfaceLayer.InterfaceApplication> _interfaceApplication_1 = this.ifaceMetaModel.getInterfaceApplication();
    int _size_1 = _interfaceApplication_1.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testTypeInterfaceFields() {
    String _type = this.ifaceFieldLang.getType();
    Type _type_1 = this.ifaceFieldMetaModel.getType();
    String _valor = _type_1.getValor();
    Assert.assertEquals(_type, _valor);
    String _name = this.ifaceFieldLang.getName();
    String _name_1 = this.ifaceFieldMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
    String _nameApp = this.ifaceFieldLang.getNameApp();
    Application _application = this.ifaceFieldMetaModel.getApplication();
    String _name_2 = _application.getName();
    Assert.assertEquals(_nameApp, _name_2);
  }
}
