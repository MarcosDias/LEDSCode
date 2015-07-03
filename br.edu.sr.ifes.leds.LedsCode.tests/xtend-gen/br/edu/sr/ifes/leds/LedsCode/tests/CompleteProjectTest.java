package br.edu.sr.ifes.leds.LedsCode.tests;

import br.edu.sr.ifes.leds.LedsCode.factory.ProjectFactory;
import br.edu.sr.ifes.leds.LedsCodeV001InjectorProvider;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(LedsCodeV001InjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class CompleteProjectTest {
  @Inject
  private ParseHelper<LedsCodeDSL> parser;
  
  private LedsCodeDSL model;
  
  @Test
  public void notNullRules() {
    final Project project = this.parseCompleteProject();
    String _name = project.getName();
    Assert.assertEquals("Projeto", _name);
    InfrastructureBlock _infrastructureBlock = project.getInfrastructureBlock();
    Assert.assertNotNull(_infrastructureBlock);
    InterfaceBlock _interfaceBlock = project.getInterfaceBlock();
    Assert.assertNotNull(_interfaceBlock);
    EList<String> _domainBlock = project.getDomainBlock();
    Assert.assertNotNull(_domainBlock);
    EList<String> _appBlock = project.getAppBlock();
    Assert.assertNotNull(_appBlock);
  }
  
  public Project parseCompleteProject() {
    try {
      Project _xblockexpression = null;
      {
        CharSequence _completeProject = ProjectFactory.completeProject();
        LedsCodeDSL _parse = this.parser.parse(_completeProject);
        this.model = _parse;
        TreeIterator<EObject> _eAllContents = this.model.eAllContents();
        EObject _head = IteratorExtensions.<EObject>head(_eAllContents);
        _xblockexpression = ((Project) _head);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
