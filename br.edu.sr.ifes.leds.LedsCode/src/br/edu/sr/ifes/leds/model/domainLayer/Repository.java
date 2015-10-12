package br.edu.sr.ifes.leds.model.domainLayer;

import java.util.List;

/**
 * @author MarcosDias
 */
public class Repository {
    private String name;
    private List<Method> methods;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Method> getMethods() {
		return methods;
	}
	public void setMethods(List<Method> methods) {
		this.methods = methods;
	}
}
