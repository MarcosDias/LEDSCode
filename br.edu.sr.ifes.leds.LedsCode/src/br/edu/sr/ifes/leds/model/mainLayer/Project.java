package br.edu.sr.ifes.leds.model.mainLayer;

import java.util.Calendar;
import java.util.List;

import br.edu.sr.ifes.leds.model.applicationLayer.Application;
import br.edu.sr.ifes.leds.model.domainLayer.Domain;
import br.edu.sr.ifes.leds.model.infrastructureLayer.Infrastructure;
import br.edu.sr.ifes.leds.model.interfaceLayer.Interface;

/**
 * @author MarcosDias
 */
public class Project {
    private String name;
    private Calendar created;
    private Interface iface;
    private Infrastructure infrastructure;
    private List<Domain> domains;
    private List<Application> applications;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getCreated() {
		return created;
	}
	public void setCreated(Calendar created) {
		this.created = created;
	}
	public Interface getIface() {
		return iface;
	}
	public void setIface(Interface iface) {
		this.iface = iface;
	}
	public Infrastructure getInfrastructure() {
		return infrastructure;
	}
	public void setInfrastructure(Infrastructure infrastructure) {
		this.infrastructure = infrastructure;
	}
	public List<Domain> getDomains() {
		return domains;
	}
	public void setDomains(List<Domain> domains) {
		this.domains = domains;
	}
	public List<Application> getApplications() {
		return applications;
	}
	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}
}
