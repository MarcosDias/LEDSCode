package br.edu.sr.ifes.leds.LedsCode.tests.parserRules;

import br.edu.sr.ifes.leds.LedsCode.factory.ProjectFactory;
import br.edu.sr.ifes.leds.LedsCodeV001InjectorProvider;
import br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL;
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import com.google.inject.Inject;
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
public class InfrastructureTest {
  @Inject
  private ParseHelper<LedsCodeDSL> parser;
  
  @Test
  public void testBasePackaga() {
    final InfrastructureBlock infra = this.parseCompleteInfrastructura();
    String _basePackage = infra.getBasePackage();
    Assert.assertEquals("org.company.exempla", _basePackage);
  }
  
  @Test
  public void testProjectVersion() {
    final InfrastructureBlock infra = this.parseCompleteInfrastructura();
    String _projectVersion = infra.getProjectVersion();
    Assert.assertEquals("0.0.0", _projectVersion);
  }
  
  @Test
  public void testLanguage() {
    InfrastructureBlock _parseCompleteInfrastructura = this.parseCompleteInfrastructura();
    final NameVersion language = _parseCompleteInfrastructura.getLanguage();
    String _nameValue = language.getNameValue();
    Assert.assertEquals("Java", _nameValue);
    String _versionValue = language.getVersionValue();
    Assert.assertEquals("8", _versionValue);
  }
  
  @Test
  public void testframework() {
    InfrastructureBlock _parseCompleteInfrastructura = this.parseCompleteInfrastructura();
    final NameVersion framework = _parseCompleteInfrastructura.getFramework();
    String _nameValue = framework.getNameValue();
    Assert.assertEquals("SpringRoo", _nameValue);
    String _versionValue = framework.getVersionValue();
    Assert.assertEquals("1.2", _versionValue);
  }
  
  @Test
  public void testOrm() {
    InfrastructureBlock _parseCompleteInfrastructura = this.parseCompleteInfrastructura();
    final NameVersion orm = _parseCompleteInfrastructura.getOrm();
    String _nameValue = orm.getNameValue();
    Assert.assertEquals("Hibernate", _nameValue);
    String _versionValue = orm.getVersionValue();
    Assert.assertEquals("3", _versionValue);
  }
  
  @Test
  public void testDatabase() {
    InfrastructureBlock _parseCompleteInfrastructura = this.parseCompleteInfrastructura();
    final DatabaseBlock db = _parseCompleteInfrastructura.getDatabase();
    String _nameValue = db.getNameValue();
    Assert.assertEquals("Postgres", _nameValue);
    String _versionValue = db.getVersionValue();
    Assert.assertEquals("5", _versionValue);
    String _userValue = db.getUserValue();
    Assert.assertEquals("USER", _userValue);
    String _passValue = db.getPassValue();
    Assert.assertEquals("123456", _passValue);
    String _hostValue = db.getHostValue();
    Assert.assertEquals("localhost", _hostValue);
  }
  
  public InfrastructureBlock parseCompleteInfrastructura() {
    try {
      InfrastructureBlock _xblockexpression = null;
      {
        CharSequence _completeProject = ProjectFactory.completeProject();
        final LedsCodeDSL model = this.parser.parse(_completeProject);
        TreeIterator<EObject> _eAllContents = model.eAllContents();
        EObject _head = IteratorExtensions.<EObject>head(_eAllContents);
        final Project project = ((Project) _head);
        _xblockexpression = project.getInfrastructureBlock();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
