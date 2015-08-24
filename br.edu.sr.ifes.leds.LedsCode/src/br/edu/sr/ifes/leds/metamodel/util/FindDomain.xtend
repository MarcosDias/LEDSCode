package br.edu.sr.ifes.leds.metamodel.util

import java.util.LinkedHashSet
import model.domainLayer.Domain

class FindDomain {
	
	def inMetaModel(LinkedHashSet<Domain> domains, String nameDomain) {
		for(dom: domains){
			if(dom.name.equals(nameDomain)) return dom
		}
		// TODO Exception
		return null
	}

}