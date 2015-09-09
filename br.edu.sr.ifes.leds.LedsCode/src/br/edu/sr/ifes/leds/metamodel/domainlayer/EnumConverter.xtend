package br.edu.sr.ifes.leds.metamodel.domainlayer

import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock
import java.util.LinkedHashSet
import model.domainLayer.ClassEnum
import org.eclipse.emf.common.util.EList
import model.mainLayer.TableObjects
import br.edu.sr.ifes.leds.ledsCodeV001.Project

class EnumConverter {
	
	Project projectLang
	
	model.mainLayer.Project projectMetaModel
	
	def convert(EList<EnumBlock> listEnumLang, TableObjects tableObjects) {
		var listEnumMetaModel = new LinkedHashSet<ClassEnum>
		for(enumLang: listEnumLang){
			var enumMetaModel = new ClassEnum
			enumMetaModel.name = enumLang.name
			enumMetaModel.values = new LinkedHashSet(enumLang.values)
			
			listEnumMetaModel.add(enumMetaModel)
			tableObjects.enums.add(enumMetaModel)
		}
		listEnumMetaModel
	}
	
	new(Project projectLang, model.mainLayer.Project projectMetaModel) {
	
		this.projectLang = projectLang
		this.projectMetaModel = projectMetaModel
	}
}