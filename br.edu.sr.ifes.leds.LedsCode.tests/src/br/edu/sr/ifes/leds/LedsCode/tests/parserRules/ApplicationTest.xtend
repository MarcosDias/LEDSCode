package br.edu.sr.ifes.leds.LedsCode.tests.parserRules

import br.edu.sr.ifes.leds.LedsCodeV001InjectorProvider
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL
import br.edu.sr.ifes.leds.ledsCodeV001.Project
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static br.edu.sr.ifes.leds.LedsCode.factory.ProjectFactory.completeProject
import static org.junit.Assert.*

@InjectWith(LedsCodeV001InjectorProvider)
@RunWith(XtextRunner)
class ApplicationTest {
	
	@Inject
  	ParseHelper<LedsCodeDSL> parser
  	
  	@Test
  	def testApplicationName(){
  		val app = parseApplication()
  		
  		for(single: app){
  			assertTrue("LibraryPersonApp LibraryPersonApp2".contains(single.name))	
  		}
  	}
  	
  	@Test
  	def testApplicationDomain(){
  		val app = parseApplication()
  		
  		val single = app.get(0)
  		
  		for(domainApp: single.applicationDomain){
  			assertTrue("Library.* Loan.*".contains(domainApp))
  		}
  	}
	
	def parseApplication(){
		val model = parser.parse(completeProject())
		val project = model.eAllContents.head as Project
		
		project.applicationBlock
	}
}