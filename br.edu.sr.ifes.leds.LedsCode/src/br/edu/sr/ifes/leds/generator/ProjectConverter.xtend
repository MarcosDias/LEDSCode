package br.edu.sr.ifes.leds.generator

import br.edu.sr.ifes.leds.ledsCodeV001.Project
import br.edu.sr.ifes.leds.metamodel.AppConverter
import br.edu.sr.ifes.leds.metamodel.DomainConverter
import br.edu.sr.ifes.leds.metamodel.InfrastructureConverter
import br.edu.sr.ifes.leds.metamodel.InterfaceConverter
import br.edu.sr.ifes.leds.model.mainLayer.TableObjects
import java.util.Calendar

class ProjectConverter {
	
	def convert(Project projectLang){
		var tableObjects = new TableObjects
		var projectMetaModel = new br.edu.sr.ifes.leds.model.mainLayer.Project
		
		var infraConverter = new InfrastructureConverter(projectLang, projectMetaModel)
		var ifaceConverter = new InterfaceConverter(projectLang, projectMetaModel)
		var domainConverter = new DomainConverter(projectLang, projectMetaModel)
		var appConverter = new AppConverter(projectLang, projectMetaModel)
		
		projectMetaModel.name = projectLang.name
		projectMetaModel.created = Calendar.instance
		
		convertDomains(projectMetaModel, domainConverter, projectLang, tableObjects)
		convertInfrastructure(projectMetaModel, infraConverter, projectLang, tableObjects)
		convertApplication(projectMetaModel, appConverter, projectLang, tableObjects)
		convertInterface(projectMetaModel, ifaceConverter, projectLang, tableObjects)
		
		tableObjects.project = projectMetaModel		
		tableObjects
	}
	
	def convertInterface(br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel, InterfaceConverter ifaceConverter, Project projectLang, TableObjects tableObjects) {
		projectMetaModel.iface = ifaceConverter.conveter(
			projectLang.interfaceBlock, projectMetaModel.applications
		)
		tableObjects.iface = projectMetaModel.iface
	}
	
	def convertApplication(br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel, AppConverter appConverter, Project projectLang, TableObjects tableObjects) {
		projectMetaModel.applications = appConverter.conveter(
			projectLang.applicationBlock, projectMetaModel.domains
		)
		tableObjects.apps = projectMetaModel.applications
	}
	
	def convertInfrastructure(br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel, InfrastructureConverter infraConverter, Project projectLang, TableObjects tableObjects
	) {
		projectMetaModel.infrastructure = infraConverter.convert(projectLang.infrastructureBlock)
		tableObjects.infrastructure = projectMetaModel.infrastructure
	}
	
	def convertDomains(br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel, DomainConverter domainConverter, Project projectLang, TableObjects tableObjects) {
		projectMetaModel.domains = domainConverter.converter(projectLang.domainBlock, tableObjects)
		tableObjects.domains = projectMetaModel.domains;
	}
}