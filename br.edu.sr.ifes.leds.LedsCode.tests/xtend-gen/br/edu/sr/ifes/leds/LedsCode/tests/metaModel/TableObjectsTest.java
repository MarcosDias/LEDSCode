package br.edu.sr.ifes.leds.LedsCode.tests.metaModel;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.generator.ProjectConverter;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import java.util.Set;
import model.applicationLayer.Application;
import model.domainLayer.ClassEnum;
import model.domainLayer.Domain;
import model.domainLayer.Entity;
import model.domainLayer.Module;
import model.domainLayer.Service;
import model.infrastructureLayer.Infrastructure;
import model.interfaceLayer.Interface;
import model.mainLayer.TableObjects;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class TableObjectsTest extends AbstractTestClass {
  private Interface iface;
  
  private Infrastructure infrastructure;
  
  private Set<Domain> domains;
  
  private Set<Application> apps;
  
  private Set<Module> modules;
  
  private Set<Entity> entity;
  
  private Set<Service> services;
  
  private Set<ClassEnum> enums;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.projectLang = _parseProject;
    ProjectConverter _projectConverter = new ProjectConverter();
    TableObjects _convert = _projectConverter.convert(this.projectLang);
    this.tableObjects = _convert;
    model.mainLayer.Project _project = this.tableObjects.getProject();
    this.projectMetaModel = _project;
    Interface _iface = this.tableObjects.getIface();
    this.iface = _iface;
    Infrastructure _infrastructure = this.tableObjects.getInfrastructure();
    this.infrastructure = _infrastructure;
    Set<Domain> _domains = this.tableObjects.getDomains();
    this.domains = _domains;
    Set<Application> _apps = this.tableObjects.getApps();
    this.apps = _apps;
    Set<Module> _modules = this.tableObjects.getModules();
    this.modules = _modules;
    Set<Entity> _entities = this.tableObjects.getEntities();
    this.entity = _entities;
    Set<Service> _services = this.tableObjects.getServices();
    this.services = _services;
    Set<ClassEnum> _enums = this.tableObjects.getEnums();
    this.enums = _enums;
  }
  
  @Test
  public void testProjectNotNull() {
    Assert.assertNotNull(this.projectMetaModel);
  }
  
  @Test
  public void testInterfaceNotNull() {
    Assert.assertNotNull(this.iface);
  }
  
  @Test
  public void testInfrastructureNotNull() {
    Assert.assertNotNull(this.infrastructure);
  }
  
  @Test
  public void testSizeDomains() {
    int _size = this.domains.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testSizeApp() {
    int _size = this.apps.size();
    Assert.assertEquals(1, _size);
  }
  
  @Test
  public void testSizeModules() {
    int _size = this.modules.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testSizeServices() {
    int _size = this.services.size();
    Assert.assertEquals(4, _size);
  }
  
  @Test
  public void testSizeEntities() {
    int _size = this.entity.size();
    Assert.assertEquals(8, _size);
  }
  
  @Test
  public void testSizeEnums() {
    int _size = this.enums.size();
    Assert.assertEquals(4, _size);
  }
}
