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
import model.domainLayer.Method
import model.domainLayer.ClassEnum
import model.domainLayer.Service
import model.domainLayer.InternalServiceMethod

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
	Method fieldRepositoryMetaModel
	ClassEnum singleEnumMetaModel
	Service singleServiceMetaModel
	InternalServiceMethod fieldSingleServiceMetaModel
	
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
		singleServiceMetaModel = singleModuleMetaModel.services.get(0)
		fieldSingleServiceMetaModel = singleServiceMetaModel.methods.get(0) as model.domainLayer.InternalServiceMethod
		singleEntityMetaModel = singleModuleMetaModel.entities.get(0)
		singleAttrMetaModel = singleEntityMetaModel.attributes.get(0)
		repositoryMetaModel = singleEntityMetaModel.repository
		fieldRepositoryMetaModel = repositoryMetaModel.methods.get(0)
		singleEnumMetaModel = singleModuleMetaModel.enums.get(0)
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
  	def testQtdServices(){
  		assertEquals(singleModuleLang.serviceBlock.size, singleModuleMetaModel.services.size)
  	}
  	
  	@Test
  	def testServiceName(){
  		assertEquals(singleServiceLang.name, singleServiceMetaModel.name)
  	}
  	
  	@Test
  	def testQtdServicesFields(){
  		assertEquals(singleServiceLang.serviceFields.size, singleServiceMetaModel.methods.size)
  	}
  	
  	@Test
  	def testNameServiceField(){
		assertEquals(fieldSingleServiceLang.name, fieldSingleServiceMetaModel.name)
		assertEquals(fieldSingleServiceLang.methodAcess, fieldSingleServiceMetaModel.methodAcess)
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
  	def testConstraintsFirtsAttr(){
  		// entity Media
  	  	var firstLang = singleEntityLang.attributes.get(0)
  	  	var firstMetaModel = singleEntityMetaModel.attributes.get(0)
  	  	assertEquals(firstLang.pk, firstMetaModel.constraints.pk)
  	  	assertEquals(firstLang.max, firstMetaModel.constraints.max)
  	  	//and
  	  	assertTrue(firstMetaModel.constraints.pk)
  	  	assertNull(firstMetaModel.constraints.min)
  	  	assertFalse(firstMetaModel.constraints.nullable)
  	  	assertFalse(firstMetaModel.constraints.unique)
  	}
  	
  	@Test
  	def testConstraintsSecundAttr(){
  		// entity Media
  	  	var secundLang = singleEntityLang.attributes.get(1)
  	  	var secundMetaModel = singleEntityMetaModel.attributes.get(1)
  	  	assertEquals(secundLang.nullable, secundMetaModel.constraints.nullable.toString())
  	  	//and
  	  	assertFalse(secundMetaModel.constraints.pk)
  	  	assertNull(secundMetaModel.constraints.min)
  	  	assertNull(secundMetaModel.constraints.max)
  	  	assertFalse(secundMetaModel.constraints.nullable)
  	  	assertFalse(secundMetaModel.constraints.unique)
  	}
  	
  	@Test
  	def testcConstraintsThirdAttr(){
  		// entity Media
  	  	var thirdLang = singleEntityLang.attributes.get(2)
  	  	var thirdMetaModel = singleEntityMetaModel.attributes.get(2)
  	  	assertEquals(thirdLang.unique, thirdMetaModel.constraints.unique.toString())
  	  	assertEquals(thirdLang.min, thirdMetaModel.constraints.min)
  	  	assertEquals(thirdLang.max, thirdMetaModel.constraints.max)
  	  	//and
  	  	assertFalse(thirdMetaModel.constraints.pk)
  	  	assertFalse(thirdMetaModel.constraints.nullable)
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
  		
  		assertEquals(fieldRepositoryLang.nameMethod, fieldRepositoryMetaModel.name)
  		assertEquals(fieldRepositoryLang.returnType, fieldRepositoryMetaModel.returnMethod.genericType())
  		assertEquals(methodParameterLang.type, methodParameterMetaModel.genericType)
  		assertEquals(methodParameterLang.name, methodParameterMetaModel.name)
  	}
  	
  	@Test
  	def testQtdEnums(){
  		assertEquals(singleModuleLang.enumBlock.size, singleModuleMetaModel.enums.size)
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
}