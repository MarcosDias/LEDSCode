package br.edu.sr.ifes.leds.LedsCode.tests.metaModel;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.generator.ProjectConverter;
import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import model.applicationLayer.Application;
import model.applicationLayer.SpecificApplicationDomain;
import model.applicationLayer.SpecificApplicationModule;
import model.domainLayer.Domain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class ApplicationTest extends AbstractTestClass {
  private EList<ApplicationBlock> appLang;
  
  private ApplicationBlock singleAppLang;
  
  private String singleAppDomainLang;
  
  private LinkedHashSet<Application> appMetaModel;
  
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
    model.mainLayer.Project _convert = _projectConverter.convert(this.projectLang);
    this.projectMetaModel = _convert;
    LinkedHashSet<Application> _applications = this.projectMetaModel.getApplications();
    this.appMetaModel = _applications;
    Application _get_2 = ((Application[])Conversions.unwrapArray(this.appMetaModel, Application.class))[0];
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
    LinkedHashSet<SpecificApplicationDomain> _structure = this.singleAppMetalModel.getStructure();
    int _size = _structure.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testApplicationDomain() {
    String[] _split = this.singleAppDomainLang.split("\\.");
    List<String> _asList = Arrays.<String>asList(_split);
    ArrayList<String> strutureAppLang = new ArrayList<String>(_asList);
    String _get = strutureAppLang.get(0);
    String _string = _get.toString();
    LinkedHashSet<SpecificApplicationDomain> _structure = this.singleAppMetalModel.getStructure();
    SpecificApplicationDomain _get_1 = ((SpecificApplicationDomain[])Conversions.unwrapArray(_structure, SpecificApplicationDomain.class))[0];
    Domain _domain = _get_1.getDomain();
    String _name = _domain.getName();
    Assert.assertEquals(_string, _name);
    LinkedHashSet<SpecificApplicationDomain> _structure_1 = this.singleAppMetalModel.getStructure();
    SpecificApplicationDomain _get_2 = ((SpecificApplicationDomain[])Conversions.unwrapArray(_structure_1, SpecificApplicationDomain.class))[0];
    SpecificApplicationModule _son = _get_2.getSon();
    Assert.assertNotNull(_son);
  }
}
