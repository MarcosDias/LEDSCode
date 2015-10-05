package br.edu.sr.ifes.leds.LedsCode.tests.transformador.roo;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import ctrl.SpringRooCtrl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class SpringRooCtrlTest extends AbstractTestClass {
  private SpringRooCtrl roo;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.projectLang = _parseProject;
  }
  
  @Test
  public void testTest() {
    Assert.assertTrue(true);
  }
}
