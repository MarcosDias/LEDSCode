package br.edu.sr.ifes.leds.metamodel.domainlayer

import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock
import br.edu.sr.ifes.leds.ledsCodeV001.Project
import br.edu.sr.ifes.leds.metamodel.util.FindModule
import java.util.ArrayList
import model.domainLayer.ClassEnum
import model.domainLayer.Module
import model.mainLayer.TableObjects
import org.eclipse.emf.common.util.EList

class EnumConverter {
	
	Project projectLang
	
	model.mainLayer.Project projectMetaModel
	
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
	
	new(Project projectLang, model.mainLayer.Project projectMetaModel) {
		findModule = new FindModule
		this.projectLang = projectLang
		this.projectMetaModel = projectMetaModel
	}
}