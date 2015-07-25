package br.edu.sr.ifes.leds.LedsCode.tests.parserRules

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull

class ProjectTest extends AbstractTestClass{
	
	@Before
  	def void setUp(){
  		projectLang = parseProject()
  	}
		
	@Test
	def notNullRules(){
		assertEquals("Projeto", projectLang.name)
	    assertNotNull(projectLang.infrastructureBlock)
	    assertNotNull(projectLang.interfaceBlock)
	    assertNotNull(projectLang.domainBlock)
	    assertNotNull(projectLang.applicationBlock)
	}
	
	// TODO: Testar a ordem aleatoria dos blocos
}