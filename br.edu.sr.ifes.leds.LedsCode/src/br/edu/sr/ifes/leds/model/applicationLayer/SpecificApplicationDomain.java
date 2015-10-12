package br.edu.sr.ifes.leds.model.applicationLayer;

import br.edu.sr.ifes.leds.model.domainLayer.Domain;

public class SpecificApplicationDomain extends SpecificApplication{
	private Domain domain;
	private SpecificApplicationModule son;
	
	public Domain getDomain() {
		return domain;
	}
	public void setDomain(Domain domain) {
		this.domain = domain;
	}
	public SpecificApplicationModule getSon() {
		return son;
	}
	public void setSon(SpecificApplicationModule son) {
		this.son = son;
	}
}
