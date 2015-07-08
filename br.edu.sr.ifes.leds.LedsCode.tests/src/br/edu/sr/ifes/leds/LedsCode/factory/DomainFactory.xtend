package br.edu.sr.ifes.leds.LedsCode.factory

class DomainFactory {
	def static domainBlock(){
'''
domain Domain1 {
	«moduleBlock()»
}
domain Domain2 {
	«moduleBlock()»
}
'''
	}
	
	def static moduleBlock(){
'''
module Module {
	«serviceBlock()»
	«entityBlock()»
	«enumBlock()»
}
'''
	}
	
	def static serviceBlock(){
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

service PersonService {
	findPersonByName => PersonRepository.findPersonByName
}
'''
	}
	
	def static entityBlock(){
'''
abstract entity Media : SuperClass1, SuperClass2 {
	private String titleb
	- Set<PhysicalMedia> physicalMedia
	
	repository MediaRepository {
	    findMediaByCharacter(String characterName) : List<Media>
	    findMediaByName(Long libraryId, String name) : List<Media>
  }
}

entity LibraryEntity : Media{
	String name //key
	Set<PhysicalMedia> media
	
	repository LibraryRepository {
		findLibraryByName(String name) : Library
	}
}
'''
	}
	
	def static enumBlock() {
'''
enum Gender {
	FEMALE,
	MALE
}

enum Gen {
	FEM,
	MA
}
'''
	}
}