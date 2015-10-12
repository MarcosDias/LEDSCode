package br.edu.sr.ifes.leds.model.applicationLayer;

import br.edu.sr.ifes.leds.model.domainLayer.Service;

/**
 * @author MarcosDias
 */
public class SpecificApplicationService extends SpecificApplication {
    private Service service;
    private SpecificApplicationMethod son;
    
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public SpecificApplicationMethod getSon() {
		return son;
	}
	public void setSon(SpecificApplicationMethod son) {
		this.son = son;
	}
}
