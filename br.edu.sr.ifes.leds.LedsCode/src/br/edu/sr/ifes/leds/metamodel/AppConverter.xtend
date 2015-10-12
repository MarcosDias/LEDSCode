package br.edu.sr.ifes.leds.metamodel

import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock
import br.edu.sr.ifes.leds.ledsCodeV001.Project
import br.edu.sr.ifes.leds.metamodel.util.FindDomain
import br.edu.sr.ifes.leds.metamodel.util.FindModule
import br.edu.sr.ifes.leds.model.applicationLayer.Application
import br.edu.sr.ifes.leds.model.applicationLayer.SpecificApplicationDomain
import br.edu.sr.ifes.leds.model.applicationLayer.SpecificApplicationModule
import br.edu.sr.ifes.leds.model.domainLayer.Domain
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import org.eclipse.emf.common.util.EList

class AppConverter {

	Project projectLang
	br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel

	def conveter(EList<ApplicationBlock> listAppLang, List<Domain> listDomainMetaModel) {
		var listAppMetaModel = new ArrayList<Application>
		for (appLang : listAppLang) {
			var appMetaModel = new Application
			appMetaModel.name = appLang.name
			appMetaModel.structure = convertStructureApp(appLang.applicationDomain, listDomainMetaModel)

			listAppMetaModel.add(appMetaModel)
		}
		listAppMetaModel
	}

	def convertStructureApp(EList<String> listAppDomainLang, List<Domain> listDomainsMetaModel) {
		var listAppStructureMetaModel = new ArrayList<SpecificApplicationDomain>

		for (singleStrutureApp : listAppDomainLang) {
			var strutureAppLang = singleStrutureApp.split("\\.")
			var singleStrutureMetaModel = convertSpecificationDomainApp(
				new ArrayList<String>(Arrays.asList(strutureAppLang)),
				listDomainsMetaModel
			)

			listAppStructureMetaModel.add(singleStrutureMetaModel)
		}

		listAppStructureMetaModel
	}

	def convertSpecificationDomainApp(List<String> strutureAppLang, List<Domain> domains) {
		var strutureDomainAppMetaModel = new SpecificApplicationDomain
		var findDomain = new FindDomain
		strutureDomainAppMetaModel.domain = findDomain.inMetaModel(
			domains,
			strutureAppLang.get(0)
		)
		strutureAppLang.remove(0)
		strutureDomainAppMetaModel.son = convertSpecificationModuleApp(
			strutureAppLang,
			strutureDomainAppMetaModel.domain
		)

		strutureDomainAppMetaModel
	}

	def convertSpecificationModuleApp(List<String> strutureAppLang, Domain domain) {
		if(strutureAppLang.size == 1) return null

		var strutureModuleAppMetaModel = new SpecificApplicationModule
		var findModule = new FindModule
		strutureModuleAppMetaModel.module = findModule.inMetaModel(
			domain.modules,
			strutureAppLang.get(0)
		)

		strutureModuleAppMetaModel
	}

	new(Project projectLang, br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel) {
		this.projectLang = projectLang
		this.projectMetaModel = projectMetaModel
	}
}