package br.edu.sr.ifes.leds.metamodel;

import br.edu.sr.ifes.leds.ledsCodeV001.Database;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.model.infrastructureLayer.DataBase;
import br.edu.sr.ifes.leds.model.infrastructureLayer.DatabaseFramework;
import br.edu.sr.ifes.leds.model.infrastructureLayer.Environment;
import br.edu.sr.ifes.leds.model.infrastructureLayer.Infrastructure;
import br.edu.sr.ifes.leds.model.infrastructureLayer.Language;
import br.edu.sr.ifes.leds.model.infrastructureLayer.LanguageFramework;

@SuppressWarnings("all")
public class InfrastructureConverter {
  private Infrastructure infraMetaModel;
  
  private Project projectLang;
  
  private br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel;
  
  public Infrastructure convert(final InfrastructureBlock infraLang) {
    Infrastructure _xblockexpression = null;
    {
      String _basePackage = infraLang.getBasePackage();
      this.infraMetaModel.setBasePackage(_basePackage);
      String _projectVersion = infraLang.getProjectVersion();
      this.infraMetaModel.setProjectVersion(_projectVersion);
      NameVersion _language = infraLang.getLanguage();
      Language _convertLanguage = this.convertLanguage(_language);
      this.infraMetaModel.setLanguage(_convertLanguage);
      NameVersion _framework = infraLang.getFramework();
      LanguageFramework _convertLangFramework = this.convertLangFramework(_framework);
      this.infraMetaModel.setLanguageFramework(_convertLangFramework);
      NameVersion _orm = infraLang.getOrm();
      DatabaseFramework _convertOrm = this.convertOrm(_orm);
      this.infraMetaModel.setDbFramework(_convertOrm);
      Database _database = infraLang.getDatabase();
      DataBase _convertDatabase = this.convertDatabase(_database);
      this.infraMetaModel.setDataBase(_convertDatabase);
      _xblockexpression = this.infraMetaModel;
    }
    return _xblockexpression;
  }
  
  public DataBase convertDatabase(final Database dbLang) {
    DataBase _xblockexpression = null;
    {
      DataBase dbMetaModel = new DataBase();
      String _nameValue = dbLang.getNameValue();
      dbMetaModel.setName(_nameValue);
      String _versionValue = dbLang.getVersionValue();
      dbMetaModel.setVersion(_versionValue);
      String _userValue = dbLang.getUserValue();
      dbMetaModel.setUser(_userValue);
      String _passValue = dbLang.getPassValue();
      dbMetaModel.setPass(_passValue);
      String _hostValue = dbLang.getHostValue();
      dbMetaModel.setHost(_hostValue);
      String _envValue = dbLang.getEnvValue();
      Environment _fromString = Environment.fromString(_envValue);
      dbMetaModel.setEnvironment(_fromString);
      _xblockexpression = dbMetaModel;
    }
    return _xblockexpression;
  }
  
  private DatabaseFramework convertOrm(final NameVersion ormLang) {
    DatabaseFramework _xblockexpression = null;
    {
      DatabaseFramework ormMetaModel = new DatabaseFramework();
      String _nameValue = ormLang.getNameValue();
      ormMetaModel.setName(_nameValue);
      String _versionValue = ormLang.getVersionValue();
      ormMetaModel.setVersion(_versionValue);
      _xblockexpression = ormMetaModel;
    }
    return _xblockexpression;
  }
  
  private LanguageFramework convertLangFramework(final NameVersion languageframeworkLang) {
    LanguageFramework _xblockexpression = null;
    {
      LanguageFramework langFramework = new LanguageFramework();
      String _nameValue = languageframeworkLang.getNameValue();
      langFramework.setName(_nameValue);
      String _versionValue = languageframeworkLang.getVersionValue();
      langFramework.setVersion(_versionValue);
      _xblockexpression = langFramework;
    }
    return _xblockexpression;
  }
  
  private Language convertLanguage(final NameVersion languageLang) {
    Language _xblockexpression = null;
    {
      Language langMetaModel = new Language();
      String _nameValue = languageLang.getNameValue();
      langMetaModel.setName(_nameValue);
      String _versionValue = languageLang.getVersionValue();
      langMetaModel.setVersion(_versionValue);
      _xblockexpression = langMetaModel;
    }
    return _xblockexpression;
  }
  
  public InfrastructureConverter(final Project projectLang, final br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel) {
    this.projectLang = projectLang;
    this.projectMetaModel = projectMetaModel;
    Infrastructure _infrastructure = new Infrastructure();
    this.infraMetaModel = _infrastructure;
  }
}
