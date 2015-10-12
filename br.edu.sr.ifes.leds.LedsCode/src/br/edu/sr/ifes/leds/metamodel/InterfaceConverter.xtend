package br.edu.sr.ifes.leds.metamodel

import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock
import br.edu.sr.ifes.leds.ledsCodeV001.Project
import br.edu.sr.ifes.leds.metamodel.util.FindApplication
import br.edu.sr.ifes.leds.model.applicationLayer.Application
import br.edu.sr.ifes.leds.model.interfaceLayer.Interface
import br.edu.sr.ifes.leds.model.interfaceLayer.Type
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.EList

class InterfaceConverter {
	
	FindApplication findApplication
	Project projectLang
	br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel
	
	def conveter(InterfaceBlock ifaceLang, List<Application> listAppMetaModel) {
		var ifaceMetaModel = new Interface
		ifaceMetaModel.name = ifaceLang.name
		ifaceMetaModel.interfaceApplication = convertInterfaceApp(ifaceLang.interfaceApplication, listAppMetaModel)
		
		ifaceMetaModel
	}
	
	def convertInterfaceApp(EList<InterfaceApplication> listIfaceAppLang, List<Application> listAppMetaModel) {
		var listIfaceAppMetaModel = new ArrayList<br.edu.sr.ifes.leds.model.interfaceLayer.InterfaceApplication>
		for(ifaceAppLang : listIfaceAppLang){
			var ifaceAppMetaModel = new br.edu.sr.ifes.leds.model.interfaceLayer.InterfaceApplication
			ifaceAppMetaModel.name = ifaceAppLang.name
			ifaceAppMetaModel.type = Type.fromString(ifaceAppLang.type)
			ifaceAppMetaModel.application = findApplication.inList(ifaceAppLang.nameApp, listAppMetaModel)
			listIfaceAppMetaModel.add(ifaceAppMetaModel)
			
		}
		listIfaceAppMetaModel
	}
	
	new(Project projectLang, br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel) {
		this.findApplication = new FindApplication
		this.projectLang = projectLang
		this.projectMetaModel = projectMetaModel
	}
	
}