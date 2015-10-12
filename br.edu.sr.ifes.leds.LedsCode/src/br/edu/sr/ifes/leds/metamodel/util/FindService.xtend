package br.edu.sr.ifes.leds.metamodel.util

import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields
import br.edu.sr.ifes.leds.model.domainLayer.Entity
import br.edu.sr.ifes.leds.model.domainLayer.Repository
import java.util.List

class FindService {
	def inMetaModel(List<Entity> entities, RepositoryFields fields) {
		for(entity: entities){
			var field = this.inRepository(entity.repository, fields.name)
			if (field != null) return field
		}
		throw new Exception("Could not find the method of service " + fields.name)
	}
	
	def inRepository(Repository repository, String name) {
		if(repository != null)
			if(repository.methods != null && repository.methods.size > 0){
				for(field: repository.methods){
					if(field.name != null) return field 
				}
			}
			return null
	}
	
}