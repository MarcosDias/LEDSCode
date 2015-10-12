package br.edu.sr.ifes.leds.model.domainLayer;

import java.util.List;

import br.edu.sr.ifes.leds.model.domainLayer.interfaces.FullNamePath;

/**
 * @author MarcosDias
 */
public class Module implements FullNamePath{
    private String name;
    private Domain parent;
    private List<Service> services;
    private List<ClassEnum> enums;
    private List<Entity> entities;
    
	public String fullNamePath() {
		return parent.getName() + "." + this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Domain getParent() {
		return parent;
	}

	public void setParent(Domain parent) {
		this.parent = parent;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<ClassEnum> getEnums() {
		return enums;
	}

	public void setEnums(List<ClassEnum> enums) {
		this.enums = enums;
	}

	public List<Entity> getEntities() {
		return entities;
	}

	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}
}
