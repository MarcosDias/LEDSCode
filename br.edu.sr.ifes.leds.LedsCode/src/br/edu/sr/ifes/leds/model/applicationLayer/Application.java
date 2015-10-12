package br.edu.sr.ifes.leds.model.applicationLayer;

import java.util.List;


/**
 * @author MarcosDias
 */
public class Application {
    private String name;
    private List<SpecificApplicationDomain> structure;
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SpecificApplicationDomain> getStructure() {
		return structure;
	}
	public void setStructure(List<SpecificApplicationDomain> structure) {
		this.structure = structure;
	}
}
