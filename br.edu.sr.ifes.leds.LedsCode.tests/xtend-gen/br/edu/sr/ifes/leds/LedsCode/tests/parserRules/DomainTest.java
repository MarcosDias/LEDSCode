package br.edu.sr.ifes.leds.LedsCode.tests.parserRules;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.ledsCodeV001.Attribute;
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter;
import br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.ledsCodeV001.Repository;
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod;
import br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class DomainTest extends AbstractTestClass {
  private EList<DomainBlock> domain;
  
  private DomainBlock singleDom;
  
  private ModuleBlock singleModule;
  
  private ModuleBlock otherModule;
  
  private ServiceBlock singleService;
  
  private ServiceMethod fieldSingleService;
  
  private ServiceMethod otherSingleService;
  
  private EntityBlock singleEntity;
  
  private EntityBlock otherSingleEntity;
  
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
    EList<ModuleBlock> _module = this.singleDom.getModule();
    ModuleBlock _get_1 = _module.get(0);
    this.singleModule = _get_1;
    EList<ModuleBlock> _module_1 = this.singleDom.getModule();
    ModuleBlock _get_2 = _module_1.get(1);
    this.otherModule = _get_2;
    EList<ServiceBlock> _serviceBlock = this.singleModule.getServiceBlock();
    ServiceBlock _get_3 = _serviceBlock.get(0);
    this.singleService = _get_3;
    EList<ServiceMethod> _serviceFields = this.singleService.getServiceFields();
    ServiceMethod _get_4 = _serviceFields.get(0);
    this.fieldSingleService = _get_4;
    EList<ServiceMethod> _serviceFields_1 = this.singleService.getServiceFields();
    ServiceMethod _get_5 = _serviceFields_1.get(1);
    this.otherSingleService = _get_5;
    EList<EntityBlock> _entityBlock = this.singleModule.getEntityBlock();
    EntityBlock _get_6 = _entityBlock.get(0);
    this.singleEntity = _get_6;
    EList<EntityBlock> _entityBlock_1 = this.singleModule.getEntityBlock();
    EntityBlock _get_7 = _entityBlock_1.get(1);
    this.otherSingleEntity = _get_7;
    EList<Attribute> _attributes = this.otherSingleEntity.getAttributes();
    Attribute _get_8 = _attributes.get(0);
    this.singleAttr = _get_8;
    Repository _repository = this.otherSingleEntity.getRepository();
    this.repository = _repository;
    EList<RepositoryFields> _methods = this.repository.getMethods();
    RepositoryFields _get_9 = _methods.get(0);
    this.fieldRepository = _get_9;
    EList<EnumBlock> _enumBlock = this.otherModule.getEnumBlock();
    EnumBlock _get_10 = _enumBlock.get(0);
    this.singleEnum = _get_10;
  }
  
  @Test
  public void testQtdDomain() {
    int _size = this.domain.size();
    Assert.assertEquals(1, _size);
  }
  
  @Test
  public void testDomainName() {
    String _name = this.singleDom.getName();
    Assert.assertEquals("domSincap", _name);
  }
  
  @Test
  public void testQtdModule() {
    EList<ModuleBlock> _module = this.singleDom.getModule();
    int _size = _module.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testModuleName() {
    String _name = this.singleModule.getName();
    Assert.assertEquals("controleInterno", _name);
  }
  
  @Test
  public void testQtdServices() {
    EList<ServiceBlock> _serviceBlock = this.singleModule.getServiceBlock();
    int _size = _serviceBlock.size();
    Assert.assertEquals(1, _size);
  }
  
  @Test
  public void testServiceName() {
    String _name = this.singleService.getName();
    Assert.assertEquals("aplProcessoNotificacao", _name);
  }
  
  @Test
  public void testQtdServicesFields() {
    EList<ServiceMethod> _serviceFields = this.singleService.getServiceFields();
    int _size = _serviceFields.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testNameServiceField() {
    RepositoryFields _methodAcess = this.fieldSingleService.getMethodAcess();
    EObject _eContainer = _methodAcess.eContainer();
    Repository superRepository = ((Repository) _eContainer);
    EObject _eContainer_1 = superRepository.eContainer();
    EntityBlock superEntity = ((EntityBlock) _eContainer_1);
    String _name = this.fieldSingleService.getName();
    Assert.assertEquals("FindByName", _name);
    RepositoryFields _methodAcess_1 = this.fieldSingleService.getMethodAcess();
    String _name_1 = _methodAcess_1.getName();
    boolean _contains = "Funcionario.funcionarioRepository.findByName".contains(_name_1);
    Assert.assertTrue(_contains);
    String _name_2 = superRepository.getName();
    boolean _contains_1 = "Funcionario.funcionarioRepository.findByName".contains(_name_2);
    Assert.assertTrue(_contains_1);
    String _name_3 = superEntity.getName();
    boolean _contains_2 = "Funcionario.funcionarioRepository.findByName".contains(_name_3);
    Assert.assertTrue(_contains_2);
  }
  
  @Test
  public void testOtherNameServiceField() {
    RepositoryFields _methodAcess = this.otherSingleService.getMethodAcess();
    EObject _eContainer = _methodAcess.eContainer();
    Repository superRepository = ((Repository) _eContainer);
    EObject _eContainer_1 = superRepository.eContainer();
    EntityBlock superEntity = ((EntityBlock) _eContainer_1);
    EObject _eContainer_2 = superEntity.eContainer();
    ModuleBlock superModule = ((ModuleBlock) _eContainer_2);
    String _name = this.otherSingleService.getName();
    Assert.assertEquals("FindNotificadorProcessoNotificacao", _name);
    RepositoryFields _methodAcess_1 = this.otherSingleService.getMethodAcess();
    String _name_1 = _methodAcess_1.getName();
    boolean _contains = "controleNotificacao.ProcessoNotificacao.processoNotificacaoRepository.findByNotificadorName".contains(_name_1);
    Assert.assertTrue(_contains);
    String _name_2 = superRepository.getName();
    boolean _contains_1 = "controleNotificacao.ProcessoNotificacao.processoNotificacaoRepository.findByNotificadorName".contains(_name_2);
    Assert.assertTrue(_contains_1);
    String _name_3 = superEntity.getName();
    boolean _contains_2 = "controleNotificacao.ProcessoNotificacao.processoNotificacaoRepository.findByNotificadorName".contains(_name_3);
    Assert.assertTrue(_contains_2);
    String _name_4 = superModule.getName();
    boolean _contains_3 = "controleNotificacao.ProcessoNotificacao.processoNotificacaoRepository.findByNotificadorName".contains(_name_4);
    Assert.assertTrue(_contains_3);
  }
  
  @Test
  public void testQtdEntity() {
    EList<EntityBlock> _entityBlock = this.singleModule.getEntityBlock();
    int _size = _entityBlock.size();
    Assert.assertEquals(10, _size);
  }
  
  @Test
  public void testAssinaturaEntity() {
    String _name = this.singleEntity.getName();
    Assert.assertEquals("Pessoa", _name);
    boolean _isIsAbstract = this.singleEntity.isIsAbstract();
    Assert.assertTrue(_isIsAbstract);
    String _acessModifier = this.singleEntity.getAcessModifier();
    Assert.assertNull(_acessModifier);
  }
  
  @Test
  public void testQtdInheritanceClass() {
    ExtendBlock _classExtends = this.otherSingleEntity.getClassExtends();
    EList<EntityBlock> _values = _classExtends.getValues();
    int _size = _values.size();
    Assert.assertEquals(1, _size);
  }
  
  @Test
  public void testInheritanceClass() {
    ExtendBlock _classExtends = this.otherSingleEntity.getClassExtends();
    EList<EntityBlock> superClass = _classExtends.getValues();
    EntityBlock _get = superClass.get(0);
    String _name = _get.getName();
    Assert.assertEquals("Pessoa", _name);
  }
  
  @Test
  public void testQtdAttributes() {
    EList<Attribute> _attributes = this.otherSingleEntity.getAttributes();
    int _size = _attributes.size();
    Assert.assertEquals(5, _size);
  }
  
  @Test
  public void testAttributes() {
    String _acessModifier = this.singleAttr.getAcessModifier();
    boolean _contains = "private -".contains(_acessModifier);
    Assert.assertTrue(_contains);
    String _type = this.singleAttr.getType();
    Assert.assertEquals("String", _type);
    String _name = this.singleAttr.getName();
    Assert.assertEquals("cpf", _name);
  }
  
  @Test
  public void testConstraintsFirtsAttr() {
    EList<Attribute> _attributes = this.otherSingleEntity.getAttributes();
    Attribute first = _attributes.get(0);
    boolean _isPk = first.isPk();
    Assert.assertTrue(_isPk);
    Integer _max = first.getMax();
    Assert.assertEquals(15, (_max).intValue());
    Integer _min = first.getMin();
    Assert.assertEquals(15, (_min).intValue());
  }
  
  @Test
  public void testConstraintsSecundAttr() {
    EList<Attribute> _attributes = this.otherSingleEntity.getAttributes();
    Attribute secund = _attributes.get(1);
    Integer _max = secund.getMax();
    Assert.assertEquals(11, (_max).intValue());
  }
  
  @Test
  public void testcConstraintsThirdAttr() {
    EList<Attribute> _attributes = this.otherSingleEntity.getAttributes();
    Attribute third = _attributes.get(2);
    String _unique = third.getUnique();
    Assert.assertEquals("true", _unique);
    String _nullable = third.getNullable();
    Assert.assertEquals("true", _nullable);
  }
  
  @Test
  public void testRepositoryEntityName() {
    String _name = this.repository.getName();
    Assert.assertEquals("funcionarioRepository", _name);
  }
  
  @Test
  public void testQtdRepositoryFields() {
    EList<RepositoryFields> _methods = this.repository.getMethods();
    int _size = _methods.size();
    Assert.assertEquals(1, _size);
  }
  
  @Test
  public void testRepositoryFields() {
    MethodParameter _methodsParameters = this.fieldRepository.getMethodsParameters();
    EList<TypeAndAttribute> _typeAndAttr = _methodsParameters.getTypeAndAttr();
    final TypeAndAttribute methodParameter = _typeAndAttr.get(0);
    String _name = this.fieldRepository.getName();
    Assert.assertEquals("findByName", _name);
    String _returnType = this.fieldRepository.getReturnType();
    Assert.assertEquals("Funcionario", _returnType);
    String _type = methodParameter.getType();
    Assert.assertEquals("String", _type);
    String _name_1 = methodParameter.getName();
    Assert.assertEquals("name", _name_1);
  }
  
  @Test
  public void testQtdEnums() {
    EList<EnumBlock> _enumBlock = this.singleModule.getEnumBlock();
    int _size = _enumBlock.size();
    Assert.assertEquals(0, _size);
    EList<EnumBlock> _enumBlock_1 = this.otherModule.getEnumBlock();
    int _size_1 = _enumBlock_1.size();
    Assert.assertEquals(2, _size_1);
  }
  
  @Test
  public void testEnumName() {
    String _name = this.singleEnum.getName();
    Assert.assertEquals("EstadoCivil", _name);
  }
  
  @Test
  public void testQtdValuesEnums() {
    EList<String> _values = this.singleEnum.getValues();
    int _size = _values.size();
    Assert.assertEquals(3, _size);
  }
  
  @Test
  public void testValuesEnum() {
    EList<String> _values = this.singleEnum.getValues();
    final String valueEnum = _values.get(0);
    Assert.assertEquals("Casado", valueEnum);
  }
}
