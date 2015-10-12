package br.edu.sr.ifes.leds.model.interfaceLayer;

import java.util.List;

/**
 * @author MarcosDias
 */
public class Interface {
    private String name;
    private List<InterfaceApplication> interfaceApplication;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<InterfaceApplication> getInterfaceApplication() {
		return interfaceApplication;
	}
	public void setInterfaceApplication(
			List<InterfaceApplication> interfaceApplication) {
		this.interfaceApplication = interfaceApplication;
	}
}
