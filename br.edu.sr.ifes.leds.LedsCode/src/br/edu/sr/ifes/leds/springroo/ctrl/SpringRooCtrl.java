package br.edu.sr.ifes.leds.springroo.ctrl;

import br.edu.sr.ifes.leds.model.mainLayer.TableObjects;
import br.edu.sr.ifes.leds.springroo.model.SpringRoo;

public class SpringRooCtrl {
	private final String name = "SpringRoo";
	private final String ext = "roo";
		
	public String createProject(TableObjects objects){
		SpringRoo roo = new SpringRoo(objects);
        roo.criarProjeto()
        	.configDatabase()
			.configDomain()
			.configFrontEnd()
			.configsExtras()
			.quit();
		return roo.build();
    }

	public String getName() {
		return name;
	}

	public String getExt() {
		return ext;
	}
}
