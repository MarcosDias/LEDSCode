package br.edu.sr.ifes.leds.metamodel.util

import java.util.Arrays
import java.util.List
import java.util.Set
import model.domainLayer.Module

class FindModule {
	FindDomain findDomain
	
	def inMetaModel(Set<Module> modules, String nameModule) {
		for(mod: modules){
			if(mod.name.equals(nameModule)) return mod
		}
		throw new Exception("Could not find the module " + nameModule)
	}
	
	def void findInverseFullPathModule(Module module, List<String> incompleteNameEntity, String full){
		if(!module.name.equals(incompleteNameEntity.get(0))){
			throw new Exception("Could not find the entity " + full)
		}
		if(incompleteNameEntity.size > 1){
			this.findDomain.findInverseFullPathDomain(module.parent, Arrays.asList(incompleteNameEntity.tail), full)	
		}
		
	}
	
	new() {
		findDomain = new FindDomain
	}
}