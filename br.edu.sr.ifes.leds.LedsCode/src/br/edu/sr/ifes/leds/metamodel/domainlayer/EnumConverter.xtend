package br.edu.sr.ifes.leds.metamodel.domainlayer

import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock
import java.util.LinkedHashSet
import model.domainLayer.ClassEnum
import org.eclipse.emf.common.util.EList

class EnumConverter {
	
	def convert(EList<EnumBlock> listEnumLang) {
		var listEnumMetaModel = new LinkedHashSet<ClassEnum>
		for(enumLang: listEnumLang){
			var enumMetaModel = new ClassEnum
			enumMetaModel.name = enumLang.name
			enumMetaModel.values = new LinkedHashSet(enumLang.values)
			listEnumMetaModel.add(enumMetaModel)
		}
		listEnumMetaModel
	}
	
}