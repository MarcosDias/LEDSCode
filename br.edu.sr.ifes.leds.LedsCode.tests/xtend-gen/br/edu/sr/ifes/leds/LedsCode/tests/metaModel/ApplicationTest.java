package br.edu.sr.ifes.leds.LedsCode.tests.metaModel;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.generator.ProjectConverter;
import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import java.util.LinkedHashSet;
import model.applicationLayer.Application;
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
}
