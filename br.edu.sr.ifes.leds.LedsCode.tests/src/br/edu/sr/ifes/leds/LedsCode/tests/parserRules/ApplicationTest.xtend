package br.edu.sr.ifes.leds.LedsCode.tests.parserRules

import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock
import org.eclipse.emf.common.util.EList
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*
import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass

class ApplicationTest extends AbstractTestClass{
	
	EList<ApplicationBlock> app	
	ApplicationBlock singleApp	
	String singleAppDomain
	
	@Before
	def void setUp(){
		projectLang = parseProject()
		app = projectLang.applicationBlock
		singleApp = app.get(0)
		singleAppDomain = singleApp.applicationDomain.get(0)
	}
	
	@Test
	def testQtdApplication(){
		assertEquals(1, app.size)
	}

  	@Test
  	def testApplicationName(){
  		assertEquals("appSincap", singleApp.name)
  	}
  	
  	@Test
  	def testQtdApplicationDomain(){
  		assertEquals(1, singleApp.applicationDomain.size)
  	}
  	
  	@Test
  	def testApplicationDomain(){
  		assertEquals("domSincap.*", singleAppDomain)
	}
}