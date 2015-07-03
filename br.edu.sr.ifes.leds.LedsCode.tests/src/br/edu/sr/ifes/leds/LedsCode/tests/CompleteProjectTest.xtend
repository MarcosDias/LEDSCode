package br.edu.sr.ifes.leds.LedsCode.tests

import br.edu.sr.ifes.leds.LedsCodeV001InjectorProvider
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL
import br.edu.sr.ifes.leds.ledsCodeV001.Project
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import static br.edu.sr.ifes.leds.LedsCode.factory.ProjectFactory.completeProject
import static org.junit.Assert.*

@InjectWith(LedsCodeV001InjectorProvider)
@RunWith(XtextRunner)
class CompleteProjectTest{
	
	@Inject
  	ParseHelper<LedsCodeDSL>  parser
	
	LedsCodeDSL model
		
	@Test
	def notNullRules(){
		val project = parseCompleteProject()
		
		assertEquals("Projeto", project.name)
	    assertNotNull(project.infrastructureBlock)
	    assertNotNull(project.interfaceBlock)
	    assertNotNull(project.domainBlock)
	    assertNotNull(project.appBlock)
	}
	
	def parseCompleteProject(){
		model = parser.parse(completeProject())
		model.eAllContents.head as Project
	}
}