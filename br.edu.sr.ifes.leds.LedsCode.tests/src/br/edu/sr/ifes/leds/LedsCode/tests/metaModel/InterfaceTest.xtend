package br.edu.sr.ifes.leds.LedsCode.tests.metaModel

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.generator.ProjectConverter
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*
import model.interfaceLayer.Interface
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication

class InterfaceTest extends AbstractTestClass{
	InterfaceBlock ifaceLang
	InterfaceApplication ifaceFieldLang
	
	Interface ifaceMetaModel
	model.interfaceLayer.InterfaceApplication ifaceFieldMetaModel
	
	
	
	@Before
	def void setUp(){
		projectLang = parseProject()
		ifaceLang = projectLang.interfaceBlock
		ifaceFieldLang = ifaceLang.interfaceApplication.get(0)
		
		projectMetaModel = new ProjectConverter().convert(projectLang);
		ifaceMetaModel = projectMetaModel.iface
		ifaceFieldMetaModel = ifaceMetaModel.interfaceApplication.get(0)
	}
  	
  	@Test
  	def testInterfaceName(){
  		assertEquals(ifaceLang.name, ifaceMetaModel.name)
  	}
  	
  	@Test
  	def testQtdInterfaceField(){
  		assertEquals(ifaceLang.interfaceApplication.size, ifaceMetaModel.interfaceApplication.size)
  	}
  	
  	@Test
  	def testTypeInterfaceFields(){
  		assertEquals(ifaceFieldLang.type, ifaceFieldMetaModel.type.valor)
  		assertEquals(ifaceFieldLang.name, ifaceFieldMetaModel.name)
  		assertEquals(ifaceFieldLang.nameApp, ifaceFieldMetaModel.application.name)
  	}
}