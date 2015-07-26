package br.edu.sr.ifes.leds.metamodel

import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock
import br.edu.sr.ifes.leds.ledsCodeV001.Module
import br.edu.sr.ifes.leds.metamodel.domainlayer.EntityConverter
import br.edu.sr.ifes.leds.metamodel.domainlayer.EnumConverter
import br.edu.sr.ifes.leds.metamodel.domainlayer.ServiceConverter
import java.util.LinkedHashSet
import model.domainLayer.Domain
import org.eclipse.emf.common.util.EList

class DomainConverter {
	
	EnumConverter enumConverter
	EntityConverter entityConverter
	ServiceConverter serviceConverter
	
	/**
	 * Metodo que converte uma lista de objetos de dominio provenientes de uma linguagem
	 * em objetos de dominio do metadominio
	 * @author MarcosDias
	 * 
	 * @param listDomainLang Lista de dominio que serao traduzidos de objetos
	 * da linguagem para objetos do metamodelo
	 * @return HashSet<Domain> Set de dominio do metamodelo
	 */
	def converter(EList<DomainBlock> listDomainLang) {
		val setDomainMetaModel = new LinkedHashSet<Domain>
		for(domainLang: listDomainLang){
			val domainMetaModel = new Domain
			domainMetaModel.name = domainLang.name
			domainMetaModel.modules = convertModule(domainLang.module)
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
	 * @return LinkedHashSet<model.domainLayer.Module> Set de modulo de metamodelo
	 */
	def convertModule(EList<Module> listModulesLang) {
		val setModulesMetaModule = new LinkedHashSet<model.domainLayer.Module>
		
		for (moduleLang: listModulesLang){
			var moduleMetaModel = new model.domainLayer.Module
			moduleMetaModel.name = moduleLang.name
			moduleMetaModel.entities = entityConverter.convert(moduleLang.entityBlock)
			moduleMetaModel.enums = enumConverter.convert(moduleLang.enumBlock)
			//moduleMetaModel.services = serviceConverter.convert(moduleLang.serviceBlock)
			
			setModulesMetaModule.add(moduleMetaModel)
		}
		
		setModulesMetaModule
	}	
	
	new(){
		entityConverter = new EntityConverter
		enumConverter = new EnumConverter
		serviceConverter = new ServiceConverter
	}
}