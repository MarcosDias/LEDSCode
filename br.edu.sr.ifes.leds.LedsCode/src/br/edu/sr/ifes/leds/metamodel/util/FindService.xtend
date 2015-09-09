package br.edu.sr.ifes.leds.metamodel.util

import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields
import java.util.Set
import model.domainLayer.Entity
import model.domainLayer.Repository

class FindService {
	def inMetaModel(Set<Entity> entities, RepositoryFields fields) {
		for(entity: entities){
			var field = this.inRepository(entity.repository, fields.name)
			if (field != null) return field
		}
		throw new Exception(fields.name + 'method of service not found')
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