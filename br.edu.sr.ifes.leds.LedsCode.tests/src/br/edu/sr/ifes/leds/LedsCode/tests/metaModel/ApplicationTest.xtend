package br.edu.sr.ifes.leds.LedsCode.tests.metaModel

import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock
import org.eclipse.emf.common.util.EList
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*
import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.generator.ProjectConverter
import java.util.LinkedHashSet
import model.applicationLayer.Application

class ApplicationTest extends AbstractTestClass{
	
	EList<ApplicationBlock> appLang
	ApplicationBlock singleAppLang
	String singleAppDomainLang
	
	LinkedHashSet<Application> appMetaModel
	
	Application singleAppMetalModel
	
	@Before
	def void setUp(){
		projectLang = parseProject()
		appLang = projectLang.applicationBlock
		singleAppLang = appLang.get(0)
		singleAppDomainLang = singleAppLang.applicationDomain.get(0)
		
		projectMetaModel = new ProjectConverter().convert(projectLang);
		appMetaModel = projectMetaModel.applications
		singleAppMetalModel = appMetaModel.get(0)
	}
	
	@Test
	def testQtdApplication(){
		assertEquals(appLang.size, appMetaModel.size)
	}

  	@Test
  	def testApplicationName(){
  		assertEquals(singleAppLang.name, singleAppMetalModel.name)
  	}
  	
  	/*@Test
  	def testQtdApplicationDomain(){
  		assertEquals(2, singleApp.applicationDomain.size)
  	}
  	
  	@Test
  	def testApplicationDomain(){
  		assertEquals("Library.*", singleAppDomain)
	}*/
}