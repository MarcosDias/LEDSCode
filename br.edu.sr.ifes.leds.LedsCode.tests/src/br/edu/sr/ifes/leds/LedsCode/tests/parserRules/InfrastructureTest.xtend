package br.edu.sr.ifes.leds.LedsCode.tests.parserRules

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.ledsCodeV001.Database
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class InfrastructureTest extends AbstractTestClass{
  	
  	// TODO: Testar a ordem aleatoria dos blocos
  	
  	InfrastructureBlock infra
	NameVersion lang
	NameVersion framework
	NameVersion orm
	Database db
  	
  	@Before
  	def void setUp(){
  		projectLang = parseProject()
  		infra = projectLang.infrastructureBlock
  		lang = infra.language
  		framework = infra.framework
  		orm = infra.orm
  		db = infra.database
  	}
	
	@Test
	def testBasePackaga(){
		assertEquals("org.company.exempla", infra.basePackage)
	}
	
	@Test
	def testProjectVersion(){
		assertEquals("0.0.0", infra.projectVersion)
	}
	
	@Test
	def testLanguage(){
		assertEquals("Java", lang.nameValue)
		assertEquals("8", lang.versionValue)
	}
	
	@Test
	def testframework(){
		assertEquals("SpringRoo", framework.nameValue)
		assertEquals("1.2", framework.versionValue)
	}
	
	@Test
	def testOrm(){
		assertEquals("Hibernate", orm.nameValue)
		assertEquals("3", orm.versionValue)
	}
	
	@Test
	def testDatabase(){
		assertEquals("Postgres", db.nameValue)
		assertEquals("5", db.versionValue)
		assertEquals("USER", db.userValue)
		assertEquals("123456", db.passValue)
		assertEquals("localhost", db.hostValue)
		assertEquals("prod", db.envValue)
	}
}