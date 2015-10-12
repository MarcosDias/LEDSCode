package br.edu.sr.ifes.leds.LedsCode.tests

import br.edu.sr.ifes.leds.LedsCodeV001InjectorProvider
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL
import br.edu.sr.ifes.leds.ledsCodeV001.Project
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.runner.RunWith

import static br.edu.sr.ifes.leds.LedsCode.factory.ProjectFactory.completeProject

@InjectWith(LedsCodeV001InjectorProvider)
@RunWith(XtextRunner)
abstract class AbstractTestClass {
	
	@Inject
  	protected ParseHelper<LedsCodeDSL> parser
  	
  	protected Project projectLang
  	protected TableObjects tableObjects
  	protected model.mainLayer.Project projectMetaModel
  	
  	def parseProject(){
		val model = parser.parse(completeProject())
		model.eAllContents.head as Project
	}	
}