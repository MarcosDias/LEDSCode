package br.edu.sr.ifes.leds.metamodel.util

import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
import java.util.Arrays
import java.util.LinkedHashSet
import java.util.Set
import model.domainLayer.ClassEnum
import model.domainLayer.Entity

class FindEntity {	
	
	FindModule findModule
	
	def Entity findFullPathEntity(Set<Entity> listEntity, String full){
		var splitedReverseName = full.split('\\.').reverse
		var resultEntntity = this.inMetaModel(listEntity, splitedReverseName.head as String)
		
		if(resultEntntity == null){
			throw new Exception("Could not find the entity " + full)
		}
		
		this.findModule.findInverseFullPathModule(resultEntntity.parent, Arrays.asList(splitedReverseName.tail), full)
		
		resultEntntity
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
	def inMetaModel(LinkedHashSet<Entity> listEntityMetaModel, EntityBlock entityLang) {
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
	def inMetaModel(Set<Entity> listEntityMetaModel, String nameEntity) {
		findEntityInList(listEntityMetaModel, nameEntity)
	}
	
	def inEnums(Set<ClassEnum> cEnums, String name) {
		for(ennum: cEnums){
			if(name.equals(ennum.name)){
				return ennum
			}
		}
		return null
	}
	
	
	/**
	 * Metodo generico que busca entitdade em um metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de entidades de um metamodelo
	 * @param nameEntity Nome da entidade que deseja ser buscada
	 * @return Entity Caso entrontrado retorna a entidade de um metamodelo, caso contrario, retorna null
	 */
	private def findEntityInList(Set<Entity> listEntityMetaModel, String nameEntity){
		for(entityMetaModel: listEntityMetaModel){
			if(entityMetaModel.name.equals(nameEntity)) 
				return entityMetaModel
		}
		return null
	}
	
	new(){
		this.findModule = new FindModule
	}
}