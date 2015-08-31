package br.edu.sr.ifes.leds.LedsCode.tests.metaModel

import br.edu.sr.ifes.leds.generator.ProjectConverter
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*
import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import model.interfaceLayer.Interface
import model.infrastructureLayer.Infrastructure
import java.util.Set
import model.domainLayer.Domain
import model.applicationLayer.Application
import model.domainLayer.Module
import model.domainLayer.Entity
import model.domainLayer.Service
import model.domainLayer.ClassEnum

class TableObjectsTest extends AbstractTestClass{
	
	Interface iface
	Infrastructure infrastructure
	Set<Domain> domains
	Set<Application> apps
	Set<Module> modules
	Set<Entity> entity
	Set<Service> services
	Set<ClassEnum> enums
	
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
  		assertEquals(2, domains.size)
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
  		assertEquals(4, services.size)
  	}
  	
  	@Test
  	def testSizeEntities(){
  		assertEquals(8, entity.size)
  	}
  	
  	@Test
  	def testSizeEnums(){
  		assertEquals(4, enums.size)
  	}
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
}