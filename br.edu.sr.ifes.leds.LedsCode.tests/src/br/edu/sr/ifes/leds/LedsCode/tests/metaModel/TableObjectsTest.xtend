package br.edu.sr.ifes.leds.LedsCode.tests.metaModel

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.generator.ProjectConverter
import java.util.List
import model.applicationLayer.Application
import model.domainLayer.ClassEnum
import model.domainLayer.Domain
import model.domainLayer.Entity
import model.domainLayer.Module
import model.domainLayer.Service
import model.infrastructureLayer.Infrastructure
import model.interfaceLayer.Interface
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class TableObjectsTest extends AbstractTestClass{
	
	Interface iface
	Infrastructure infrastructure
	List<Domain> domains
	List<Application> apps
	List<Module> modules
	List<Entity> entity
	List<Service> services
	List<ClassEnum> enums
	
	@Before
  	def void setUp(){
  		projectLang = parseProject()
  		tableObjects = new ProjectConverter().convert(projectLang);
		
		projectMetaModel = tableObjects.project
		iface = tableObjects.iface
		infrastructure = tableObjects.infrastructure
		domains = tableObjects.domains
		apps = tableObjects.apps
		modules = tableObjects.modules
		entity = tableObjects.entities
		services = tableObjects.services
		enums = tableObjects.enums
  	}	
  	
  	@Test
  	def testProjectNotNull(){
  		assertNotNull(projectMetaModel)
  	}
  	
  	@Test
  	def testInterfaceNotNull(){
  		assertNotNull(iface)
  	}
  	
  	@Test
  	def testInfrastructureNotNull(){
  		assertNotNull(infrastructure)
  	}
  	
  	@Test
  	def testSizeDomains(){
  		assertEquals(1, domains.size)
  	}
  	
  	@Test
  	def testSizeApp(){
  		assertEquals(1, apps.size)
  	}
  	
  	@Test
  	def testSizeModules(){
  		assertEquals(2, modules.size)
  	}
  	
  	@Test
  	def testSizeServices(){
  		assertEquals(1, services.size)
  	}
  	
  	@Test
  	def testSizeEntities(){
  		assertEquals(18, entity.size)
  	}
  	
  	@Test
  	def testSizeEnums(){
  		assertEquals(2, enums.size)
  	}
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
}