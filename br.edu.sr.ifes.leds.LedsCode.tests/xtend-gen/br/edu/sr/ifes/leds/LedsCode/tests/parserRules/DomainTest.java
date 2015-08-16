package br.edu.sr.ifes.leds.LedsCode.tests.parserRules;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.ledsCodeV001.Attribute;
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter;
import br.edu.sr.ifes.leds.ledsCodeV001.Module;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.ledsCodeV001.Repository;
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod;
import br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute;
import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class DomainTest extends AbstractTestClass {
  private EList<DomainBlock> domain;
  
  private DomainBlock singleDom;
  
  private Module singleModule;
  
  private ServiceBlock singleService;
  
  private ServiceMethod fieldSingleService;
  
  private EntityBlock singleEntity;
  
  private Attribute singleAttr;
  
  private Repository repository;
  
  private RepositoryFields fieldRepository;
  
  private EnumBlock singleEnum;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.projectLang = _parseProject;
    EList<DomainBlock> _domainBlock = this.projectLang.getDomainBlock();
    this.domain = _domainBlock;
    DomainBlock _get = this.domain.get(0);
    this.singleDom = _get;
    EList<Module> _module = this.singleDom.getModule();
    Module _get_1 = _module.get(0);
    this.singleModule = _get_1;
    EList<ServiceBlock> _serviceBlock = this.singleModule.getServiceBlock();
    ServiceBlock _get_2 = _serviceBlock.get(0);
    this.singleService = _get_2;
    EList<ServiceMethod> _serviceFields = this.singleService.getServiceFields();
    ServiceMethod _get_3 = _serviceFields.get(0);
    this.fieldSingleService = _get_3;
    EList<EntityBlock> _entityBlock = this.singleModule.getEntityBlock();
    EntityBlock _get_4 = _entityBlock.get(0);
    this.singleEntity = _get_4;
    EList<Attribute> _attributes = this.singleEntity.getAttributes();
    Attribute _get_5 = _attributes.get(0);
    this.singleAttr = _get_5;
    Repository _repository = this.singleEntity.getRepository();
    this.repository = _repository;
    EList<RepositoryFields> _methods = this.repository.getMethods();
    RepositoryFields _get_6 = _methods.get(0);
    this.fieldRepository = _get_6;
    EList<EnumBlock> _enumBlock = this.singleModule.getEnumBlock();
    EnumBlock _get_7 = _enumBlock.get(0);
    this.singleEnum = _get_7;
  }
  
  @Test
  public void testQtdDomain() {
    int _size = this.domain.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testDomainName() {
    String _name = this.singleDom.getName();
    Assert.assertEquals("Domain1", _name);
  }
  
  @Test
  public void testQtdModule() {
    EList<Module> _module = this.singleDom.getModule();
    int _size = _module.size();
    Assert.assertEquals(1, _size);
  }
  
  @Test
  public void testModuleName() {
    String _name = this.singleModule.getName();
    Assert.assertEquals("Module", _name);
  }
  
  @Test
  public void testQtdServices() {
    EList<ServiceBlock> _serviceBlock = this.singleModule.getServiceBlock();
    int _size = _serviceBlock.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testServiceName() {
    String _name = this.singleService.getName();
    Assert.assertEquals("LibraryService", _name);
  }
  
  @Test
  public void testQtdServicesFields() {
    EList<ServiceMethod> _serviceFields = this.singleService.getServiceFields();
    int _size = _serviceFields.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testNameServiceField() {
    String _name = this.fieldSingleService.getName();
    Assert.assertEquals("findLibraryByName", _name);
    String _methodAcess = this.fieldSingleService.getMethodAcess();
    Assert.assertEquals("Media.MediaRepository.findMediaByCharacter", _methodAcess);
  }
  
  @Test
  public void testQtdEntity() {
    EList<EntityBlock> _entityBlock = this.singleModule.getEntityBlock();
    int _size = _entityBlock.size();
    Assert.assertEquals(4, _size);
  }
  
  @Test
  public void testAssinaturaEntity() {
    String _name = this.singleEntity.getName();
    Assert.assertEquals("Media", _name);
    boolean _isIsAbstract = this.singleEntity.isIsAbstract();
    Assert.assertTrue(_isIsAbstract);
    String _acessModifier = this.singleEntity.getAcessModifier();
    Assert.assertNull(_acessModifier);
  }
  
  @Test
  public void testQtdInheritanceClass() {
    ExtendBlock _classExtends = this.singleEntity.getClassExtends();
    EList<String> _values = _classExtends.getValues();
    int _size = _values.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testInheritanceClass() {
    ExtendBlock _classExtends = this.singleEntity.getClassExtends();
    EList<String> _values = _classExtends.getValues();
    for (final String superClass : _values) {
      boolean _contains = superClass.contains("SuperClass");
      Assert.assertTrue(_contains);
    }
  }
  
  @Test
  public void testQtdAttributes() {
    EList<Attribute> _attributes = this.singleEntity.getAttributes();
    int _size = _attributes.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testAttributes() {
    String _acessModifier = this.singleAttr.getAcessModifier();
    boolean _contains = "private -".contains(_acessModifier);
    Assert.assertTrue(_contains);
    String _type = this.singleAttr.getType();
    Assert.assertEquals("String", _type);
    String _name = this.singleAttr.getName();
    Assert.assertEquals("titleb", _name);
  }
  
  @Test
  public void testRepositoryEntityName() {
    String _name = this.repository.getName();
    Assert.assertEquals("MediaRepository", _name);
  }
  
  @Test
  public void testQtdRepositoryFields() {
    EList<RepositoryFields> _methods = this.repository.getMethods();
    int _size = _methods.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testRepositoryFields() {
    MethodParameter _methodsParameters = this.fieldRepository.getMethodsParameters();
    EList<TypeAndAttribute> _typeAndAttr = _methodsParameters.getTypeAndAttr();
    final TypeAndAttribute methodParameter = _typeAndAttr.get(0);
    String _nameMethod = this.fieldRepository.getNameMethod();
    Assert.assertEquals("findMediaByCharacter", _nameMethod);
    String _returnType = this.fieldRepository.getReturnType();
    Assert.assertEquals("List<Media>", _returnType);
    String _type = methodParameter.getType();
    Assert.assertEquals("String", _type);
    String _name = methodParameter.getName();
    Assert.assertEquals("characterName", _name);
  }
  
  @Test
  public void testQtdEnums() {
    EList<EnumBlock> _enumBlock = this.singleModule.getEnumBlock();
    int _size = _enumBlock.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testEnumName() {
    String _name = this.singleEnum.getName();
    Assert.assertEquals("Gender", _name);
  }
  
  @Test
  public void testQtdValuesEnums() {
    EList<String> _values = this.singleEnum.getValues();
    int _size = _values.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testValuesEnum() {
    EList<String> _values = this.singleEnum.getValues();
    final String valueEnum = _values.get(0);
    Assert.assertEquals("FEMALE", valueEnum);
  }
}
