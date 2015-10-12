package br.edu.sr.ifes.leds.model.domainLayer;


/**
 * @author MarcosDias
 */
public class Attribute extends SuperAttribute {
    private AccessModifier accessModifier;
    private String name;
    private Constraints constraints;
    
	public AccessModifier getAccessModifier() {
		return accessModifier;
	}
	public void setAccessModifier(AccessModifier accessModifier) {
		this.accessModifier = accessModifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Constraints getConstraints() {
		return constraints;
	}
	public void setConstraints(Constraints constraints) {
		this.constraints = constraints;
	}
}
