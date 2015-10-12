package br.edu.sr.ifes.leds.model.applicationLayer;

import br.edu.sr.ifes.leds.model.domainLayer.ServiceMethod;

/**
 * @author MarcosDias
 */
public class SpecificApplicationMethod extends SpecificApplication {
    private ServiceMethod serviceMethod;

	public ServiceMethod getServiceMethod() {
		return serviceMethod;
	}

	public void setServiceMethod(ServiceMethod serviceMethod) {
		this.serviceMethod = serviceMethod;
	}
}
