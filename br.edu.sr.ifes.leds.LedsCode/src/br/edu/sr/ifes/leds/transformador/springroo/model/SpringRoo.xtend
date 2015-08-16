package br.edu.sr.ifes.leds.transformador.springroo.model

import model.mainLayer.Project
import model.infrastructureLayer.Infrastructure

class SpringRoo {
	String scriptProject
	
	def criarProjeto(Project project) {
		scriptProject += "// CRIANDO O NOVO PROJETO\n"
        scriptProject += "project --topLevelPackage " + 
        	this.configpath(project) + project.name + 
    	"\n\n"
	}
	
	private def configpath(Project project){
		if(project.infrastructure.basePackage != null){
			return ""
		}
		return project.infrastructure.basePackage
	}
	
	def configDomain(Project project) {
		
	}
	
	def configInfra(Infrastructure infrastructure) {
		
	}
	
	def quit() {
		
	}
	
	def getScriptProject(){
		scriptProject
	}
}