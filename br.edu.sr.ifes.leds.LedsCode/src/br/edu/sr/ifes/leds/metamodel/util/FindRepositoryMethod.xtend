package br.edu.sr.ifes.leds.metamodel.util

import br.edu.sr.ifes.leds.model.domainLayer.Method
import java.util.LinkedHashSet

class FindRepositoryMethod {
	def inRepository(LinkedHashSet<Method> listRepositoryMethods, String name) {
		for(repositoryMethod: listRepositoryMethods){
			if(repositoryMethod.name == name){
				return repositoryMethod
			}
		}
		throw new Exception("Could not find the repository " + name)
	}	
}