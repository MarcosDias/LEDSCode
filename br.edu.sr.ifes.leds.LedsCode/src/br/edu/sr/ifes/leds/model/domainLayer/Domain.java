package br.edu.sr.ifes.leds.model.domainLayer;

import java.util.List;

/**
 * @author MarcosDias
 */
public class Domain {
    private String name;
    private List<Module> modules;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
}
