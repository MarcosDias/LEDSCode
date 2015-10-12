package br.edu.sr.ifes.leds.metamodel.domainlayer

import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock
import br.edu.sr.ifes.leds.ledsCodeV001.Project
import br.edu.sr.ifes.leds.metamodel.util.FindModule
import br.edu.sr.ifes.leds.model.domainLayer.ClassEnum
import br.edu.sr.ifes.leds.model.domainLayer.Module
import br.edu.sr.ifes.leds.model.mainLayer.TableObjects
import java.util.ArrayList
import org.eclipse.emf.common.util.EList

class EnumConverter {
	
	Project projectLang
	
	br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel
	
	FindModule findModule
	
	def convert(EList<EnumBlock> listEnumLang, TableObjects tableObjects, Module moduleMetaModel) {
		var listEnumMetaModel = new ArrayList<ClassEnum>
		for(enumLang: listEnumLang){
			var enumMetaModel = new ClassEnum
			enumMetaModel.name = enumLang.name
			enumMetaModel.parent = moduleMetaModel
			enumMetaModel.values = new ArrayList(enumLang.values)
			
			listEnumMetaModel.add(enumMetaModel)
			tableObjects.enums.add(enumMetaModel)
		}
		listEnumMetaModel
	}
	
	new(Project projectLang, br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel) {
		findModule = new FindModule
		this.projectLang = projectLang
		this.projectMetaModel = projectMetaModel
	}
}