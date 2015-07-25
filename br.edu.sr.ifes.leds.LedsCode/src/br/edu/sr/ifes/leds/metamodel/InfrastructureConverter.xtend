package br.edu.sr.ifes.leds.metamodel

import br.edu.sr.ifes.leds.ledsCodeV001.Database
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion
import model.infrastructureLayer.Infrastructure
import model.infrastructureLayer.Language
import model.infrastructureLayer.LanguageFramework
import model.infrastructureLayer.DatabaseFramework
import model.infrastructureLayer.DataBase
import model.infrastructureLayer.Environment

class InfrastructureConverter {
	
	Infrastructure infraMetaModel
	
	def convert(InfrastructureBlock infraLang){
	 	infraMetaModel.basePackage = infraLang.basePackage
	 	infraMetaModel.projectVersion = infraLang.projectVersion
	 	infraMetaModel.language = this.convertLanguage(infraLang.language)
	 	infraMetaModel.languageFramework = this.convertLangFramework(infraLang.framework)
	 	infraMetaModel.dbFramework = this.convertOrm(infraLang.orm)
	 	infraMetaModel.dataBase = this.convertDatabase(infraLang.database)
	 	
	 	infraMetaModel
	}
	
	def convertDatabase(Database dbLang) {
		var dbMetaModel = new DataBase
		dbMetaModel.name = dbLang.nameValue
		dbMetaModel.version = dbLang.versionValue
		dbMetaModel.user = dbLang.userValue
		dbMetaModel.pass = dbLang.passValue
		dbMetaModel.host = dbLang.hostValue
		dbMetaModel.environment = Environment.fromString(dbLang.envValue)
		dbMetaModel
	}
	
	
	private def convertOrm(NameVersion ormLang) {
		var ormMetaModel = new DatabaseFramework
		ormMetaModel.name = ormLang.nameValue
		ormMetaModel.version = ormLang.versionValue
		ormMetaModel
	}
	
	private def convertLangFramework(NameVersion languageframeworkLang) {
		var langFramework = new LanguageFramework
		langFramework.name = languageframeworkLang.nameValue
		langFramework.version = languageframeworkLang.versionValue
		langFramework
	}
	
	private def convertLanguage(NameVersion languageLang) {
		var langMetaModel = new Language
		langMetaModel.name = languageLang.nameValue
		langMetaModel.version = languageLang.versionValue
		langMetaModel
	}
	
	new(){
		infraMetaModel = new Infrastructure()
	}
}