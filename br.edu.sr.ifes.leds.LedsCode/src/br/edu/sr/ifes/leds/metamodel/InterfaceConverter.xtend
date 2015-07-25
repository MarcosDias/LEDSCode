package br.edu.sr.ifes.leds.metamodel

import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock
import java.util.LinkedHashSet
import model.interfaceLayer.Interface
import model.interfaceLayer.Type
import org.eclipse.emf.common.util.EList

class InterfaceConverter {
	def conveter(InterfaceBlock ifaceLang) {
		var ifaceMetaModel = new Interface
		ifaceMetaModel.name = ifaceLang.name
		ifaceMetaModel.interfaceApplication = convertInterfaceApp(ifaceLang.interfaceApplication)
		
		ifaceMetaModel
	}
	
	def convertInterfaceApp(EList<InterfaceApplication> listIfaceAppLang) {
		var listIfaceAppMetaModel = new LinkedHashSet<model.interfaceLayer.InterfaceApplication>
		for(ifaceAppLang : listIfaceAppLang){
			var ifaceAppMetaModel = new model.interfaceLayer.InterfaceApplication
			ifaceAppMetaModel.name = ifaceAppLang.name
			ifaceAppMetaModel.type = Type.fromString(ifaceAppLang.type)
			// TODO - Ainda falta a Application, finalizar o Domina
			
		}
		listIfaceAppMetaModel
	}
}