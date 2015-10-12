package br.edu.sr.ifes.leds.model.domainLayer;

import br.edu.sr.ifes.leds.model.domainLayer.interfaces.FullNamePath;

/**
 * @author MarcosDias
 */
public abstract class SuperClass extends Classifier implements FullNamePath{
	protected String name;
	protected Module parent;
	
	public String fullNamePath() {
		return "~."+ parent.fullNamePath() + "." + this.name;
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
}
