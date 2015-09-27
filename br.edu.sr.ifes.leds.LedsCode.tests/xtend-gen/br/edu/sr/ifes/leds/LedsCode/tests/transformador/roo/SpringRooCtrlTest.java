package br.edu.sr.ifes.leds.LedsCode.tests.transformador.roo;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.generator.ProjectConverter;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import ctrl.SpringRooCtrl;
import model.mainLayer.TableObjects;
import org.eclipse.xtext.xbase.lib.InputOutput;
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
    ProjectConverter _projectConverter = new ProjectConverter();
    TableObjects _convert = _projectConverter.convert(this.projectLang);
    this.tableObjects = _convert;
    SpringRooCtrl _springRooCtrl = new SpringRooCtrl();
    this.roo = _springRooCtrl;
    String _createProject = this.roo.createProject(this.tableObjects);
    InputOutput.<String>println(_createProject);
  }
  
  @Test
  public void testTest() {
    Assert.assertTrue(true);
  }
}
