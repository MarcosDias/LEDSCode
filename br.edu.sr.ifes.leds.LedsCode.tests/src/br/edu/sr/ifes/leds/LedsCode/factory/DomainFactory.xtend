package br.edu.sr.ifes.leds.LedsCode.factory

class DomainFactory {
	def static domainBlock(){
'''
domain Domain {
	«moduleBlock()»
}
'''
	}
	
	def static moduleBlock(){
'''
module Modulo {
	«serviceBlock()»
	«entityBlock()»
	«enumBlock()»
}
'''
	}
	
	def static serviceBlock(){
'''
service PersonService {
	findPersonByName => PersonRepository.findPersonByName
}

service LibraryService {
	//nome => entity.repositorio.metodo
	//nome => service.metodo
	//nome => module.service.metodo
	//nome => domain.module.service.metodo
	findLibraryByName => Library.LibraryRepository.findLibraryByName
	findMediaByName => Media.MediaRepository.findMediaByName
}
'''
	}
	
	def static entityBlock(){
'''
abstract entity Media {
	private String titleb
	private Set<PhysicalMedia> physicalMedia
	private Set<Engagement> engagements
	private Set<MediaCharacter> mediaCharacters

	repository MediaRepository {
	    findMediaByCharacter(String characterName) : List<Media>
	    //findById
	    //save
	    //findAll
	    findMediaByName(Long libraryId, String name) : List<Media>
  }
}

entity LibraryEntity extends Media{
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
	F,
	M
}
'''
	}
}