package br.edu.sr.ifes.leds.metamodel

import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock
import br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock
import br.edu.sr.ifes.leds.ledsCodeV001.Project
import br.edu.sr.ifes.leds.metamodel.domainlayer.EntityConverter
import br.edu.sr.ifes.leds.metamodel.domainlayer.EnumConverter
import br.edu.sr.ifes.leds.metamodel.domainlayer.ServiceConverter
import java.util.ArrayList
import model.domainLayer.Domain
import model.domainLayer.Module
import model.mainLayer.TableObjects
import org.eclipse.emf.common.util.EList

class DomainConverter {
	
	EnumConverter enumConverter
	EntityConverter entityConverter
	ServiceConverter serviceConverter
	
	Project projectLang
	model.mainLayer.Project projectMetaModel
	
	/**
	 * Metodo que converte uma lista de objetos de dominio provenientes de uma linguagem
	 * em objetos de dominio do metadominio
	 * @author MarcosDias
	 * 
	 * @param listDomainLang Lista de dominio que serao traduzidos de objetos
	 * da linguagem para objetos do metamodelo
	 * @return HashSet<Domain> Set de dominio do metamodelo
	 */
	def converter(EList<DomainBlock> listDomainLang, TableObjects tableObjects) {
		val setDomainMetaModel = new ArrayList<Domain>
		for(domainLang: listDomainLang){
			val domainMetaModel = new Domain
			domainMetaModel.name = domainLang.name
			domainMetaModel.modules = convertModule(domainLang.module, domainMetaModel, tableObjects)
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
	 * @param domainMetaModel Dominio que esta sendo processado
	 * @return List<model.domainLayer.Module> Set de modulo de metamodelo
	 */
	def convertModule(EList<ModuleBlock> listModulesLang, Domain domainMetaModel, TableObjects tableObjects) {
		val setModulesMetaModule = new ArrayList<Module>
		
		for (moduleLang: listModulesLang){
			var moduleMetaModel = new Module
			moduleMetaModel.parent = domainMetaModel
			moduleMetaModel.name = moduleLang.name
			moduleMetaModel.enums = enumConverter.convert(moduleLang.enumBlock, tableObjects, moduleMetaModel)
			moduleMetaModel.entities = entityConverter.convert(moduleLang.entityBlock, moduleMetaModel, tableObjects)
			moduleMetaModel.services = serviceConverter.convert(moduleLang.serviceBlock, moduleMetaModel, tableObjects)
			
			setModulesMetaModule.add(moduleMetaModel)
			tableObjects.modules.add(moduleMetaModel)
		}
		
		setModulesMetaModule
	}
	
	new(Project projectLang, model.mainLayer.Project projectMetaModel) {
		this.entityConverter = new EntityConverter(projectLang, projectMetaModel)
		this.enumConverter = new EnumConverter(projectLang, projectMetaModel)
		this.serviceConverter = new ServiceConverter(projectLang, projectMetaModel)
		
		this.projectLang = projectLang
		this.projectMetaModel = projectMetaModel
	}
}