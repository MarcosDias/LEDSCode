package br.edu.sr.ifes.leds.metamodel.domainlayer

import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod
import br.edu.sr.ifes.leds.metamodel.util.FindEntity
import br.edu.sr.ifes.leds.metamodel.util.FindRepositoryMethod
import java.util.LinkedHashSet
import model.domainLayer.Entity
import model.domainLayer.InternalServiceMethod
import model.domainLayer.Service
import org.eclipse.emf.common.util.EList
import model.domainLayer.Module

class ServiceConverter {
	
	FindEntity findEntity
	FindRepositoryMethod findRepositoryMethod
	
	def convert(EList<ServiceBlock> listServiceLang, Module moduleMetaModel) {
		var listServiceMetaModel = new LinkedHashSet<Service>
		for(serviceLang: listServiceLang){
			var serviceMetaModel = new Service
			serviceMetaModel.parent = moduleMetaModel
			serviceMetaModel.name = serviceLang.name
			serviceMetaModel.methods = convertServiceMethod(serviceLang.serviceFields, moduleMetaModel.entities)
			listServiceMetaModel.add(serviceMetaModel)
		}
		
		listServiceMetaModel
	}
	
	def convertServiceMethod(EList<ServiceMethod> listServiceLang, LinkedHashSet<Entity> listEntityMetaModel) {
		var listServiceMethodsMetaModel = new LinkedHashSet<model.domainLayer.ServiceMethod>
		for(serviceMethodLang: listServiceLang){
			var servicemethodMetaModel = compileService(serviceMethodLang.methodAcess, listEntityMetaModel)
			servicemethodMetaModel.name = serviceMethodLang.name
			listServiceMethodsMetaModel.add(servicemethodMetaModel)
		}		
		listServiceMethodsMetaModel
	}
	
	def compileService(String methodAcessLang, LinkedHashSet<Entity> listEntityMetaModel) {
		var splitMethodAcessLang = methodAcessLang.split("\\.")
		var serviceMethodMetaModel = new InternalServiceMethod
		serviceMethodMetaModel.entity = findEntity.inMetaModel(listEntityMetaModel, splitMethodAcessLang.get(0))
		var repositoryMethod = findRepositoryMethod.inRepository(
			serviceMethodMetaModel.entity.repository.methods, splitMethodAcessLang.get(2)
		)
		serviceMethodMetaModel.method = repositoryMethod
		serviceMethodMetaModel
	}
	
	new(){
		findEntity = new FindEntity
		findRepositoryMethod = new FindRepositoryMethod
	}
	
}