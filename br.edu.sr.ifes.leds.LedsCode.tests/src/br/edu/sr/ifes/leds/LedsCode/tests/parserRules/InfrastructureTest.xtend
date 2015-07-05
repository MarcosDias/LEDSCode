package br.edu.sr.ifes.leds.LedsCode.tests.parserRules

import br.edu.sr.ifes.leds.LedsCodeV001InjectorProvider
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL
import br.edu.sr.ifes.leds.ledsCodeV001.Project
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import static br.edu.sr.ifes.leds.LedsCode.factory.ProjectFactory.completeProject

@InjectWith(LedsCodeV001InjectorProvider)
@RunWith(XtextRunner)
class InfrastructureTest {
	
	@Inject
  	ParseHelper<LedsCodeDSL> parser
  	
  	// TODO: Testar a ordem aleatoria dos blocos
	
	@Test
	def testBasePackaga(){
		val infra = parseCompleteInfrastructura()
		
		assertEquals("org.company.exempla", infra.basePackage)
	}
	
	@Test
	def testProjectVersion(){
		val infra = parseCompleteInfrastructura()
		
		assertEquals("0.0.0", infra.projectVersion)
	}
	
	@Test
	def testLanguage(){
		val language = parseCompleteInfrastructura().language
		
		assertEquals("Java", language.nameValue)
		assertEquals("8", language.versionValue)
	}
	
	@Test
	def testframework(){
		val framework = parseCompleteInfrastructura().framework
		
		assertEquals("SpringRoo", framework.nameValue)
		assertEquals("1.2", framework.versionValue)
	}
	
	@Test
	def testOrm(){
		val orm = parseCompleteInfrastructura().orm
		
		assertEquals("Hibernate", orm.nameValue)
		assertEquals("3", orm.versionValue)
	}
	
	@Test
	def testDatabase(){
		val db = parseCompleteInfrastructura().database
		
		assertEquals("Postgres", db.nameValue)
		assertEquals("5", db.versionValue)
		assertEquals("USER", db.userValue)
		assertEquals("123456", db.passValue)
		assertEquals("localhost", db.hostValue)
	}

	def parseCompleteInfrastructura(){
		val model = parser.parse(completeProject())
		val project = model.eAllContents.head as Project
		
		project.infrastructureBlock
	}
}