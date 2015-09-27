package br.edu.sr.ifes.leds.metamodel.util

import java.util.LinkedHashSet
import model.domainLayer.Method

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