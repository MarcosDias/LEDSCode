package br.edu.sr.ifes.leds.LedsCode.factory

class DomainFactory {
	def static completeDomain(){
'''
domain Domain {
	«completeModule()»
}
'''
	}
	
	def static completeModule(){
'''
module Modulo {
	«completeService()»
	«completeEntity()»
}
'''
	}
	
	def static completeService(){
'''
service LibraryService {
	//nome => entity.repositorio.metodo
	//nome => service.metodo
	//nome => module.service.metodo
	//nome => domain.module.service.metodo
	findLibraryByName => Library.LibraryRepository.findLibraryByName
	findMediaByName => Media.MediaRepository.findMediaByName
	findMediaByCharacter => Media.MediaRepository.findMediaByCharacter
	findPersonByName => PersonService.findPersonByName
}
'''
	}
	
	def static completeEntity(){
'''
entity LibraryEntity {
	String name //key
	Set<PhysicalMedia> media
	
	repository LibraryRepository {
		findLibraryByName(String name) : Library
	}
}
'''
	}
}