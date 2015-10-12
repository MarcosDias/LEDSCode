package br.edu.sr.ifes.leds.model.domainLayer;

import java.util.List;

/**
 * @author MarcosDias
 */
public class Entity extends SuperClass{
    private boolean abstrato;
    private Repository repository;
    private List<Entity> classExtends;
    private AccessModifier accessModifier;
    private List<Attribute> attributes;
    
	public boolean isAbstrato() {
		return abstrato;
	}
	public void setAbstrato(boolean abstrato) {
		this.abstrato = abstrato;
	}
	public Repository getRepository() {
		return repository;
	}
	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	public List<Entity> getClassExtends() {
		return classExtends;
	}
	public void setClassExtends(List<Entity> classExtends) {
		this.classExtends = classExtends;
	}
	public AccessModifier getAccessModifier() {
		return accessModifier;
	}
	public void setAccessModifier(AccessModifier accessModifier) {
		this.accessModifier = accessModifier;
	}
	public List<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
}
