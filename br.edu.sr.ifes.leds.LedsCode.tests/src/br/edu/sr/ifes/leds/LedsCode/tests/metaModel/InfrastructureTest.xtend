package br.edu.sr.ifes.leds.LedsCode.tests.metaModel

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.generator.ProjectConverter
import org.junit.Before
import org.junit.Test
import model.infrastructureLayer.Infrastructure

import static org.junit.Assert.*
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion
import model.infrastructureLayer.Language
import model.infrastructureLayer.LanguageFramework
import model.infrastructureLayer.DatabaseFramework
import model.infrastructureLayer.DataBase
import br.edu.sr.ifes.leds.ledsCodeV001.Database

class InfrastructureTest extends AbstractTestClass{
	
	InfrastructureBlock infraLang
	NameVersion languageLang
	NameVersion frameworkLang
	NameVersion ormLang
	Database dbLang
	
	Infrastructure infraMetaModel
	Language langMetaModel
	LanguageFramework frameworkMetaModel
	DatabaseFramework ormMetaModel
	DataBase dbMetaModel
		
	@Before
  	def void setUp(){
  		projectLang = parseProject()
  		infraLang = projectLang.infrastructureBlock
  		languageLang = infraLang.language
  		frameworkLang = infraLang.framework
  		ormLang = infraLang.orm
  		dbLang = infraLang.database
  		
  		projectMetaModel = new ProjectConverter().convert(projectLang);
  		infraMetaModel = projectMetaModel.infrastructure
  		langMetaModel = infraMetaModel.language
  		frameworkMetaModel = infraMetaModel.languageFramework
  		ormMetaModel = infraMetaModel.dbFramework
  		dbMetaModel = infraMetaModel.dataBase
}
  	
  	@Test
	def testBasePackaga(){
		assertEquals(infraLang.basePackage, infraMetaModel.basePackage)
	}
	
	@Test
	def testProjectVersion(){
		assertEquals(infraLang.projectVersion, infraMetaModel.projectVersion)
	}
	
	@Test
	def testLanguage(){
		assertEquals(languageLang.nameValue, langMetaModel.name)
		assertEquals(languageLang.versionValue, langMetaModel.version)
	}
	
	@Test
	def testframework(){
		assertEquals(frameworkLang.nameValue, frameworkMetaModel.name)
		assertEquals(frameworkLang.versionValue, frameworkMetaModel.version)
	}
	
	@Test
	def testOrm(){
		assertEquals(ormLang.nameValue, ormMetaModel.name)
		assertEquals(ormLang.versionValue, ormMetaModel.version)
	}
	
	@Test
	def testDatabase(){
		assertEquals(dbLang.nameValue, dbMetaModel.name)
		assertEquals(dbLang.versionValue, dbMetaModel.version)
		assertEquals(dbLang.userValue, dbMetaModel.user)
		assertEquals(dbLang.passValue, dbMetaModel.pass)
		assertEquals(dbLang.hostValue, dbMetaModel.host)
		assertEquals(dbLang.envValue, dbMetaModel.environment.valor)
	}
}