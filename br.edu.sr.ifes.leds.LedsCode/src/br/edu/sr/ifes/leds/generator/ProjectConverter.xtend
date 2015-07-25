package br.edu.sr.ifes.leds.generator

import br.edu.sr.ifes.leds.ledsCodeV001.Project
import br.edu.sr.ifes.leds.metamodel.DomainConverter
import br.edu.sr.ifes.leds.metamodel.InfrastructureConverter
import br.edu.sr.ifes.leds.metamodel.InterfaceConverter
import java.util.Calendar

class ProjectConverter {
	
	model.mainLayer.Project projectMetaModel
	
	InfrastructureConverter infraConverter
	InterfaceConverter ifaceConverter
	DomainConverter domainConverter	
	
	def convert(Project projectLang){
		projectMetaModel.name = projectLang.name
		projectMetaModel.created = Calendar.instance
		projectMetaModel.domains = domainConverter.converter(projectLang.domainBlock)
		projectMetaModel.infrastructure = infraConverter.convert(projectLang.infrastructureBlock)
		projectMetaModel.iface = ifaceConverter.conveter(projectLang.interfaceBlock)
		
		projectMetaModel
	}
	
	new(){
		projectMetaModel = new model.mainLayer.Project
		infraConverter = new InfrastructureConverter
		ifaceConverter = new InterfaceConverter
		domainConverter = new DomainConverter
	}
}