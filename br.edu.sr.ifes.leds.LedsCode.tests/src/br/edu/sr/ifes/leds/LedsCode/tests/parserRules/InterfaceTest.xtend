package br.edu.sr.ifes.leds.LedsCode.tests.parserRules

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class InterfaceTest extends AbstractTestClass{
	InterfaceBlock iface
	
	@Before
	def void setUp(){
		projectLang = parseProject()
		iface = projectLang.interfaceBlock
	}
  	
  	@Test
  	def testInterfaceName(){
  		assertEquals("InterfaceLibrary", iface.name)
  	}
  	
  	@Test
  	def testQtdInterfaceField(){
  		assertEquals(2, iface.interfaceApplication.size())
  	}
  	
  	@Test
  	def testTypeInterfaceFields(){
  		val ifaceField = iface.interfaceApplication.get(0)
  			
  		assertEquals("HtmlView", ifaceField.type)
  		assertEquals("Interface1", ifaceField.name)
  		assertEquals("LibraryPersonApp", ifaceField.nameApp)
  	}
}