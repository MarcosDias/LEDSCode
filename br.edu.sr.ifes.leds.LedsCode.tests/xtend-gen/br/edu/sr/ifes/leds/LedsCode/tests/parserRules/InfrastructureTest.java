package br.edu.sr.ifes.leds.LedsCode.tests.parserRules;

import br.edu.sr.ifes.leds.LedsCode.tests.parserRules.AbstractTestClass;
import br.edu.sr.ifes.leds.ledsCodeV001.Database;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class InfrastructureTest extends AbstractTestClass {
  private InfrastructureBlock infra;
  
  private NameVersion lang;
  
  private NameVersion framework;
  
  private NameVersion orm;
  
  private Database db;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.project = _parseProject;
    InfrastructureBlock _infrastructureBlock = this.project.getInfrastructureBlock();
    this.infra = _infrastructureBlock;
    NameVersion _language = this.infra.getLanguage();
    this.lang = _language;
    NameVersion _framework = this.infra.getFramework();
    this.framework = _framework;
    NameVersion _orm = this.infra.getOrm();
    this.orm = _orm;
    Database _database = this.infra.getDatabase();
    this.db = _database;
  }
  
  @Test
  public void testBasePackaga() {
    String _basePackage = this.infra.getBasePackage();
    Assert.assertEquals("org.company.exempla", _basePackage);
  }
  
  @Test
  public void testProjectVersion() {
    String _projectVersion = this.infra.getProjectVersion();
    Assert.assertEquals("0.0.0", _projectVersion);
  }
  
  @Test
  public void testLanguage() {
    String _nameValue = this.lang.getNameValue();
    Assert.assertEquals("Java", _nameValue);
    String _versionValue = this.lang.getVersionValue();
    Assert.assertEquals("8", _versionValue);
  }
  
  @Test
  public void testframework() {
    String _nameValue = this.framework.getNameValue();
    Assert.assertEquals("SpringRoo", _nameValue);
    String _versionValue = this.framework.getVersionValue();
    Assert.assertEquals("1.2", _versionValue);
  }
  
  @Test
  public void testOrm() {
    String _nameValue = this.orm.getNameValue();
    Assert.assertEquals("Hibernate", _nameValue);
    String _versionValue = this.orm.getVersionValue();
    Assert.assertEquals("3", _versionValue);
  }
  
  @Test
  public void testDatabase() {
    String _nameValue = this.db.getNameValue();
    Assert.assertEquals("Postgres", _nameValue);
    String _versionValue = this.db.getVersionValue();
    Assert.assertEquals("5", _versionValue);
    String _userValue = this.db.getUserValue();
    Assert.assertEquals("USER", _userValue);
    String _passValue = this.db.getPassValue();
    Assert.assertEquals("123456", _passValue);
    String _hostValue = this.db.getHostValue();
    Assert.assertEquals("localhost", _hostValue);
  }
}
