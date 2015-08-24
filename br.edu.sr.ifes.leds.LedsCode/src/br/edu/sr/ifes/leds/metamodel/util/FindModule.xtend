package br.edu.sr.ifes.leds.metamodel.util

import java.util.LinkedHashSet
import model.domainLayer.Module

class FindModule {
	
	def inMetaModel(LinkedHashSet<Module> modules, String nameModule) {
		for(mod: modules){
			if(mod.name.equals(nameModule)) return mod
		}
		null
	}
	
}