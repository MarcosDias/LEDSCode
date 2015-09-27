package br.edu.sr.ifes.leds.metamodel.domainlayer

import br.edu.sr.ifes.leds.ledsCodeV001.Project
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod
import br.edu.sr.ifes.leds.metamodel.util.FindEntity
import br.edu.sr.ifes.leds.metamodel.util.FindRepositoryMethod
import br.edu.sr.ifes.leds.metamodel.util.FindService
import java.util.LinkedHashSet
import model.domainLayer.Entity
import model.domainLayer.Module
import model.domainLayer.Service
import model.mainLayer.TableObjects
import org.eclipse.emf.common.util.EList

class ServiceConverter {
	
	FindEntity findEntity
	FindRepositoryMethod findRepositoryMethod
	FindService findService
	
	Project projectLang
	model.mainLayer.Project projectMetaModel
		
	def convert(EList<ServiceBlock> listServiceLang, Module moduleMetaModel, TableObjects tableObjects) {
		var listServiceMetaModel = new LinkedHashSet<Service>
		for(serviceLang: listServiceLang){
			var serviceMetaModel = new Service
			serviceMetaModel.parent = moduleMetaModel
			serviceMetaModel.name = serviceLang.name
			serviceMetaModel.methods = convertServiceMethod(serviceLang.serviceFields, moduleMetaModel.entities, tableObjects)
			
			listServiceMetaModel.add(serviceMetaModel)
			tableObjects.services.add(serviceMetaModel)
		}
		
		listServiceMetaModel
	}
	
	def convertServiceMethod(EList<ServiceMethod> listServiceLang, LinkedHashSet<Entity> listEntityMetaModel, TableObjects tableObjects) {
		var listServiceMethodsMetaModel = new LinkedHashSet<model.domainLayer.ServiceMethod>
		for(serviceMethodLang: listServiceLang){
			var serviceMethodMetaModel = compileService(serviceMethodLang, listEntityMetaModel, tableObjects)
			listServiceMethodsMetaModel.add(serviceMethodMetaModel)
		}
		listServiceMethodsMetaModel
	}
	
	def compileService(ServiceMethod serviceMethodLang, LinkedHashSet<Entity> listEntityMetaModel, TableObjects tableObjects) {
		var serviceMethodMetaModel = new model.domainLayer.ServiceMethod
		serviceMethodMetaModel.name = serviceMethodLang.name
		serviceMethodMetaModel.methodService = findService.inMetaModel(tableObjects.entities, serviceMethodLang.methodAcess)
		
		serviceMethodMetaModel
	}
	
	new(Project projectLang, model.mainLayer.Project projectMetaModel) {
		findEntity = new FindEntity
		findRepositoryMethod = new FindRepositoryMethod
		findService = new FindService
		
		this.projectLang = projectLang
		this.projectMetaModel = projectMetaModel
	}
}