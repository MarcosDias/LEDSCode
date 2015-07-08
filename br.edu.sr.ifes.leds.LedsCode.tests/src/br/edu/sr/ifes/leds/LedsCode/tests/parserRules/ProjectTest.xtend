package br.edu.sr.ifes.leds.LedsCode.tests.parserRules

import br.edu.sr.ifes.leds.ledsCodeV001.Project
import org.junit.Before
import org.junit.Test

import static br.edu.sr.ifes.leds.LedsCode.factory.ProjectFactory.completeProject
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull

class ProjectTest extends AbstractTestClass{
	
	@Before
  	def void setUp(){
  		project = parseProject()
  	}
		
	@Test
	def notNullRules(){
		//val praoject = parseProject()
		
		assertEquals("Projeto", project.name)
	    assertNotNull(project.infrastructureBlock)
	    assertNotNull(project.interfaceBlock)
	    assertNotNull(project.domainBlock)
	    assertNotNull(project.applicationBlock)
	}
	
	// TODO: Testar a ordem aleatoria dos blocos
}