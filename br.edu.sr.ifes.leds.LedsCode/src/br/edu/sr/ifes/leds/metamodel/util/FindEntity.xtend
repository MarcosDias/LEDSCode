package br.edu.sr.ifes.leds.metamodel.util

import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
import br.edu.sr.ifes.leds.model.domainLayer.ClassEnum
import br.edu.sr.ifes.leds.model.domainLayer.Entity
import br.edu.sr.ifes.leds.model.domainLayer.SuperClass
import br.edu.sr.ifes.leds.model.mainLayer.TableObjects
import java.util.Arrays
import java.util.List

class FindEntity {	
	
	FindModule findModule
	
	def Entity findFullPathEntity(List<Entity> listEntity, String full){
		var splitedReverseName = full.split('\\.').reverse
		var resultEntntity = this.inMetaModel(listEntity, splitedReverseName.head as String)
		
		if(resultEntntity == null){
			throw new Exception("Could not find the entity " + full)
		}
		
		this.findModule.findInverseFullPathModule(resultEntntity.parent, Arrays.asList(splitedReverseName.tail), full)
		
		resultEntntity
	}
	
	def SuperClass findFullPath(TableObjects tableObjects, String fullName){
		var nameResult = fullName
		fullName.contains('.'){
			var splitedReverseName = fullName.split('\\.').reverse
			nameResult =  splitedReverseName.head as String
		}
		
		try{
		 	this.inMetaModel(tableObjects.entities, nameResult) as SuperClass
	 	} catch(Exception e) {
	 		this.inEnums(tableObjects.enums, nameResult) as SuperClass
	 	}
	}
	
	/**
	 * Método que busca uma entidade em um metamodelo,caso encontrado, 
	 * ele é retornado
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de entidades de um metamodelo
	 * @param entityLang Objeto entidade de uma linguagem que serah buscado em um metamodelo
	 * @return Entity Caso entrontrado retorna a entidade de um metamodelo, caso contrario, retorna null
	 */
	def inMetaModel(List<Entity> listEntityMetaModel, EntityBlock entityLang) {
		findEntityInList(listEntityMetaModel, entityLang.name)
	}
	
	/**
	 * Método que busca uma entidade em um metamodelo,caso encontrado, 
	 * ele é retornado
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de entidades de um metamodelo
	 * @param nameEntity Nome da entidade que deseja ser buscada
	 * @return Entity Caso entrontrado retorna a entidade de um metamodelo, caso contrario, retorna null
	 */
	def inMetaModel(List<Entity> listEntityMetaModel, String nameEntity) {
		findEntityInList(listEntityMetaModel, nameEntity)
	}
	
	def inEnums(List<ClassEnum> cEnums, String name) {
		for(ennum: cEnums){
			if(name.equals(ennum.name)){
				return ennum
			}
		}
		throw new Exception("Could not find the enum " + name)
	}
	
	
	/**
	 * Metodo generico que busca entitdade em um metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de entidades de um metamodelo
	 * @param nameEntity Nome da entidade que deseja ser buscada
	 * @return Entity Caso entrontrado retorna a entidade de um metamodelo, caso contrario, retorna null
	 */
	private def findEntityInList(List<Entity> listEntityMetaModel, String nameEntity){
		for(entityMetaModel: listEntityMetaModel){
			if(entityMetaModel.name.equals(nameEntity)) 
				return entityMetaModel
		}
		throw new Exception("Could not find the entity " + nameEntity)
	}
	
	new(){
		this.findModule = new FindModule
	}
}