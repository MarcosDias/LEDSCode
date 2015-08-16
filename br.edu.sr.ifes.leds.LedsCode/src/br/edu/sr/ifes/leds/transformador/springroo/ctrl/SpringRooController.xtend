package br.edu.sr.ifes.leds.transformador.springroo.ctrl

import br.edu.sr.ifes.leds.transformador.springroo.model.SpringRoo
import model.mainLayer.Project

class SpringRooController {
	final String name = "SpringRoo"
	SpringRoo roo
		
	def createProject(Project project){
        roo = new SpringRoo
        roo.criarProjeto(project)
		roo.configDomain(project)
        roo.quit()
        roo.scriptProject
    }
    
    def getName(){
		name
	}
}