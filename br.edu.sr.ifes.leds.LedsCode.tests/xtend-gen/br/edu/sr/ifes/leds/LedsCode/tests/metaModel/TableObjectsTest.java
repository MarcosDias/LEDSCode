package br.edu.sr.ifes.leds.LedsCode.tests.metaModel;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class TableObjectsTest extends AbstractTestClass {
  private /* Interface */Object iface;
  
  private /* Infrastructure */Object infrastructure;
  
  private /* List<Domain> */Object domains;
  
  private /* List<Application> */Object apps;
  
  private /* List<Module> */Object modules;
  
  private /* List<Entity> */Object entity;
  
  private /* List<Service> */Object services;
  
  private /* List<ClassEnum> */Object enums;
  
  @Before
  public void setUp() {
    throw new Error("Unresolved compilation problems:"
      + "\nproject cannot be resolved"
      + "\niface cannot be resolved"
      + "\ninfrastructure cannot be resolved"
      + "\ndomains cannot be resolved"
      + "\napps cannot be resolved"
      + "\nmodules cannot be resolved"
      + "\nentities cannot be resolved"
      + "\nservices cannot be resolved"
      + "\nenums cannot be resolved");
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
    Assert.assertEquals(1, _size);
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
    Assert.assertEquals(1, _size);
  }
  
  @Test
  public void testSizeEntities() {
    int _size = this.entity.size();
    Assert.assertEquals(18, _size);
  }
  
  @Test
  public void testSizeEnums() {
    int _size = this.enums.size();
    Assert.assertEquals(2, _size);
  }
}
