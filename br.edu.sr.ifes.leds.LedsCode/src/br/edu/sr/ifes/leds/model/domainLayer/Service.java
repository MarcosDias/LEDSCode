package br.edu.sr.ifes.leds.model.domainLayer;

import java.util.List;

import br.edu.sr.ifes.leds.model.domainLayer.interfaces.FullNamePath;

/**
 * @author MarcosDias
 */
public class Service implements FullNamePath{
    private String name;
    private Module parent;
    private List<ServiceMethod> methods;
    
    public String fullNamePath() {
		return parent.getName() + "." + this.name;
	}
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Module getParent() {
		return parent;
	}

	public void setParent(Module parent) {
		this.parent = parent;
	}

	public List<ServiceMethod> getMethods() {
		return methods;
	}

	public void setMethods(List<ServiceMethod> methods) {
		this.methods = methods;
	}	
}
