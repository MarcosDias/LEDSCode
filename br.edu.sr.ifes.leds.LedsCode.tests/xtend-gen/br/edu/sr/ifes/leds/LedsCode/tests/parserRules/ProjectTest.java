package br.edu.sr.ifes.leds.LedsCode.tests.parserRules;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class ProjectTest extends AbstractTestClass {
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.projectLang = _parseProject;
  }
  
  @Test
  public void notNullRules() {
    String _name = this.projectLang.getName();
    Assert.assertEquals("Projeto", _name);
    InfrastructureBlock _infrastructureBlock = this.projectLang.getInfrastructureBlock();
    Assert.assertNotNull(_infrastructureBlock);
    InterfaceBlock _interfaceBlock = this.projectLang.getInterfaceBlock();
    Assert.assertNotNull(_interfaceBlock);
    EList<DomainBlock> _domainBlock = this.projectLang.getDomainBlock();
    Assert.assertNotNull(_domainBlock);
    EList<ApplicationBlock> _applicationBlock = this.projectLang.getApplicationBlock();
    Assert.assertNotNull(_applicationBlock);
  }
}
