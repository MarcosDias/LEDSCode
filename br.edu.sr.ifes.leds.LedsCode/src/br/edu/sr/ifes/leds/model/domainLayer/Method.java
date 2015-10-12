package br.edu.sr.ifes.leds.model.domainLayer;

import java.util.List;

/**
 * @author MarcosDias
 */
public class Method {
	private Repository parent;
    private String name;
    private ReturnType returnMethod;
    private List<Parameter> parameters;
    
	public Repository getParent() {
		return parent;
	}
	public void setParent(Repository parent) {
		this.parent = parent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ReturnType getReturnMethod() {
		return returnMethod;
	}
	public void setReturnMethod(ReturnType returnMethod) {
		this.returnMethod = returnMethod;
	}
	public List<Parameter> getParameters() {
		return parameters;
	}
	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}
}
