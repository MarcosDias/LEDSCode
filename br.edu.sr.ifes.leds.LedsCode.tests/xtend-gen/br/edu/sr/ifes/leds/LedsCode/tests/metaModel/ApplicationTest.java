package br.edu.sr.ifes.leds.LedsCode.tests.metaModel;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.generator.ProjectConverter;
import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.applicationLayer.Application;
import model.applicationLayer.SpecificApplicationDomain;
import model.applicationLayer.SpecificApplicationModule;
import model.domainLayer.Domain;
import model.mainLayer.TableObjects;
import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class ApplicationTest extends AbstractTestClass {
  private EList<ApplicationBlock> appLang;
  
  private ApplicationBlock singleAppLang;
  
  private String singleAppDomainLang;
  
  private List<Application> appMetaModel;
  
  private Application singleAppMetalModel;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.projectLang = _parseProject;
    EList<ApplicationBlock> _applicationBlock = this.projectLang.getApplicationBlock();
    this.appLang = _applicationBlock;
    ApplicationBlock _get = this.appLang.get(0);
    this.singleAppLang = _get;
    EList<String> _applicationDomain = this.singleAppLang.getApplicationDomain();
    String _get_1 = _applicationDomain.get(0);
    this.singleAppDomainLang = _get_1;
    ProjectConverter _projectConverter = new ProjectConverter();
    TableObjects _convert = _projectConverter.convert(this.projectLang);
    this.tableObjects = _convert;
    model.mainLayer.Project _project = this.tableObjects.getProject();
    this.projectMetaModel = _project;
    List<Application> _applications = this.projectMetaModel.getApplications();
    this.appMetaModel = _applications;
    Application _get_2 = this.appMetaModel.get(0);
    this.singleAppMetalModel = _get_2;
  }
  
  @Test
  public void testQtdApplication() {
    int _size = this.appLang.size();
    int _size_1 = this.appMetaModel.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testApplicationName() {
    String _name = this.singleAppLang.getName();
    String _name_1 = this.singleAppMetalModel.getName();
    Assert.assertEquals(_name, _name_1);
  }
  
  @Test
  public void testQtdApplicationDomain() {
    List<SpecificApplicationDomain> _structure = this.singleAppMetalModel.getStructure();
    int _size = _structure.size();
    Assert.assertEquals(1, _size);
  }
  
  @Test
  public void testApplicationDomain() {
    String[] _split = this.singleAppDomainLang.split("\\.");
    List<String> _asList = Arrays.<String>asList(_split);
    ArrayList<String> strutureAppLang = new ArrayList<String>(_asList);
    String _get = strutureAppLang.get(0);
    String _string = _get.toString();
    List<SpecificApplicationDomain> _structure = this.singleAppMetalModel.getStructure();
    SpecificApplicationDomain _get_1 = _structure.get(0);
    Domain _domain = _get_1.getDomain();
    String _name = _domain.getName();
    Assert.assertEquals(_string, _name);
    List<SpecificApplicationDomain> _structure_1 = this.singleAppMetalModel.getStructure();
    SpecificApplicationDomain _get_2 = _structure_1.get(0);
    SpecificApplicationModule _son = _get_2.getSon();
    Assert.assertNull(_son);
  }
}
