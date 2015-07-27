package br.edu.sr.ifes.leds.metamodel

import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock
import br.edu.sr.ifes.leds.metamodel.util.FindApplication
import java.util.LinkedHashSet
import model.applicationLayer.Application
import model.interfaceLayer.Interface
import model.interfaceLayer.Type
import org.eclipse.emf.common.util.EList

class InterfaceConverter {
	
	FindApplication findApplication
	
	def conveter(InterfaceBlock ifaceLang, LinkedHashSet<Application> listAppMetaModel) {
		var ifaceMetaModel = new Interface
		ifaceMetaModel.name = ifaceLang.name
		ifaceMetaModel.interfaceApplication = convertInterfaceApp(ifaceLang.interfaceApplication, listAppMetaModel)
		
		ifaceMetaModel
	}
	
	def convertInterfaceApp(EList<InterfaceApplication> listIfaceAppLang, LinkedHashSet<Application> listAppMetaModel) {
		var listIfaceAppMetaModel = new LinkedHashSet<model.interfaceLayer.InterfaceApplication>
		for(ifaceAppLang : listIfaceAppLang){
			var ifaceAppMetaModel = new model.interfaceLayer.InterfaceApplication
			ifaceAppMetaModel.name = ifaceAppLang.name
			ifaceAppMetaModel.type = Type.fromString(ifaceAppLang.type)
			ifaceAppMetaModel.application = findApplication.inList(ifaceAppLang.nameApp, listAppMetaModel)
			listIfaceAppMetaModel.add(ifaceAppMetaModel)
			
		}
		listIfaceAppMetaModel
	}
	
	new(){
		findApplication = new FindApplication
	}
}