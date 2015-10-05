package br.edu.sr.ifes.leds.LedsCode.tests.transformador.roo

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import org.junit.Before
import br.edu.sr.ifes.leds.generator.ProjectConverter
import org.junit.Test
import static org.junit.Assert.*
import ctrl.SpringRooCtrl

public class SpringRooCtrlTest extends AbstractTestClass{
	
	SpringRooCtrl  roo
	
	@Before
  	def void setUp(){
  		projectLang = parseProject()
  		tableObjects = new ProjectConverter().convert(projectLang);
		roo = new SpringRooCtrl
		println(roo.createProject(tableObjects))
  	}
  	
  	@Test
  	def testTest(){
  		assertTrue(true)
  	}
}