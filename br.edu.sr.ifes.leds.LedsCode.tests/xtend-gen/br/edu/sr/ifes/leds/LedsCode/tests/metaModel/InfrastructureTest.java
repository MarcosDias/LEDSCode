package br.edu.sr.ifes.leds.LedsCode.tests.metaModel;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.generator.ProjectConverter;
import br.edu.sr.ifes.leds.ledsCodeV001.Database;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import model.infrastructureLayer.DataBase;
import model.infrastructureLayer.DatabaseFramework;
import model.infrastructureLayer.Environment;
import model.infrastructureLayer.Infrastructure;
import model.infrastructureLayer.Language;
import model.infrastructureLayer.LanguageFramework;
import model.mainLayer.TableObjects;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class InfrastructureTest extends AbstractTestClass {
  private InfrastructureBlock infraLang;
  
  private NameVersion languageLang;
  
  private NameVersion frameworkLang;
  
  private NameVersion ormLang;
  
  private Database dbLang;
  
  private Infrastructure infraMetaModel;
  
  private Language langMetaModel;
  
  private LanguageFramework frameworkMetaModel;
  
  private DatabaseFramework ormMetaModel;
  
  private DataBase dbMetaModel;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.projectLang = _parseProject;
    InfrastructureBlock _infrastructureBlock = this.projectLang.getInfrastructureBlock();
    this.infraLang = _infrastructureBlock;
    NameVersion _language = this.infraLang.getLanguage();
    this.languageLang = _language;
    NameVersion _framework = this.infraLang.getFramework();
    this.frameworkLang = _framework;
    NameVersion _orm = this.infraLang.getOrm();
    this.ormLang = _orm;
    Database _database = this.infraLang.getDatabase();
    this.dbLang = _database;
    ProjectConverter _projectConverter = new ProjectConverter();
    TableObjects _convert = _projectConverter.convert(this.projectLang);
    this.tableObjects = _convert;
    model.mainLayer.Project _project = this.tableObjects.getProject();
    this.projectMetaModel = _project;
    Infrastructure _infrastructure = this.projectMetaModel.getInfrastructure();
    this.infraMetaModel = _infrastructure;
    Language _language_1 = this.infraMetaModel.getLanguage();
    this.langMetaModel = _language_1;
    LanguageFramework _languageFramework = this.infraMetaModel.getLanguageFramework();
    this.frameworkMetaModel = _languageFramework;
    DatabaseFramework _dbFramework = this.infraMetaModel.getDbFramework();
    this.ormMetaModel = _dbFramework;
    DataBase _dataBase = this.infraMetaModel.getDataBase();
    this.dbMetaModel = _dataBase;
  }
  
  @Test
  public void testBasePackaga() {
    String _basePackage = this.infraLang.getBasePackage();
    String _basePackage_1 = this.infraMetaModel.getBasePackage();
    Assert.assertEquals(_basePackage, _basePackage_1);
  }
  
  @Test
  public void testProjectVersion() {
    String _projectVersion = this.infraLang.getProjectVersion();
    String _projectVersion_1 = this.infraMetaModel.getProjectVersion();
    Assert.assertEquals(_projectVersion, _projectVersion_1);
  }
  
  @Test
  public void testLanguage() {
    String _nameValue = this.languageLang.getNameValue();
    String _name = this.langMetaModel.getName();
    Assert.assertEquals(_nameValue, _name);
    String _versionValue = this.languageLang.getVersionValue();
    String _version = this.langMetaModel.getVersion();
    Assert.assertEquals(_versionValue, _version);
  }
  
  @Test
  public void testframework() {
    String _nameValue = this.frameworkLang.getNameValue();
    String _name = this.frameworkMetaModel.getName();
    Assert.assertEquals(_nameValue, _name);
    String _versionValue = this.frameworkLang.getVersionValue();
    String _version = this.frameworkMetaModel.getVersion();
    Assert.assertEquals(_versionValue, _version);
  }
  
  @Test
  public void testOrm() {
    String _nameValue = this.ormLang.getNameValue();
    String _name = this.ormMetaModel.getName();
    Assert.assertEquals(_nameValue, _name);
    String _versionValue = this.ormLang.getVersionValue();
    String _version = this.ormMetaModel.getVersion();
    Assert.assertEquals(_versionValue, _version);
  }
  
  @Test
  public void testDatabase() {
    String _nameValue = this.dbLang.getNameValue();
    String _name = this.dbMetaModel.getName();
    Assert.assertEquals(_nameValue, _name);
    String _versionValue = this.dbLang.getVersionValue();
    String _version = this.dbMetaModel.getVersion();
    Assert.assertEquals(_versionValue, _version);
    String _userValue = this.dbLang.getUserValue();
    String _user = this.dbMetaModel.getUser();
    Assert.assertEquals(_userValue, _user);
    String _passValue = this.dbLang.getPassValue();
    String _pass = this.dbMetaModel.getPass();
    Assert.assertEquals(_passValue, _pass);
    String _hostValue = this.dbLang.getHostValue();
    String _host = this.dbMetaModel.getHost();
    Assert.assertEquals(_hostValue, _host);
    String _envValue = this.dbLang.getEnvValue();
    Environment _environment = this.dbMetaModel.getEnvironment();
    String _valor = _environment.getValor();
    Assert.assertEquals(_envValue, _valor);
  }
}
