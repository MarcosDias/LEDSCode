package br.edu.sr.ifes.leds.metamodel.util

import br.edu.sr.ifes.leds.model.domainLayer.Domain
import java.util.List

class FindDomain {
	def inMetaModel(List<Domain> domains, String nameDomain) {
		for(dom: domains){
			if(dom.name.equals(nameDomain)) return dom
		}
		throw new Exception("Could not find the domain " + nameDomain)
	}
	
	def void findInverseFullPathDomain(Domain domain, List<String> incompleteNameEntity, String full) {
		if(domain.name.equals(incompleteNameEntity.get(0))){
			throw new Exception("Could not find the domain " + full)
		}
	}
}