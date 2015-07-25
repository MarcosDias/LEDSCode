package br.edu.sr.ifes.leds.LedsCode.tests.metaModel

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock
import br.edu.sr.ifes.leds.ledsCodeV001.Module
import br.edu.sr.ifes.leds.ledsCodeV001.Repository
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod
import org.eclipse.emf.common.util.EList
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*
import br.edu.sr.ifes.leds.ledsCodeV001.Attribute
import br.edu.sr.ifes.leds.generator.ProjectConverter
import java.util.Set
import model.domainLayer.Domain
import model.domainLayer.Entity

class DomainTest extends AbstractTestClass{
	
	EList<DomainBlock> domainLang
	DomainBlock singleDomLang
	Module singleModuleLang
	ServiceBlock singleServiceLang
	ServiceMethod fieldSingleServiceLang
	EntityBlock singleEntityLang
	Attribute singleAttrLang
	Repository repositoryLang
	RepositoryFields fieldRepositoryLang	
	EnumBlock singleEnumLang
	
	Set<Domain> domainMetaModel
	Domain singleDomMetaModel
	model.domainLayer.Module singleModuleMetaModel
	Entity singleEntityMetaModel
	model.domainLayer.Attribute singleAttrMetaModel
	
	model.domainLayer.Repository repositoryMetaModel
	
	@Before
	def void setUp(){
		projectLang = parseProject
		domainLang = projectLang.domainBlock
		singleDomLang = domainLang.get(0)
		singleModuleLang = singleDomLang.module.get(0)
		singleServiceLang = singleModuleLang.serviceBlock.get(0)
		fieldSingleServiceLang = singleServiceLang.serviceFields.get(0)
		singleEntityLang = singleModuleLang.entityBlock.get(0)
		singleAttrLang = singleEntityLang.attributes.get(0)
		repositoryLang = singleEntityLang.repository
		fieldRepositoryLang = repositoryLang.methods.get(0)
		singleEnumLang = singleModuleLang.enumBlock.get(0)
		
		projectMetaModel = new ProjectConverter().convert(projectLang);
		domainMetaModel = projectMetaModel.domains
		singleDomMetaModel = domainMetaModel.get(0)
		singleModuleMetaModel = singleDomMetaModel.modules.get(0)
		//TODO - Servicos
		singleEntityMetaModel = singleModuleMetaModel.entities.get(0)
		singleAttrMetaModel = singleEntityMetaModel.attributes.get(0)
		repositoryMetaModel = singleEntityMetaModel.repository
	}
	
	@Test
	def testNotEmptyDomains(){
		assertFalse(domainMetaModel.isEmpty)
	}
	
	@Test
	def testQtdDomain(){
		assertEquals(domainLang.size, domainMetaModel.size)
	}
	
  	@Test
  	def testDomainName(){	
		assertTrue(singleDomLang.name.equals(singleDomMetaModel.name))
  	}
  	
  	@Test
  	def testQtdModule(){
  		assertEquals(singleDomLang.module.size, singleDomMetaModel.modules.size)
  	}
  	
  	@Test
  	def testModuleName(){
  		assertEquals(singleModuleLang.name, singleModuleMetaModel.name)
  	}
  	
  	/*@Test
  	def testQtdServices(){
  		assertEquals(2, singleModule.serviceBlock.size)
  	}
  	
  	@Test
  	def testServiceName(){
  		assertEquals("LibraryService", singleService.name)
  	}
  	
  	@Test
  	def testQtdServicesFields(){
  		assertEquals(4, singleService.serviceFields.size)
  	}
  	
  	@Test
  	def testNameServiceField(){
		assertEquals("findLibraryByName", fieldSingleService.name)
		assertEquals("Library.LibraryRepository.findLibraryByName", fieldSingleService.methodAcess)
  	}*/
  	
  	@Test
  	def testQtdEntity(){
  		assertEquals(singleModuleLang.entityBlock.size, singleModuleMetaModel.entities.size)
  	}
  	
  	@Test
  	def testAssinaturaEntity(){
  		assertEquals(singleEntityLang.name, singleEntityMetaModel.name)
  		assertEquals(singleEntityLang.isIsAbstract, singleEntityMetaModel.abstrato)
  		assertEquals(singleEntityLang.acessModifier, singleEntityMetaModel.accessModifier)
  		assertTrue(singleEntityMetaModel.abstrato)
  		assertNull(singleEntityMetaModel.accessModifier)
  	}
  	
  	@Test
  	def testQtdInheritanceClass(){
  		assertEquals(singleEntityLang.classExtends.values.size, singleEntityMetaModel.classExtends.size)
  	}
  	
  	@Test
  	def testInheritanceClass(){
  		for(superClass : singleEntityMetaModel.classExtends){
  			assertTrue(superClass.name.contains("SuperClass"))
  		}
  	}
  	
  	@Test
  	def testQtdAttributes(){
  		assertEquals(singleEntityLang.attributes.size, singleEntityMetaModel.attributes.size)
  	}
  	
  	@Test
  	def testAttributes(){
		assertTrue(singleAttrLang.acessModifier.equalsIgnoreCase(
				singleAttrMetaModel.accessModifier.toString
			)
		)
		assertEquals(singleAttrLang.type.toString, singleAttrMetaModel.genericType)
		assertEquals(singleAttrLang.name, singleAttrMetaModel.name)
  	}
  	
  	@Test
  	def testRepositoryEntityName(){
  		assertEquals(repositoryLang.name, repositoryMetaModel.name)
  	}
  	
  	@Test
  	def testQtdRepositoryFields(){
  		assertEquals(repositoryLang.methods.size, repositoryMetaModel.methods.size)
  	}
  	
  	/*@Test
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
  	}*/	
}