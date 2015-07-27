package br.edu.sr.ifes.leds.metamodel.util

import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
import java.util.LinkedHashSet
import model.domainLayer.Entity

class FindEntity {
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
	def inMetaModel(LinkedHashSet<Entity> listEntityMetaModel, String nameEntity) {
		findEntityInList(listEntityMetaModel, nameEntity)
	}
	
	/**
	 * Metodo generico que busca entitdade em um metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de entidades de um metamodelo
	 * @param nameEntity Nome da entidade que deseja ser buscada
	 * @return Entity Caso entrontrado retorna a entidade de um metamodelo, caso contrario, retorna null
	 */
	private def findEntityInList(LinkedHashSet<Entity> listEntityMetaModel, String nameEntity){
		for(entityMetaModel: listEntityMetaModel){
			if(entityMetaModel.name.equals(nameEntity)) 
				return entityMetaModel
		}
		null
	}
}