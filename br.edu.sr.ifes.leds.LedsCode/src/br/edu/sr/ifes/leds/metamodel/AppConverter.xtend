package br.edu.sr.ifes.leds.metamodel

import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock
import java.util.LinkedHashSet
import model.applicationLayer.Application
import model.applicationLayer.SpecificApplicationDomain
import model.domainLayer.Domain
import org.eclipse.emf.common.util.EList

class AppConverter {
	
	def conveter(EList<ApplicationBlock> listAppLang, LinkedHashSet<Domain> listDomainMetaModel) {
		var listAppMetaModel = new LinkedHashSet<Application>
		for(appLang: listAppLang){
			var appMetaModel = new Application
			appMetaModel.name = appLang.name
			//appMetaModel.structure = convertStructureApp(appLang.applicationDomain, listDomainMetaModel)
			
			listAppMetaModel.add(appMetaModel)
		}
		listAppMetaModel
	}
	
	def convertStructureApp(EList<String> listAppDomainLang, LinkedHashSet<Domain> listDomainsMetaModel) {
		var listAppStructureMetaModel = new LinkedHashSet<SpecificApplicationDomain>
		for(appDomainLang: listAppDomainLang){
			/*var structureApp = convertSpecificationApp(
				appDomainLang, listDomainsMetaModel
			)
			listAppStructureMetaModel.add(structureApp)*/
		} 
		
		listAppStructureMetaModel
	}
}