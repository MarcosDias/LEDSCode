package br.edu.sr.ifes.leds.LedsCode.tests.parserRules;

import br.edu.sr.ifes.leds.LedsCode.tests.parserRules.AbstractTestClass;
import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class ApplicationTest extends AbstractTestClass {
  private EList<ApplicationBlock> app;
  
  private ApplicationBlock singleApp;
  
  private String singleAppDomain;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.project = _parseProject;
    EList<ApplicationBlock> _applicationBlock = this.project.getApplicationBlock();
    this.app = _applicationBlock;
    ApplicationBlock _get = this.app.get(0);
    this.singleApp = _get;
    EList<String> _applicationDomain = this.singleApp.getApplicationDomain();
    String _get_1 = _applicationDomain.get(0);
    this.singleAppDomain = _get_1;
  }
  
  @Test
  public void testQtdApplication() {
    int _size = this.app.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testApplicationName() {
    String _name = this.singleApp.getName();
    Assert.assertEquals("LibraryPersonApp", _name);
  }
  
  @Test
  public void testQtdApplicationDomain() {
    EList<String> _applicationDomain = this.singleApp.getApplicationDomain();
    int _size = _applicationDomain.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testApplicationDomain() {
    Assert.assertEquals("Library.*", this.singleAppDomain);
  }
}
