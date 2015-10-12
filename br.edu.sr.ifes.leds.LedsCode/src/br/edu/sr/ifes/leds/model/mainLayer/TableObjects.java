package br.edu.sr.ifes.leds.model.mainLayer;

import java.util.ArrayList;
import java.util.List;

import br.edu.sr.ifes.leds.model.applicationLayer.Application;
import br.edu.sr.ifes.leds.model.domainLayer.ClassEnum;
import br.edu.sr.ifes.leds.model.domainLayer.Domain;
import br.edu.sr.ifes.leds.model.domainLayer.Entity;
import br.edu.sr.ifes.leds.model.domainLayer.Module;
import br.edu.sr.ifes.leds.model.domainLayer.Service;
import br.edu.sr.ifes.leds.model.infrastructureLayer.Infrastructure;
import br.edu.sr.ifes.leds.model.interfaceLayer.Interface;

public class TableObjects {
	private Project project;
	private Interface iface;
	private Infrastructure infrastructure;
	private List<Domain> domains;
	private List<Application> apps;
	private List<Module> modules;
	private List<Entity> entities;
	private List<Service> services;
	private List<ClassEnum> enums;
	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
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
	public List<Application> getApps() {
		return apps;
	}
	public void setApps(List<Application> apps) {
		this.apps = apps;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	public List<Entity> getEntities() {
		return entities;
	}
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
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
	public TableObjects() {
		domains = new ArrayList<Domain>();
		apps = new ArrayList<Application>();
		modules = new ArrayList<Module>();
		entities = new ArrayList<Entity>();
		services = new ArrayList<Service>();
		enums = new ArrayList<ClassEnum>();
	}
}
