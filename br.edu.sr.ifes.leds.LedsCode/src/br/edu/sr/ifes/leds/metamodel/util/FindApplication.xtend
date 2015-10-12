package br.edu.sr.ifes.leds.metamodel.util

import br.edu.sr.ifes.leds.model.applicationLayer.Application
import java.util.List

class FindApplication {
	
	def inList(String name, List<Application> listAppMetaModel) {
		for(appMetaModel: listAppMetaModel){
			if(appMetaModel.name == name){
				return appMetaModel
			}
		}
		throw new Exception("Could not find the application " + name);
	}
	
}