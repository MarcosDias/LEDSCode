package br.edu.sr.ifes.leds.LedsCode.tests.parserRules

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.ledsCodeV001.Attribute
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock
import br.edu.sr.ifes.leds.ledsCodeV001.Repository
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod
import org.eclipse.emf.common.util.EList
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*
import br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock

class DomainTest extends AbstractTestClass{
	
	EList<DomainBlock> domain
	DomainBlock singleDom
	ModuleBlock singleModule
	ServiceBlock singleService
	ServiceMethod fieldSingleService
	EntityBlock singleEntity
	Attribute singleAttr
	Repository repository	
	RepositoryFields fieldRepository	
	EnumBlock singleEnum
	
	@Before
	def void setUp(){
		projectLang = parseProject
		domain = projectLang.domainBlock
		singleDom = domain.get(0)
		singleModule = singleDom.module.get(0)
		singleService = singleModule.serviceBlock.get(0)
		fieldSingleService = singleService.serviceFields.get(0)
		singleEntity = singleModule.entityBlock.get(0)
		singleAttr = singleEntity.attributes.get(0)
		repository = singleEntity.repository
		fieldRepository = repository.methods.get(0)
		singleEnum = singleModule.enumBlock.get(0)
	}
	
	@Test
	def testQtdDomain(){
		assertEquals(2, domain.size)
	}
	
  	@Test
  	def testDomainName(){	
		assertEquals("Domain1", singleDom.name)
  	}
  	
  	@Test
  	def testQtdModule(){
  		assertEquals(1, singleDom.module.size)
  	}
  	
  	@Test
  	def testModuleName(){
  		assertEquals("Module", singleModule.name)
  	}
  	
  	@Test
  	def testQtdServices(){
  		assertEquals(2, singleModule.serviceBlock.size)
  	}
  	
  	@Test
  	def testServiceName(){
  		assertEquals("LibraryService", singleService.name)
  	}
  	
  	@Test
  	def testQtdServicesFields(){
  		assertEquals(2, singleService.serviceFields.size)
  	}
  	
  	@Test
  	def testNameServiceField(){
		assertEquals("findLibraryByName", fieldSingleService.name)
		assertEquals("Media.MediaRepository.findMediaByCharacter", fieldSingleService.methodAcess)
  	}
  	
  	@Test
  	def testQtdEntity(){
  		assertEquals(4, singleModule.entityBlock.size)
  	}
  	
  	@Test
  	def testAssinaturaEntity(){
  		assertEquals("Media", singleEntity.name)
  		assertTrue(singleEntity.isIsAbstract)
  		assertNull(singleEntity.acessModifier)
  	}
  	
  	@Test
  	def testQtdInheritanceClass(){
  		assertEquals(2, singleEntity.classExtends.values.size)
  	}
  	
  	@Test
  	def testInheritanceClass(){
  		for(superClass : singleEntity.classExtends.values){
  			assertTrue(superClass.contains("SuperClass"))
  		}
  	}
  	
  	@Test
  	def testQtdAttributes(){
  		assertEquals(3, singleEntity.attributes.size)
  	}
  	
  	@Test
  	def testAttributes(){
		assertTrue("private -".contains(singleAttr.acessModifier))
		assertEquals("String", singleAttr.type)
		assertEquals("titleb", singleAttr.name)
  	}
  	

  	@Test
  	def testConstraintsFirtsAttr(){
  		// entity Media
  	  	var first = singleEntity.attributes.get(0)
  	  	assertTrue(first.pk)
  	  	assertEquals(50, first.max)
  	}
  	
  	@Test
  	def testConstraintsSecundAttr(){
  		// entity Media
  	  	var secund = singleEntity.attributes.get(1)
  	  	assertEquals('false', secund.nullable)
  	}
  	
  	@Test
  	def testcConstraintsThirdAttr(){
  		// entity Media
  	  	var third = singleEntity.attributes.get(2)
  	  	assertEquals('true', third.unique)
  	  	assertEquals(10, third.min)
  	  	assertEquals(25, third.max)    	  	
  	}
  	
  	@Test
  	def testRepositoryEntityName(){
  		assertEquals("MediaRepository", repository.name)
  	}
  	
  	@Test
  	def testQtdRepositoryFields(){
  		assertEquals(2, repository.methods.size)
  	}
  	
  	@Test
  	def testRepositoryFields(){
  		val methodParameter = fieldRepository.methodsParameters.typeAndAttr.get(0)
  		
  		assertEquals("findMediaByCharacter", fieldRepository.nameMethod)
  		assertEquals("List<Media>", fieldRepository.returnType)
  		assertEquals("String", methodParameter.type)
  		assertEquals("characterName", methodParameter.name)
  	}
  	
  	@Test
  	def testQtdEnums(){
  		assertEquals(2, singleModule.enumBlock.size)
  	}
  	
  	@Test
  	def testEnumName(){
  		assertEquals("Gender", singleEnum.name)
  	}
  	
  	@Test
  	def testQtdValuesEnums(){
  		assertEquals(2, singleEnum.values.size)
  	}
  	
  	@Test
  	def testValuesEnum(){
  		val valueEnum = singleEnum.values.get(0)
		assertEquals("FEMALE", valueEnum)  		
  	}
}