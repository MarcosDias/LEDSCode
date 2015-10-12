package br.edu.sr.ifes.leds.LedsCode.tests.metaModel;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.ledsCodeV001.Attribute;
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Repository;
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class DomainTest extends AbstractTestClass {
  private EList<DomainBlock> domainLang;
  
  private DomainBlock singleDomLang;
  
  private ModuleBlock singleModuleLang;
  
  private ModuleBlock otherSingleModuleLang;
  
  private ServiceBlock singleServiceLang;
  
  private ServiceMethod fieldSingleServiceLang;
  
  private EntityBlock singleEntityLang;
  
  private Attribute singleAttrLang;
  
  private Repository repositoryLang;
  
  private RepositoryFields fieldRepositoryLang;
  
  private EnumBlock singleEnumLang;
  
  private /* List<Domain> */Object domainMetaModel;
  
  private /* Domain */Object singleDomMetaModel;
  
  private /* Module */Object singleModuleMetaModel;
  
  private /* Module */Object othersingleModuleMetaModel;
  
  private /* Entity */Object singleEntityMetaModel;
  
  private /* model.domainLayer.Attribute */Object singleAttrMetaModel;
  
  private /* model.domainLayer.Repository */Object repositoryMetaModel;
  
  private /* Method */Object fieldRepositoryMetaModel;
  
  private /* ClassEnum */Object singleEnumMetaModel;
  
  private /* Service */Object singleServiceMetaModel;
  
  private /* model.domainLayer.ServiceMethod */Object fieldSingleServiceMetaModel;
  
  @Before
  public void setUp() {
    throw new Error("Unresolved compilation problems:"
      + "\nproject cannot be resolved"
      + "\ndomains cannot be resolved"
      + "\nmodules cannot be resolved"
      + "\nget cannot be resolved"
      + "\nmodules cannot be resolved"
      + "\nget cannot be resolved"
      + "\nenums cannot be resolved"
      + "\nget cannot be resolved"
      + "\nentities cannot be resolved"
      + "\nget cannot be resolved"
      + "\nattributes cannot be resolved"
      + "\nget cannot be resolved"
      + "\nrepository cannot be resolved"
      + "\nmethods cannot be resolved"
      + "\nget cannot be resolved"
      + "\nservices cannot be resolved"
      + "\nget cannot be resolved"
      + "\nmethods cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void testNotEmptyDomains() {
    boolean _isEmpty = this.domainMetaModel.isEmpty();
    Assert.assertFalse(_isEmpty);
  }
  
  @Test
  public void testQtdDomain() {
    int _size = this.domainLang.size();
    int _size_1 = this.domainMetaModel.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testDomainName() {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  @Test
  public void testQtdModule() {
    throw new Error("Unresolved compilation problems:"
      + "\nmodules cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  @Test
  public void testModuleName() {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  @Test
  public void testModuleParent() {
    throw new Error("Unresolved compilation problems:"
      + "\nparent cannot be resolved");
  }
  
  @Test
  public void testQtdEnums() {
    throw new Error("Unresolved compilation problems:"
      + "\nenums cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nenums cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nenums cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  @Test
  public void testEnumName() {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  @Test
  public void testQtdValuesEnums() {
    throw new Error("Unresolved compilation problems:"
      + "\nvalues cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  @Test
  public void testValuesEnum() {
    throw new Error("Unresolved compilation problems:"
      + "\nvalues cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void testQtdEntity() {
    throw new Error("Unresolved compilation problems:"
      + "\nentities cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  @Test
  public void testAssinaturaEntity() {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nabstrato cannot be resolved"
      + "\naccessModifier cannot be resolved"
      + "\nabstrato cannot be resolved"
      + "\naccessModifier cannot be resolved");
  }
  
  @Test
  public void testEntityParent() {
    throw new Error("Unresolved compilation problems:"
      + "\nparent cannot be resolved");
  }
  
  @Test
  public void testQtdInheritanceClass() {
    throw new Error("Unresolved compilation problems:"
      + "\nclassExtends cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  @Test
  public void testInheritanceClass() {
    throw new Error("Unresolved compilation problems:"
      + "\nclassExtends cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncontains cannot be resolved");
  }
  
  @Test
  public void testQtdAttributes() {
    throw new Error("Unresolved compilation problems:"
      + "\nattributes cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  @Test
  public void testAttributes() {
    throw new Error("Unresolved compilation problems:"
      + "\naccessModifier cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ngenericType cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Test
  public void testConstraintsFirtsAttr() {
    throw new Error("Unresolved compilation problems:"
      + "\nattributes cannot be resolved"
      + "\nget cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\npk cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nmax cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nmin cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\npk cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nnullable cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nunique cannot be resolved");
  }
  
  @Test
  public void testConstraintsSecundAttr() {
    throw new Error("Unresolved compilation problems:"
      + "\nattributes cannot be resolved"
      + "\nget cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nmax cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\npk cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nmin cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nnullable cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nunique cannot be resolved");
  }
  
  @Test
  public void testcConstraintsThirdAttr() {
    throw new Error("Unresolved compilation problems:"
      + "\nattributes cannot be resolved"
      + "\nget cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nunique cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nmin cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nmax cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\npk cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nnullable cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nunique cannot be resolved");
  }
  
  @Test
  public void testRepositoryEntityName() {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  @Test
  public void testQtdRepositoryFields() {
    throw new Error("Unresolved compilation problems:"
      + "\nmethods cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  @Test
  public void testRepositoryFields() {
    throw new Error("Unresolved compilation problems:"
      + "\nparameters cannot be resolved"
      + "\nget cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nreturnMethod cannot be resolved"
      + "\ngenericType cannot be resolved"
      + "\ngenericType cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Test
  public void testQtdServices() {
    throw new Error("Unresolved compilation problems:"
      + "\nservices cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  @Test
  public void testServiceName() {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  @Test
  public void testServiceParent() {
    throw new Error("Unresolved compilation problems:"
      + "\nparent cannot be resolved");
  }
  
  @Test
  public void testQtdServicesFields() {
    throw new Error("Unresolved compilation problems:"
      + "\nmethods cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  @Test
  public void testServiceField() {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nmethodService cannot be resolved"
      + "\nname cannot be resolved");
  }
}
