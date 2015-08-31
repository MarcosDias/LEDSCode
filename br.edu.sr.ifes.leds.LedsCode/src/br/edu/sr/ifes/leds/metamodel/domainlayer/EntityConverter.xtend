package br.edu.sr.ifes.leds.metamodel.domainlayer

import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
import br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields
import br.edu.sr.ifes.leds.metamodel.util.FindEntity
import java.util.LinkedHashSet
import model.domainLayer.AccessModifier
import model.domainLayer.Attribute
import model.domainLayer.CollectionType
import model.domainLayer.Entity
import model.domainLayer.Method
import model.domainLayer.Parameter
import model.domainLayer.PrimaryDateType
import model.domainLayer.PrimaryDateTypeEnum
import model.domainLayer.Repository
import model.domainLayer.ReturnType
import model.domainLayer.SuperAttribute
import org.eclipse.emf.common.util.EList
import model.domainLayer.Constraints
import model.domainLayer.Module
import model.mainLayer.TableObjects

class EntityConverter {
	FindEntity findEntity
	
	/**
	 * Metodo que converte uma lista de entidades provenientes de uma linguagem
	 * em objetos do metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityLang Lista de entidades que serao traduzidas de objetos
	 * da linguagem para objetos do metamodelo
	 * @param moduleMetaModel Modulo que está sendo processado no momento
	 * @return LinkedHashSet<Entity> Set de entidade do metamodelo
	 */
	def convert(EList<EntityBlock> listEntityLang, Module moduleMetaModel, TableObjects tableObjects) {
		var listEntityMetaModel = buildIncompleteEntities(listEntityLang, moduleMetaModel, tableObjects)
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
	 * @param moduleMetaModel Modulo que está sendo processado no momento
	 * @return LinkedHashSet<Entity> Lista de entidade do metamodelo
	 */
	def buildIncompleteEntities(EList<EntityBlock> listEntityLang, Module moduleMetaModel, TableObjects tableObjects) {
		var listEntityMetaModel = new LinkedHashSet<Entity>
		for(entityLang: listEntityLang){
			var entityMetaModel = new Entity
			entityMetaModel.parent = moduleMetaModel
			entityMetaModel.name = entityLang.name
			entityMetaModel.abstrato = entityLang.isIsAbstract
			entityMetaModel.accessModifier = AccessModifier.fromString(entityLang.acessModifier)
			entityMetaModel.attributes = new LinkedHashSet<Attribute>
			entityMetaModel.classExtends = new LinkedHashSet<Entity>
			entityMetaModel.repository = new Repository
			
			listEntityMetaModel.add(entityMetaModel)
			tableObjects.entities.add(entityMetaModel)
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
		var entityMetaModel = findEntity.inMetaModel(listEntityMetaModel, entityLang)
		for(extendLang: entityLang.classExtends.values){
			var extendsMetaModel = findEntity.inMetaModel(listEntityMetaModel, extendLang)
			entityMetaModel.classExtends.add(extendsMetaModel)
		}
	}
	
	/**
	 * Metodo que converte o reposotorio de uma entidade de um metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de Entidades provenientes do MetaModelo
	 * convertidos
	 * @return LinkedHashSet<Entity> Set de entidade do metamodelo
	 */
	def convertRepository(LinkedHashSet<Entity> listEntityMetaModel, EList<EntityBlock> listEntityLang) {
		for(entityLang: listEntityLang){
			var entityMetaModel = findEntity.inMetaModel(listEntityMetaModel, entityLang)
			var repositoryMetaModel = new Repository()
			if (entityLang.repository !=null){
				repositoryMetaModel.name = entityLang.repository.name
					repositoryMetaModel.methods = convertRepositoriyMethods(
				listEntityMetaModel, entityLang.repository.methods
			)
			entityMetaModel.repository = repositoryMetaModel
			} 
			
		}
	}
	
	/**
	 * Método que converte os metodos dos repositorios para metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityLang Lista de entidades que terao seus repositorios
	 * convertidos
	 * @param listRepositoryMethodsLang Lista de metodos de um repositorio de uma linguagem
	 * @return LinkedHashSet<Method> Lista de metodos de um repositorio já em no 
	 * formato do MetaModelo 
	 */
	def convertRepositoriyMethods(LinkedHashSet<Entity> listEntityMetaModel, EList<RepositoryFields> listRepositoryMethodsLang) {
		var listRepositoryMethodsMetaModelo = new LinkedHashSet<Method>
		for(repositoryMethodslang: listRepositoryMethodsLang){
			var repositoryMethodMetaModel = new Method
			repositoryMethodMetaModel.name = repositoryMethodslang.nameMethod
			
			repositoryMethodMetaModel.returnMethod = convertGenericType(
				listEntityMetaModel, repositoryMethodslang.returnType, new ReturnType
			) as ReturnType 
			repositoryMethodMetaModel.parameters = convertparameters(listEntityMetaModel, repositoryMethodslang.methodsParameters)
			listRepositoryMethodsMetaModelo.add(repositoryMethodMetaModel)
		}
		listRepositoryMethodsMetaModelo
	}
	
	/**
	 * Metodo que converte uma lista de parametros em parametros para um metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de Entidades provenientes do MetaModelo
	 * @param parameteresLang Lista de paramentros que seram convertidos
	 * @return LinkedHashSet<Parameter> Lista de parametros do metamodelo
	 */
	def convertparameters(LinkedHashSet<Entity> listEntityMetaModel, MethodParameter parameteresLang) {
		var parameteresMetaModel = new LinkedHashSet<Parameter>
		if(parameteresLang != null){
			for(paramLang: parameteresLang.typeAndAttr){
				var paramMetaModel = new Parameter
				paramMetaModel.name = paramLang.name
				convertGenericType(
					listEntityMetaModel, paramLang.type, paramMetaModel
				)
				parameteresMetaModel.add(paramMetaModel)
			}
		}
		parameteresMetaModel
	}
	
	/**
	 * Método que converte um tipo de um objeto para um tipo do metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de Entidades do MetaModelo
	 * @param typeObject Nome do tipo do objeto que deseja ser traduzido
	 * @param genericTypeMetaModel Objeto de destino após a conversão,
	 * podendo ser um `Attribute`, `ReturnType` ou um `Parameter`
	 * @return SuperAttribute Objecto Convertido e com o tipo correto
	 */
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
			var entityMetaModel = findEntity.inMetaModel(listEntityMetaModel, entityLang)
			entityMetaModel.attributes = new LinkedHashSet<Attribute>
			
			for(attrLang: entityLang.attributes){
				var attrMetaModel = new Attribute
				attrMetaModel.name = attrLang.name
				attrMetaModel.accessModifier = AccessModifier.fromString(attrLang.acessModifier)
				attrMetaModel.constraints = processConstraintsAttr(attrLang)
				convertGenericType(
					listEntityMetaModel, attrLang.type, attrMetaModel
				) as Attribute
				
				entityMetaModel.attributes.add(attrMetaModel)
			}
		}
	}
	
	/**
	 * Metodo que converte a constraint usada para o MetaModelo
	 * @author MarcosDias
	 * 
	 * @param attr Atributo da Linguagem que sera usada para converter o Constraint
	 * @return Constraint do MetaModelo
	 */
	def processConstraintsAttr(br.edu.sr.ifes.leds.ledsCodeV001.Attribute attr) {
		var const = new Constraints()
		const.pk = attr.pk
		const.unique = Boolean.parseBoolean(attr.unique)
		const.nullable = Boolean.parseBoolean(attr.nullable)
		const.max = attr.max
		const.min = attr.min
		
		const
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
			genericTypeMetaModel.datetype = findEntity.inMetaModel(listEntityMetaModel, type)
		}
		else{
			genericTypeMetaModel.datetype = new PrimaryDateType(primitiveType)
		}
	}
	
	new(){
		findEntity = new FindEntity
	}
}