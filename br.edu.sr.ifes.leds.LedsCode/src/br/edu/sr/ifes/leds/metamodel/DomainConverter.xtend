package br.edu.sr.ifes.leds.metamodel

import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
import br.edu.sr.ifes.leds.ledsCodeV001.Module
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields
import java.util.LinkedHashSet
import model.domainLayer.AccessModifier
import model.domainLayer.Attribute
import model.domainLayer.CollectionType
import model.domainLayer.Domain
import model.domainLayer.Entity
import model.domainLayer.Method
import model.domainLayer.PrimaryDateType
import model.domainLayer.PrimaryDateTypeEnum
import model.domainLayer.Repository
import model.domainLayer.ReturnType
import model.domainLayer.SuperAttribute
import org.eclipse.emf.common.util.EList

class DomainConverter {
	
	/**
	 * Metodo que converte uma lista de objetos de dominio provenientes de uma linguagem
	 * em objetos de dominio do metadominio
	 * @author MarcosDias
	 * 
	 * @param listDomainLang Lista de dominio que serao traduzidos de objetos
	 * da linguagem para objetos do metamodelo
	 * @return HashSet<Domain> Set de dominio do metamodelo
	 */
	def converter(EList<DomainBlock> listDomainLang) {
		val setDomainMetaModel = new LinkedHashSet<Domain>
		for(domainLang: listDomainLang){
			val domainMetaModel = new Domain
			domainMetaModel.name = domainLang.name
			domainMetaModel.modules = convertModule(domainLang.module)
			setDomainMetaModel.add(domainMetaModel)
		}
		
		setDomainMetaModel
	}
	
	/**
	 * Método que converte uma lista de modulos provenientes de uma linguagem
	 * em objetos do metamodelo
	 * @author MarcosDias
	 * 
	 * @paran listModulesLang Lista de modulos que serao traduzidos
	 * @return LinkedHashSet<model.domainLayer.Module> Set de modulo de metamodelo
	 */
	def convertModule(EList<Module> listModulesLang) {
		val setModulesMetaModule = new LinkedHashSet<model.domainLayer.Module>
		
		for (moduleLang: listModulesLang){
			var moduleMetaModel = new model.domainLayer.Module
			moduleMetaModel.name = moduleLang.name
			moduleMetaModel.entities = convertEntity(moduleLang.entityBlock)
			//moduleMetaModel.enums = convertEnums(moduleLang.enumBlock)
			//moduleMetaModel.services = convertService(moduleLang.serviceBlock)
			
			setModulesMetaModule.add(moduleMetaModel)
		}
		
		setModulesMetaModule
	}
	
	/**
	 * Metodo que converte uma lista de entidades provenientes de uma linguagem
	 * em objetos do metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityLang Lista de entidades que serao traduzidas de objetos
	 * da linguagem para objetos do metamodelo
	 * @return LinkedHashSet<Entity> Set de entidade do metamodelo
	 */
	def convertEntity(EList<EntityBlock> listEntityLang) {
		var listEntityMetaModel = buildIncompleteEntities(listEntityLang)
		convertClassExtendsEntities(listEntityMetaModel, listEntityLang)
		convertAttributes(listEntityMetaModel, listEntityLang)
		convertRepository(listEntityMetaModel, listEntityLang)
		listEntityMetaModel
	}
	
	/**
	 * Como a entidade se comporta como um grafo com possiveis ciclos,
	 * é necessario que todos as entidades estejam na lista para que os ciclos sejam
	 * montados. Esse metodo monta a lista inicial de entidades do MetaModelo
	 * baseado na linguagem
	 * @author MarcosDias
	 * 
	 * @param listEntityLang List de entidades da linguagem
	 * @return LinkedHashSet<Entity> Lista de entidade do metamodelo
	 */
	def buildIncompleteEntities(EList<EntityBlock> listEntityLang) {
		var listEntityMetaModel = new LinkedHashSet<Entity>
		for(entityLang: listEntityLang){
			var entityMetaModel = new Entity
			entityMetaModel.name = entityLang.name
			entityMetaModel.abstrato = entityLang.isIsAbstract
			entityMetaModel.accessModifier = AccessModifier.fromString(entityLang.acessModifier)
			entityMetaModel.attributes = new LinkedHashSet<Attribute>
			entityMetaModel.classExtends = new LinkedHashSet<Entity>
			entityMetaModel.repository = new Repository
			
			listEntityMetaModel.add(entityMetaModel)
		}
		listEntityMetaModel
	}
	
	/**
	 * Como a entidade se comporta como um grafo com possiveis ciclos,
	 * é necessario que todos as entidades estejam na lista para que os ciclos sejam
	 * montados. Dado que a lista de entidades foi montada, esse método
	 * monta os ciclos existentes.
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de Entidades provenientes do MetaModelo
	 * @paran listEntityLang Lista de Entidades provenientes do linguagem
	 */
	def convertClassExtendsEntities(LinkedHashSet<Entity> listEntityMetaModel, EList<EntityBlock> listEntityLang) {
		for(entityLang: listEntityLang){
			if(entityLang.classExtends != null ){
				buildClassExtendsEntities(listEntityMetaModel, entityLang)
			}
		}
	}
	
	/**
	 * Adiciona as entidades suas classes extensoras
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de entidades do MetaModelo que será processada
	 * @param entityLang entidade da linguagem que que serah processada
	 */
	private def buildClassExtendsEntities(LinkedHashSet<Entity> listEntityMetaModel, EntityBlock entityLang) {
		var entityMetaModel = findEntityInMetaModel(listEntityMetaModel, entityLang)
		for(extendLang: entityLang.classExtends.values){
			var extendsMetaModel = findEntityInMetaModel(listEntityMetaModel, extendLang)
			entityMetaModel.classExtends.add(extendsMetaModel)
		}
	}
	
	/**
	 * Metodo que converte o reposotorio de uma entidade de um metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityLang Lista de entidades que terao seus repositorios
	 * convertidos
	 * @return LinkedHashSet<Entity> Set de entidade do metamodelo
	 */
	def convertRepository(LinkedHashSet<Entity> listEntityMetaModel, EList<EntityBlock> listEntityLang) {
		for(entityLang: listEntityLang){
			var entityMetaModel = findEntityInMetaModel(listEntityMetaModel, entityLang)
			var repositoryMetaModel = new Repository()
			
			repositoryMetaModel.name = entityLang.repository.name
			repositoryMetaModel.methods = convertRepositoriyMethods(
				listEntityMetaModel, entityLang.repository.methods
			)
			entityMetaModel.repository = repositoryMetaModel
		}
	}
	
	def convertRepositoriyMethods(LinkedHashSet<Entity> listEntityMetaModel, EList<RepositoryFields> listRepositoryMethodsLang) {
		var listRepositoryMethodsMetaModelo = new LinkedHashSet<Method>
		for(repositoryMethodslang: listRepositoryMethodsLang){
			var repositoryMethodMetaModel = new Method
			repositoryMethodMetaModel.name = repositoryMethodslang.nameMethod
			
			repositoryMethodMetaModel.returnMethod = convertGenericType(
				listEntityMetaModel, repositoryMethodslang.returnType, new ReturnType
			) as ReturnType 
			
			listRepositoryMethodsMetaModelo.add(repositoryMethodMetaModel)
		}
		listRepositoryMethodsMetaModelo
	}
	
	def SuperAttribute convertGenericType(LinkedHashSet<Entity> listEntityMetaModel, String typeObject, SuperAttribute genericTypeMetaModel) {
		if(typeObject.contains("Set") || typeObject.contains("List")){
			var splitType = typeObject.split("<")
			var collectionType = splitType.get(0)
			var type = splitType.get(1).split(">").get(0)
			genericTypeMetaModel.collectionType = CollectionType.fromString(collectionType)
			processAttrType(type, genericTypeMetaModel, listEntityMetaModel)
		}
		else{
			genericTypeMetaModel.collectionType = null
			processAttrType(typeObject, genericTypeMetaModel, listEntityMetaModel)
		}
		
		genericTypeMetaModel
	}
	
	/**
	 * Metodo que converte uma lista de entidades provenientes de uma linguagem
	 * em objetos do metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de entidades que terao seus atributos
	 * processados
	 * @param listEntityLang Lista de entidades da linguagem para suporte
	 */
	def convertAttributes(LinkedHashSet<Entity> listEntityMetaModel, EList<EntityBlock> listEntityLang) {
		for(entityLang: listEntityLang){
			var entityMetaModel = findEntityInMetaModel(listEntityMetaModel, entityLang)
			entityMetaModel.attributes = new LinkedHashSet<Attribute>
			
			for(attrLang: entityLang.attributes){
				var attrMetaModel = new Attribute
				attrMetaModel.name = attrLang.name
				attrMetaModel.accessModifier = AccessModifier.fromString(attrLang.acessModifier)
				convertGenericType(
					listEntityMetaModel, attrLang.type, attrMetaModel
				) as Attribute
				
				entityMetaModel.attributes.add(attrMetaModel)
			}
		}
	}
	
	/**
	 * Metodo que processa a conversao do tipo da linguagem para o metamodelo
	 * @author MarcosDias
	 * 
	 * @param type Tipo da linguagem proveniente de uma linguagem
	 * @param attrMetaModel atributo do metamodelo que sera processado no momento
	 * @param listEntityMetaModel Lista de entidades do metamodelo
	 */
	def processAttrType(
			String type, 
			SuperAttribute genericTypeMetaModel, 
			LinkedHashSet<Entity> listEntityMetaModel) {
				
		var primitiveType = PrimaryDateTypeEnum.fromString(type)
		
		if(primitiveType == null){
			genericTypeMetaModel.datetype = findEntityInMetaModel(listEntityMetaModel, type)
		}
		else{
			genericTypeMetaModel.datetype = new PrimaryDateType(primitiveType)
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
	def findEntityInMetaModel(LinkedHashSet<Entity> listEntityMetaModel, EntityBlock entityLang) {
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
	def findEntityInMetaModel(LinkedHashSet<Entity> listEntityMetaModel, String nameEntity) {
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