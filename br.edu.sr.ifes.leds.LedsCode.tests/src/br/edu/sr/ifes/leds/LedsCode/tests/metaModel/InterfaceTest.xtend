package br.edu.sr.ifes.leds.LedsCode.tests.metaModel

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.generator.ProjectConverter
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*
import model.interfaceLayer.Interface

class InterfaceTest extends AbstractTestClass{
	InterfaceBlock ifaceLang
	
	Interface ifaceMetaModel
	
	@Before
	def void setUp(){
		projectLang = parseProject()
		ifaceLang = projectLang.interfaceBlock
		
		projectMetaModel = new ProjectConverter().convert(projectLang);
		ifaceMetaModel = projectMetaModel.iface
	}
  	
  	@Test
  	def testInterfaceName(){
  		assertEquals(ifaceLang.name, ifaceMetaModel.name)
  	}
  	
  	/*@Test
  	def testQtdInterfaceField(){
  		assertEquals(2, iface.interfaceApplication.size())
  	}
  	
  	@Test
  	def testTypeInterfaceFields(){
  		val ifaceField = iface.interfaceApplication.get(0)
  			
  		assertEquals("HtmlView", ifaceField.type)
  		assertEquals("Interface1", ifaceField.name)
  		assertEquals("AppDomain", ifaceField.nameApp)
  	}*/
}