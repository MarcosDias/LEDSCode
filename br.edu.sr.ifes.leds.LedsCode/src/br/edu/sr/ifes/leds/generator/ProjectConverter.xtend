package br.edu.sr.ifes.leds.generator

import br.edu.sr.ifes.leds.ledsCodeV001.Project
import br.edu.sr.ifes.leds.metamodel.DomainConverter
import br.edu.sr.ifes.leds.metamodel.InfrastructureConverter
import br.edu.sr.ifes.leds.metamodel.InterfaceConverter
import java.util.Calendar
import br.edu.sr.ifes.leds.metamodel.AppConverter

class ProjectConverter {
	
	def convert(Project projectLang){
		var projectMetaModel = new model.mainLayer.Project
		var infraConverter = new InfrastructureConverter
		var ifaceConverter = new InterfaceConverter
		var domainConverter = new DomainConverter
		var appConverter = new AppConverter
		
		projectMetaModel.name = projectLang.name
		projectMetaModel.created = Calendar.instance
		projectMetaModel.domains = domainConverter.converter(projectLang.domainBlock)
		projectMetaModel.infrastructure = infraConverter.convert(projectLang.infrastructureBlock)
		projectMetaModel.applications = appConverter.conveter(
			projectLang.applicationBlock, projectMetaModel.domains
		)
		projectMetaModel.iface = ifaceConverter.conveter(
			projectLang.interfaceBlock, projectMetaModel.applications
		)
		
		projectMetaModel
	}
}