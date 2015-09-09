package br.edu.sr.ifes.leds.LedsCode.tests.parserRules

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.ledsCodeV001.Attribute
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock
import br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock
import br.edu.sr.ifes.leds.ledsCodeV001.Repository
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod
import org.eclipse.emf.common.util.EList
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class DomainTest extends AbstractTestClass{
	
	EList<DomainBlock> domain
	DomainBlock singleDom
	ModuleBlock singleModule
	ModuleBlock otherModule
	ServiceBlock singleService
	ServiceMethod fieldSingleService
	ServiceMethod otherSingleService
	EntityBlock singleEntity
	EntityBlock otherSingleEntity
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
		otherModule = singleDom.module.get(1)
		singleService = singleModule.serviceBlock.get(0)
		fieldSingleService = singleService.serviceFields.get(0)
		otherSingleService = singleService.serviceFields.get(1)
		singleEntity = singleModule.entityBlock.get(0)
		otherSingleEntity = singleModule.entityBlock.get(1)
		singleAttr = otherSingleEntity.attributes.get(0)
		repository = otherSingleEntity.repository
		fieldRepository = repository.methods.get(0)
		singleEnum = otherModule.enumBlock.get(0)
	}
	
	@Test
	def testQtdDomain(){
		assertEquals(1, domain.size)
	}
	
  	@Test
  	def testDomainName(){	
		assertEquals("domSincap", singleDom.name)
  	}
  	
  	@Test
  	def testQtdModule(){
  		assertEquals(2, singleDom.module.size)
  	}
  	
  	@Test
  	def testModuleName(){
  		assertEquals("controleInterno", singleModule.name)
  	}
  	
  	@Test
  	def testQtdServices(){
  		assertEquals(1, singleModule.serviceBlock.size)
  	}
  	
  	@Test
  	def testServiceName(){
  		assertEquals("aplProcessoNotificacao", singleService.name)
  	}
  	
  	@Test
  	def testQtdServicesFields(){
  		assertEquals(2, singleService.serviceFields.size)
  	}
  	
  	@Test
  	def testNameServiceField(){
  		var superRepository = fieldSingleService.methodAcess.eContainer as Repository
  		var superEntity = superRepository.eContainer as EntityBlock
		assertEquals("FindByName", fieldSingleService.name)
		assertTrue("Funcionario.funcionarioRepository.findByName".contains(fieldSingleService.methodAcess.name))
		assertTrue("Funcionario.funcionarioRepository.findByName".contains(superRepository.name))
		assertTrue("Funcionario.funcionarioRepository.findByName".contains(superEntity.name))
  	}
  	
  	@Test
  	def testOtherNameServiceField(){
  		var superRepository = otherSingleService.methodAcess.eContainer as Repository
  		var superEntity = superRepository.eContainer as EntityBlock
  		var superModule = superEntity.eContainer as ModuleBlock
		assertEquals("FindNotificadorProcessoNotificacao", otherSingleService.name)
		assertTrue("controleNotificacao.ProcessoNotificacao.processoNotificacaoRepository.findByNotificadorName".contains(otherSingleService.methodAcess.name))
		assertTrue("controleNotificacao.ProcessoNotificacao.processoNotificacaoRepository.findByNotificadorName".contains(superRepository.name))
		assertTrue("controleNotificacao.ProcessoNotificacao.processoNotificacaoRepository.findByNotificadorName".contains(superEntity.name))
		assertTrue("controleNotificacao.ProcessoNotificacao.processoNotificacaoRepository.findByNotificadorName".contains(superModule.name))
  	}
  	
  	@Test
  	def testQtdEntity(){
  		assertEquals(10, singleModule.entityBlock.size)
  	}
  	
	@Test
  	def testAssinaturaEntity(){
  		assertEquals("Pessoa", singleEntity.name)
  		assertTrue(singleEntity.isIsAbstract)
  		assertNull(singleEntity.acessModifier)
  	}
  	
  	@Test
  	def testQtdInheritanceClass(){
  		assertEquals(1, otherSingleEntity.classExtends.values.size)
  	}
  	
  	@Test
  	def testInheritanceClass(){
		var superClass = otherSingleEntity.classExtends.values
		assertEquals("Pessoa", superClass.get(0).name)
  	}
  	
  	@Test
  	def testQtdAttributes(){
  		assertEquals(5, otherSingleEntity.attributes.size)
  	}
  	
  	@Test
  	def testAttributes(){
		assertTrue("private -".contains(singleAttr.acessModifier))
		assertEquals("String", singleAttr.type)
		assertEquals("cpf", singleAttr.name)
  	}
  	

  	@Test
  	def testConstraintsFirtsAttr(){
  		// entity Funcionario
  	  	var first = otherSingleEntity.attributes.get(0)
  	  	assertTrue(first.pk)
  	  	assertEquals(15, first.max)
  	  	assertEquals(15, first.min)
  	}
  	
  	@Test
  	def testConstraintsSecundAttr(){
  		// entity Funcionario
  	  	var secund = otherSingleEntity.attributes.get(1)
  	  	assertEquals(11, secund.max)
  	  	
  	}
  	
  	@Test
  	def testcConstraintsThirdAttr(){
  		// entity Funcionario
  	  	var third = otherSingleEntity.attributes.get(2)
  	  	assertEquals('true', third.unique)
  	  	assertEquals('true', third.nullable)
  	  	
  	}
  	
  	@Test
  	def testRepositoryEntityName(){
  		assertEquals("funcionarioRepository", repository.name)
  	}
  	
  	@Test
  	def testQtdRepositoryFields(){
  		assertEquals(1, repository.methods.size)
  	}
  	
  	@Test
  	def testRepositoryFields(){
  		val methodParameter = fieldRepository.methodsParameters.typeAndAttr.get(0)
  		
  		assertEquals("findByName", fieldRepository.name)
  		assertEquals("Funcionario", fieldRepository.returnType)
  		assertEquals("String", methodParameter.type)
  		assertEquals("name", methodParameter.name)
  	}
  	
  	@Test
  	def testQtdEnums(){
  		assertEquals(0, singleModule.enumBlock.size)
  		assertEquals(2, otherModule.enumBlock.size)
  	}
  	
  	@Test
  	def testEnumName(){
  		assertEquals("EstadoCivil", singleEnum.name)
  	}
  	
  	@Test
  	def testQtdValuesEnums(){
  		assertEquals(3, singleEnum.values.size)
  	}
  	
  	@Test
  	def testValuesEnum(){
  		val valueEnum = singleEnum.values.get(0)
		assertEquals("Casado", valueEnum)  		
  	}
}	