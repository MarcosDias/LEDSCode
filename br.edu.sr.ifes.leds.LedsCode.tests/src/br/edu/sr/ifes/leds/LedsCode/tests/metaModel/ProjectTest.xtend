package br.edu.sr.ifes.leds.LedsCode.tests.metaModel

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.generator.ProjectConverter
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class ProjectTest extends AbstractTestClass{
		
	@Before
  	def void setUp(){
  		projectLang = parseProject()
  		projectMetaModel = new ProjectConverter().convert(projectLang);
  	}	
  	
  	@Test
  	def testProject(){
  		assertEquals(projectLang.name, projectMetaModel.getName())
  		assertNotNull(projectMetaModel.created)
	    assertNotNull(projectMetaModel.domains)
  		assertNotNull(projectMetaModel.infrastructure)
	    assertNotNull(projectMetaModel.applications)
	    assertNotNull(projectMetaModel.iface)
  	}
}