package br.edu.sr.ifes.leds.metamodel.domainlayer

import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
import br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter
import br.edu.sr.ifes.leds.ledsCodeV001.Project
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields
import br.edu.sr.ifes.leds.metamodel.util.FindEntity
import br.edu.sr.ifes.leds.model.domainLayer.AccessModifier
import br.edu.sr.ifes.leds.model.domainLayer.Attribute
import br.edu.sr.ifes.leds.model.domainLayer.CollectionType
import br.edu.sr.ifes.leds.model.domainLayer.Constraints
import br.edu.sr.ifes.leds.model.domainLayer.Entity
import br.edu.sr.ifes.leds.model.domainLayer.Method
import br.edu.sr.ifes.leds.model.domainLayer.Module
import br.edu.sr.ifes.leds.model.domainLayer.Parameter
import br.edu.sr.ifes.leds.model.domainLayer.PrimaryDateType
import br.edu.sr.ifes.leds.model.domainLayer.PrimaryDateTypeEnum
import br.edu.sr.ifes.leds.model.domainLayer.Repository
import br.edu.sr.ifes.leds.model.domainLayer.ReturnType
import br.edu.sr.ifes.leds.model.domainLayer.SuperAttribute
import br.edu.sr.ifes.leds.model.mainLayer.TableObjects
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.EList

class EntityConverter {
	FindEntity findEntity
	
	Project projectLang
	
	br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel
	
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
		convertClassExtendsEntities(tableObjects.entities, listEntityLang)
		convertAttributes(listEntityMetaModel, listEntityLang, tableObjects)
		convertRepository(listEntityMetaModel, listEntityLang, tableObjects)
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
	 * @return ArrayList<Entity> Lista de entidade do metamodelo
	 */
	def buildIncompleteEntities(EList<EntityBlock> listEntityLang, Module moduleMetaModel, TableObjects tableObjects) {
		var listEntityMetaModel = new ArrayList<Entity>
		for(entityLang: listEntityLang){
			var entityMetaModel = new Entity
			entityMetaModel.parent = moduleMetaModel
			entityMetaModel.name = entityLang.name
			entityMetaModel.abstrato = entityLang.isIsAbstract
			entityMetaModel.accessModifier = AccessModifier.fromString(entityLang.acessModifier)
			entityMetaModel.attributes = new ArrayList<Attribute>
			entityMetaModel.classExtends = new ArrayList<Entity>
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
	def convertClassExtendsEntities(List<Entity> listEntityMetaModel, EList<EntityBlock> listEntityLang) {
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
	private def buildClassExtendsEntities(List<Entity> listEntityMetaModel, EntityBlock entityLang) {
		var entityMetaModel = findEntity.inMetaModel(listEntityMetaModel, entityLang.name)
		for(extendLang: entityLang.classExtends.values){
			var extendsMetaModel = findEntity.inMetaModel(listEntityMetaModel, extendLang.name)
			entityMetaModel.classExtends.add(extendsMetaModel)
		}
	}
	
	/**
	 * Metodo que converte o reposotorio de uma entidade de um metamodelo
	 * @author MarcosDias
	 * 
	 * @param listEntityMetaModel Lista de Entidades provenientes do MetaModelo
	 * convertidos
	 * @return ArrayList<Entity> Set de entidade do metamodelo
	 */
	def convertRepository(List<Entity> listEntityMetaModel, EList<EntityBlock> listEntityLang, TableObjects tableObjects) {
		for(entityLang: listEntityLang){
			var entityMetaModel = findEntity.inMetaModel(listEntityMetaModel, entityLang)
			var repositoryMetaModel = new Repository()
			if (entityLang.repository !=null){
				repositoryMetaModel.name = entityLang.repository.name
				repositoryMetaModel.methods = convertRepositoriyMethods(
					listEntityMetaModel, entityLang.repository.methods, repositoryMetaModel, tableObjects
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
	 * @return List<Method> Lista de metodos de um repositorio já em no 
	 * formato do MetaModelo 
	 */
	def convertRepositoriyMethods(List<Entity> listEntityMetaModel, 
		EList<RepositoryFields> listRepositoryMethodsLang, 
		Repository repositoryMetaModel, 
		TableObjects tableObjects
	) {
		var listRepositoryMethodsMetaModelo = new ArrayList<Method>
		for(repositoryMethodslang: listRepositoryMethodsLang){
			var repositoryMethodMetaModel = new Method
			repositoryMethodMetaModel.name = repositoryMethodslang.name
			repositoryMethodMetaModel.parent = repositoryMetaModel
			repositoryMethodMetaModel.returnMethod = convertGenericType(
				listEntityMetaModel, repositoryMethodslang.returnType, new ReturnType, tableObjects
			) as ReturnType 
			repositoryMethodMetaModel.parameters = convertparameters(
				listEntityMetaModel, repositoryMethodslang.methodsParameters, tableObjects
			)
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
	 * @return List<Parameter> Lista de parametros do metamodelo
	 */
	def convertparameters(List<Entity> listEntityMetaModel, MethodParameter parameteresLang, TableObjects tableObjects) {
		var parameteresMetaModel = new ArrayList<Parameter>
		if(parameteresLang != null){
			for(paramLang: parameteresLang.typeAndAttr){
				var paramMetaModel = new Parameter
				paramMetaModel.name = paramLang.name
				convertGenericType(
					listEntityMetaModel, paramLang.type, paramMetaModel, tableObjects
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
	def SuperAttribute convertGenericType(List<Entity> listEntityMetaModel, String typeObject, SuperAttribute genericTypeMetaModel, TableObjects tableObjects) {
		if(typeObject.contains("Set<") || typeObject.contains("List<")){
			var splitType = typeObject.split("<")
			var collectionType = splitType.get(0)
			var type = splitType.get(1).split(">").get(0)
			genericTypeMetaModel.collectionType = CollectionType.fromString(collectionType)
			processAttrType(type, genericTypeMetaModel, listEntityMetaModel, tableObjects)
		}
		else{
			genericTypeMetaModel.collectionType = null
			processAttrType(typeObject, genericTypeMetaModel, listEntityMetaModel, tableObjects)
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
	def convertAttributes(List<Entity> listEntityMetaModel, EList<EntityBlock> listEntityLang, TableObjects tableObjects) {
		for(entityLang: listEntityLang){
			var entityMetaModel = findEntity.inMetaModel(listEntityMetaModel, entityLang)
			entityMetaModel.attributes = new ArrayList<Attribute>
			
			for(attrLang: entityLang.attributes){
				var attrMetaModel = new Attribute
				attrMetaModel.name = attrLang.name
				attrMetaModel.accessModifier = AccessModifier.fromString(attrLang.acessModifier)
				attrMetaModel.constraints = processConstraintsAttr(attrLang)
				convertGenericType(
					listEntityMetaModel, attrLang.type, attrMetaModel, tableObjects
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
			List<Entity> listEntityMetaModel,
			TableObjects tableObjects) {
		
		var primitiveType = PrimaryDateTypeEnum.fromString(type) as PrimaryDateTypeEnum
		
		if(primitiveType == null){
			genericTypeMetaModel.datetype = findEntity.findFullPath(tableObjects, type)
		}
		else{
			genericTypeMetaModel.datetype = new PrimaryDateType(primitiveType)
		}
	}
	
	new(Project projectLang, br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel) {
		findEntity = new FindEntity
		
		this.projectLang = projectLang
		this.projectMetaModel = projectMetaModel
	}
}