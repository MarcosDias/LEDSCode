package br.edu.sr.ifes.leds.metamodel

import br.edu.sr.ifes.leds.ledsCodeV001.Database
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion
import br.edu.sr.ifes.leds.ledsCodeV001.Project
import br.edu.sr.ifes.leds.model.infrastructureLayer.DataBase
import br.edu.sr.ifes.leds.model.infrastructureLayer.DatabaseFramework
import br.edu.sr.ifes.leds.model.infrastructureLayer.Environment
import br.edu.sr.ifes.leds.model.infrastructureLayer.Infrastructure
import br.edu.sr.ifes.leds.model.infrastructureLayer.Language
import br.edu.sr.ifes.leds.model.infrastructureLayer.LanguageFramework

class InfrastructureConverter {
	
	Infrastructure infraMetaModel
	Project projectLang
	br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel
	
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
	
	new(Project projectLang, br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel) {
		this.projectLang = projectLang
		this.projectMetaModel = projectMetaModel
		this.infraMetaModel = new Infrastructure()	
	}
	
}