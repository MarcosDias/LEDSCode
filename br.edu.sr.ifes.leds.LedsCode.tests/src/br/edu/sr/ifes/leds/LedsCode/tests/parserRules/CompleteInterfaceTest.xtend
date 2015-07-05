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

import static org.junit.Assert.*
import static br.edu.sr.ifes.leds.LedsCode.factory.ProjectFactory.completeProject

@InjectWith(LedsCodeV001InjectorProvider)
@RunWith(XtextRunner)
class CompleteInterfaceTest {
	
	@Inject
  	ParseHelper<LedsCodeDSL> parser
  	
  	@Test
  	def testInterfaceName(){
  		val iface = parseCompleteInfrastructura()
  		
  		assertEquals("InterfaceLibrary", iface.name)
  	}
  	
  	@Test
  	def testInterfaceApplication(){
  		val iface = parseCompleteInfrastructura()
  		
  		assertEquals(2, iface.interfaceApplication.size())
  	}
  	
  	@Test
  	def testTypeInterfaceApplication(){
  		val iface = parseCompleteInfrastructura()
  		
  		for(app:iface.interfaceApplication){
  			assertTrue("HtmlView RestFull".contains(app.type))
  		}
  	}
  	
  	@Test
  	def testAcessPointName(){
  		val iface = parseCompleteInfrastructura()
  		
  		for(app:iface.interfaceApplication){
  			assertTrue("Interface1 Interface2".contains(app.name))
  		}
  	}
  	
  	@Test
  	def testUsedApp(){
  		val iface = parseCompleteInfrastructura()
	
		for (app:iface.interfaceApplication){
			assertEquals("Domain", app.nameApp)
		}
  	}
  	
  	def parseCompleteInfrastructura(){
		val model = parser.parse(completeProject())
		val project = model.eAllContents.head as Project
		
		project.interfaceBlock
	}
}