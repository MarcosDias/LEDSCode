package br.edu.sr.ifes.leds.LedsCode.tests.metaModel

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass
import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock
import java.util.ArrayList
import java.util.Arrays
import java.util.LinkedHashSet
import model.applicationLayer.Application
import org.eclipse.emf.common.util.EList
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*
import br.edu.sr.ifes.leds.generator.ProjectConverter

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
		
		tableObjects = new ProjectConverter().convert(projectLang);
		projectMetaModel = tableObjects.project
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
  	
  	@Test
  	def testQtdApplicationDomain(){
  		assertEquals(1, singleAppMetalModel.structure.size)
  	}
  	
  	@Test
  	def testApplicationDomain(){
		var strutureAppLang = new ArrayList<String>(Arrays.asList(singleAppDomainLang.split('\\.')))
  		assertEquals(strutureAppLang.get(0).toString(), singleAppMetalModel.structure.get(0).domain.name)
  		assertNull(singleAppMetalModel.structure.get(0).son)
  	}
}