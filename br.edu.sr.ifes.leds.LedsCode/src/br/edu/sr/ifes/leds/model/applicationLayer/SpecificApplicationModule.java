package br.edu.sr.ifes.leds.model.applicationLayer;

import br.edu.sr.ifes.leds.model.domainLayer.Module;

/**
 * @author MarcosDias
 */
public class SpecificApplicationModule extends SpecificApplication {
    private Module module;
    private SpecificApplicationService son;
    
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public SpecificApplicationService getSon() {
		return son;
	}
	public void setSon(SpecificApplicationService son) {
		this.son = son;
	}
}
