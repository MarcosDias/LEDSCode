package br.edu.sr.ifes.leds.LedsCode.tests.metaModel

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.generator.ProjectConverter
import br.edu.sr.ifes.leds.ledsCodeV001.Attribute
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock
import br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock
import br.edu.sr.ifes.leds.ledsCodeV001.Repository
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod
import java.util.List
import model.domainLayer.ClassEnum
import model.domainLayer.Domain
import model.domainLayer.Entity
import model.domainLayer.Method
import model.domainLayer.Module
import model.domainLayer.Service
import org.eclipse.emf.common.util.EList
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class DomainTest extends AbstractTestClass{
	
	EList<DomainBlock> domainLang
	DomainBlock singleDomLang
	ModuleBlock singleModuleLang
	ModuleBlock otherSingleModuleLang
	ServiceBlock singleServiceLang
	ServiceMethod fieldSingleServiceLang
	EntityBlock singleEntityLang
	Attribute singleAttrLang
	Repository repositoryLang
	RepositoryFields fieldRepositoryLang	
	EnumBlock singleEnumLang
	
	List<Domain> domainMetaModel
	Domain singleDomMetaModel
	Module singleModuleMetaModel
	Module othersingleModuleMetaModel
	Entity singleEntityMetaModel
	model.domainLayer.Attribute singleAttrMetaModel
	model.domainLayer.Repository repositoryMetaModel
	Method fieldRepositoryMetaModel
	ClassEnum singleEnumMetaModel
	Service singleServiceMetaModel
	model.domainLayer.ServiceMethod fieldSingleServiceMetaModel
	
	@Before
	def void setUp(){
		projectLang = parseProject
		domainLang = projectLang.domainBlock
		singleDomLang = domainLang.get(0)
		singleModuleLang = singleDomLang.module.get(0)
		otherSingleModuleLang = singleDomLang.module.get(1)
		singleEnumLang = otherSingleModuleLang.enumBlock.get(0)
		singleEntityLang = singleModuleLang.entityBlock.get(1)
		singleAttrLang = singleEntityLang.attributes.get(0)
		repositoryLang = singleEntityLang.repository
		fieldRepositoryLang = repositoryLang.methods.get(0)
		singleServiceLang = singleModuleLang.serviceBlock.get(0)
		fieldSingleServiceLang = singleServiceLang.serviceFields.get(0)
		
		tableObjects = new ProjectConverter().convert(projectLang);
		projectMetaModel = tableObjects.project
		domainMetaModel = projectMetaModel.domains
		singleDomMetaModel = domainMetaModel.get(0)
		singleModuleMetaModel = singleDomMetaModel.modules.get(0)
		othersingleModuleMetaModel = singleDomMetaModel.modules.get(1)
		singleEnumMetaModel = othersingleModuleMetaModel.enums.get(0)
		singleEntityMetaModel = singleModuleMetaModel.entities.get(1)
		singleAttrMetaModel = singleEntityMetaModel.attributes.get(0)
		repositoryMetaModel = singleEntityMetaModel.repository
		fieldRepositoryMetaModel = repositoryMetaModel.methods.get(0)
		singleServiceMetaModel = singleModuleMetaModel.services.get(0)
		fieldSingleServiceMetaModel = singleServiceMetaModel.methods.get(0)
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
  	
  	@Test
  	def testModuleParent(){
  		assertNotNull(singleModuleMetaModel.parent)
  	}
  	
  	@Test
  	def testQtdEnums(){
  		assertEquals(singleModuleLang.enumBlock.size, singleModuleMetaModel.enums.size)
  		assertEquals(0, singleModuleMetaModel.enums.size)
  		assertEquals(2, othersingleModuleMetaModel.enums.size)
  	}
  	
  	@Test
  	def testEnumName(){
  		assertEquals(singleEnumLang.name, singleEnumMetaModel.name)
  	}
  	
  	@Test
  	def testQtdValuesEnums(){
  		assertEquals(singleEnumLang.values.size, singleEnumMetaModel.values.size)
  	}
  	
  	@Test
  	def testValuesEnum(){
  		val valueEnumLang = singleEnumLang.values.get(0)
  		val valueEnumMetaModel = singleEnumMetaModel.values.get(0)
		assertEquals(valueEnumLang, valueEnumMetaModel)  		
  	}
  	
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
  	def testEntityParent(){
  		assertNotNull(singleEntityMetaModel.parent)
  	}
  	
  	@Test
  	def testQtdInheritanceClass(){
  		assertEquals(singleEntityLang.classExtends.values.size, singleEntityMetaModel.classExtends.size)
  	}
  	
  	@Test
  	def testInheritanceClass(){
  		for(superClass : singleEntityMetaModel.classExtends){
  			assertTrue(superClass.name.contains("Pessoa"))
  		}
  	}
  	
  	@Test
  	def testQtdAttributes(){
  		assertEquals(singleEntityLang.attributes.size, singleEntityMetaModel.attributes.size)
  	}
  	
  	@Test
  	def testAttributes(){
		assertTrue(singleAttrLang.acessModifier.equalsIgnoreCase(
				singleAttrMetaModel.accessModifier.toString()
			)
		)
		assertEquals(singleAttrLang.type.toString, singleAttrMetaModel.genericType)
		assertEquals(singleAttrLang.name, singleAttrMetaModel.name)
  	}
  	
  	@Test
  	def testConstraintsFirtsAttr(){
  	  	var firstLang = singleEntityLang.attributes.get(0)
  	  	var firstMetaModel = singleEntityMetaModel.attributes.get(0)
  	  	assertEquals(firstLang.pk, firstMetaModel.constraints.pk)
  	  	assertEquals(firstLang.max, firstMetaModel.constraints.max)
  	  	assertEquals(firstLang.min, firstMetaModel.constraints.min)
  	  	//and
  	  	assertTrue(firstMetaModel.constraints.pk)
  	  	assertFalse(firstMetaModel.constraints.nullable)
  	  	assertFalse(firstMetaModel.constraints.unique)
  	}
  	
  	@Test
  	def testConstraintsSecundAttr(){
  	  	var secundLang = singleEntityLang.attributes.get(1)
  	  	var secundMetaModel = singleEntityMetaModel.attributes.get(1)
  	  	assertEquals(secundLang.max, secundMetaModel.constraints.max)
  	  	//and
  	  	assertFalse(secundMetaModel.constraints.pk)
  	  	assertNull(secundMetaModel.constraints.min)
  	  	assertFalse(secundMetaModel.constraints.nullable)
  	  	assertFalse(secundMetaModel.constraints.unique)
  	}
  	
  	@Test
  	def testcConstraintsThirdAttr(){
  	  	var thirdLang = singleEntityLang.attributes.get(2)
  	  	var thirdMetaModel = singleEntityMetaModel.attributes.get(2)
  	  	assertEquals(thirdLang.unique, thirdMetaModel.constraints.unique.toString())
  	  	assertEquals(thirdLang.min, thirdMetaModel.constraints.min)
  	  	assertEquals(thirdLang.max, thirdMetaModel.constraints.max)
  	  	//and
  	  	assertFalse(thirdMetaModel.constraints.pk)
  	  	assertTrue(thirdMetaModel.constraints.nullable)
  	  	assertTrue(thirdMetaModel.constraints.unique)
  	}
  	
  	@Test
  	def testRepositoryEntityName(){
  		assertEquals(repositoryLang.name, repositoryMetaModel.name)
  	}
  	
  	@Test
  	def testQtdRepositoryFields(){
  		assertEquals(repositoryLang.methods.size, repositoryMetaModel.methods.size)
  	}
  	
  	@Test
  	def testRepositoryFields(){
  		val methodParameterLang = fieldRepositoryLang.methodsParameters.typeAndAttr.get(0)
  		val methodParameterMetaModel = fieldRepositoryMetaModel.parameters.get(0)
  		
  		assertEquals(fieldRepositoryLang.name, fieldRepositoryMetaModel.name)
  		assertNotNull(fieldRepositoryMetaModel.parent)
  		assertEquals(fieldRepositoryLang.returnType, fieldRepositoryMetaModel.returnMethod.genericType())
  		assertEquals(methodParameterLang.type, methodParameterMetaModel.genericType)
  		assertEquals(methodParameterLang.name, methodParameterMetaModel.name)
  	}
  	
  	@Test
  	def testQtdServices(){
  		assertEquals(singleModuleLang.serviceBlock.size, singleModuleMetaModel.services.size)
  	}
  	
  	@Test
  	def testServiceName(){
  		assertEquals(singleServiceLang.name, singleServiceMetaModel.name)
  	}
  	
  	@Test
  	def testServiceParent(){
  		assertNotNull(singleServiceMetaModel.parent)
  	}
  	
  	@Test
  	def testQtdServicesFields(){
  		assertEquals(singleServiceLang.serviceFields.size, singleServiceMetaModel.methods.size)
  	}
  	
  	@Test
  	def testServiceField(){
		assertEquals(fieldSingleServiceLang.name, fieldSingleServiceMetaModel.name)
		assertEquals(fieldSingleServiceLang.methodAcess.name, fieldSingleServiceMetaModel.methodService.name)
  	}
}