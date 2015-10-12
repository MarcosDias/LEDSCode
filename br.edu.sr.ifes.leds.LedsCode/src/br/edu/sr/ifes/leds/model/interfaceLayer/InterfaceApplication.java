package br.edu.sr.ifes.leds.model.interfaceLayer;

import br.edu.sr.ifes.leds.model.applicationLayer.Application;

/**
 * @author MarcosDias
 */
public class InterfaceApplication {
    private String name;
    private Type type;
    private Application application;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
}
