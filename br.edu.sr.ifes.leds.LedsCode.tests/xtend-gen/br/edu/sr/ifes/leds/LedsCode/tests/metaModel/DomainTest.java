package br.edu.sr.ifes.leds.LedsCode.tests.metaModel;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.generator.ProjectConverter;
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
import java.util.LinkedHashSet;
import java.util.Set;
import model.domainLayer.AccessModifier;
import model.domainLayer.ClassEnum;
import model.domainLayer.Domain;
import model.domainLayer.Entity;
import model.domainLayer.Method;
import model.domainLayer.Parameter;
import model.domainLayer.ReturnType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class DomainTest extends AbstractTestClass {
  private EList<DomainBlock> domainLang;
  
  private DomainBlock singleDomLang;
  
  private Module singleModuleLang;
  
  private ServiceBlock singleServiceLang;
  
  private ServiceMethod fieldSingleServiceLang;
  
  private EntityBlock singleEntityLang;
  
  private Attribute singleAttrLang;
  
  private Repository repositoryLang;
  
  private RepositoryFields fieldRepositoryLang;
  
  private EnumBlock singleEnumLang;
  
  private Set<Domain> domainMetaModel;
  
  private Domain singleDomMetaModel;
  
  private model.domainLayer.Module singleModuleMetaModel;
  
  private Entity singleEntityMetaModel;
  
  private model.domainLayer.Attribute singleAttrMetaModel;
  
  private model.domainLayer.Repository repositoryMetaModel;
  
  private Method fieldRepositoryMetaModel;
  
  private ClassEnum singleEnumMetaModel;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.projectLang = _parseProject;
    EList<DomainBlock> _domainBlock = this.projectLang.getDomainBlock();
    this.domainLang = _domainBlock;
    DomainBlock _get = this.domainLang.get(0);
    this.singleDomLang = _get;
    EList<Module> _module = this.singleDomLang.getModule();
    Module _get_1 = _module.get(0);
    this.singleModuleLang = _get_1;
    EList<ServiceBlock> _serviceBlock = this.singleModuleLang.getServiceBlock();
    ServiceBlock _get_2 = _serviceBlock.get(0);
    this.singleServiceLang = _get_2;
    EList<ServiceMethod> _serviceFields = this.singleServiceLang.getServiceFields();
    ServiceMethod _get_3 = _serviceFields.get(0);
    this.fieldSingleServiceLang = _get_3;
    EList<EntityBlock> _entityBlock = this.singleModuleLang.getEntityBlock();
    EntityBlock _get_4 = _entityBlock.get(0);
    this.singleEntityLang = _get_4;
    EList<Attribute> _attributes = this.singleEntityLang.getAttributes();
    Attribute _get_5 = _attributes.get(0);
    this.singleAttrLang = _get_5;
    Repository _repository = this.singleEntityLang.getRepository();
    this.repositoryLang = _repository;
    EList<RepositoryFields> _methods = this.repositoryLang.getMethods();
    RepositoryFields _get_6 = _methods.get(0);
    this.fieldRepositoryLang = _get_6;
    EList<EnumBlock> _enumBlock = this.singleModuleLang.getEnumBlock();
    EnumBlock _get_7 = _enumBlock.get(0);
    this.singleEnumLang = _get_7;
    ProjectConverter _projectConverter = new ProjectConverter();
    model.mainLayer.Project _convert = _projectConverter.convert(this.projectLang);
    this.projectMetaModel = _convert;
    LinkedHashSet<Domain> _domains = this.projectMetaModel.getDomains();
    this.domainMetaModel = _domains;
    Domain _get_8 = ((Domain[])Conversions.unwrapArray(this.domainMetaModel, Domain.class))[0];
    this.singleDomMetaModel = _get_8;
    LinkedHashSet<model.domainLayer.Module> _modules = this.singleDomMetaModel.getModules();
    model.domainLayer.Module _get_9 = ((model.domainLayer.Module[])Conversions.unwrapArray(_modules, model.domainLayer.Module.class))[0];
    this.singleModuleMetaModel = _get_9;
    LinkedHashSet<Entity> _entities = this.singleModuleMetaModel.getEntities();
    Entity _get_10 = ((Entity[])Conversions.unwrapArray(_entities, Entity.class))[0];
    this.singleEntityMetaModel = _get_10;
    LinkedHashSet<model.domainLayer.Attribute> _attributes_1 = this.singleEntityMetaModel.getAttributes();
    model.domainLayer.Attribute _get_11 = ((model.domainLayer.Attribute[])Conversions.unwrapArray(_attributes_1, model.domainLayer.Attribute.class))[0];
    this.singleAttrMetaModel = _get_11;
    model.domainLayer.Repository _repository_1 = this.singleEntityMetaModel.getRepository();
    this.repositoryMetaModel = _repository_1;
    LinkedHashSet<Method> _methods_1 = this.repositoryMetaModel.getMethods();
    Method _get_12 = ((Method[])Conversions.unwrapArray(_methods_1, Method.class))[0];
    this.fieldRepositoryMetaModel = _get_12;
    LinkedHashSet<ClassEnum> _enums = this.singleModuleMetaModel.getEnums();
    ClassEnum _get_13 = ((ClassEnum[])Conversions.unwrapArray(_enums, ClassEnum.class))[0];
    this.singleEnumMetaModel = _get_13;
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
    String _name = this.singleDomLang.getName();
    String _name_1 = this.singleDomMetaModel.getName();
    boolean _equals = _name.equals(_name_1);
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void testQtdModule() {
    EList<Module> _module = this.singleDomLang.getModule();
    int _size = _module.size();
    LinkedHashSet<model.domainLayer.Module> _modules = this.singleDomMetaModel.getModules();
    int _size_1 = _modules.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testModuleName() {
    String _name = this.singleModuleLang.getName();
    String _name_1 = this.singleModuleMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
  }
  
  /**
   * @Test
   * def testQtdServices(){
   * assertEquals(2, singleModule.serviceBlock.size)
   * }
   * 
   * @Test
   * def testServiceName(){
   * assertEquals("LibraryService", singleService.name)
   * }
   * 
   * @Test
   * def testQtdServicesFields(){
   * assertEquals(4, singleService.serviceFields.size)
   * }
   * 
   * @Test
   * def testNameServiceField(){
   * assertEquals("findLibraryByName", fieldSingleService.name)
   * assertEquals("Library.LibraryRepository.findLibraryByName", fieldSingleService.methodAcess)
   * }
   */
  @Test
  public void testQtdEntity() {
    EList<EntityBlock> _entityBlock = this.singleModuleLang.getEntityBlock();
    int _size = _entityBlock.size();
    LinkedHashSet<Entity> _entities = this.singleModuleMetaModel.getEntities();
    int _size_1 = _entities.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testAssinaturaEntity() {
    String _name = this.singleEntityLang.getName();
    String _name_1 = this.singleEntityMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
    boolean _isIsAbstract = this.singleEntityLang.isIsAbstract();
    boolean _isAbstrato = this.singleEntityMetaModel.isAbstrato();
    Assert.assertEquals(Boolean.valueOf(_isIsAbstract), Boolean.valueOf(_isAbstrato));
    String _acessModifier = this.singleEntityLang.getAcessModifier();
    AccessModifier _accessModifier = this.singleEntityMetaModel.getAccessModifier();
    Assert.assertEquals(_acessModifier, _accessModifier);
    boolean _isAbstrato_1 = this.singleEntityMetaModel.isAbstrato();
    Assert.assertTrue(_isAbstrato_1);
    AccessModifier _accessModifier_1 = this.singleEntityMetaModel.getAccessModifier();
    Assert.assertNull(_accessModifier_1);
  }
  
  @Test
  public void testQtdInheritanceClass() {
    ExtendBlock _classExtends = this.singleEntityLang.getClassExtends();
    EList<String> _values = _classExtends.getValues();
    int _size = _values.size();
    LinkedHashSet<Entity> _classExtends_1 = this.singleEntityMetaModel.getClassExtends();
    int _size_1 = _classExtends_1.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testInheritanceClass() {
    LinkedHashSet<Entity> _classExtends = this.singleEntityMetaModel.getClassExtends();
    for (final Entity superClass : _classExtends) {
      String _name = superClass.getName();
      boolean _contains = _name.contains("SuperClass");
      Assert.assertTrue(_contains);
    }
  }
  
  @Test
  public void testQtdAttributes() {
    EList<Attribute> _attributes = this.singleEntityLang.getAttributes();
    int _size = _attributes.size();
    LinkedHashSet<model.domainLayer.Attribute> _attributes_1 = this.singleEntityMetaModel.getAttributes();
    int _size_1 = _attributes_1.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testAttributes() {
    String _acessModifier = this.singleAttrLang.getAcessModifier();
    AccessModifier _accessModifier = this.singleAttrMetaModel.getAccessModifier();
    String _string = _accessModifier.toString();
    boolean _equalsIgnoreCase = _acessModifier.equalsIgnoreCase(_string);
    Assert.assertTrue(_equalsIgnoreCase);
    String _type = this.singleAttrLang.getType();
    String _string_1 = _type.toString();
    String _genericType = this.singleAttrMetaModel.genericType();
    Assert.assertEquals(_string_1, _genericType);
    String _name = this.singleAttrLang.getName();
    String _name_1 = this.singleAttrMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
  }
  
  @Test
  public void testRepositoryEntityName() {
    String _name = this.repositoryLang.getName();
    String _name_1 = this.repositoryMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
  }
  
  @Test
  public void testQtdRepositoryFields() {
    EList<RepositoryFields> _methods = this.repositoryLang.getMethods();
    int _size = _methods.size();
    LinkedHashSet<Method> _methods_1 = this.repositoryMetaModel.getMethods();
    int _size_1 = _methods_1.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testRepositoryFields() {
    MethodParameter _methodsParameters = this.fieldRepositoryLang.getMethodsParameters();
    EList<TypeAndAttribute> _typeAndAttr = _methodsParameters.getTypeAndAttr();
    final TypeAndAttribute methodParameterLang = _typeAndAttr.get(0);
    LinkedHashSet<Parameter> _parameters = this.fieldRepositoryMetaModel.getParameters();
    final Parameter methodParameterMetaModel = ((Parameter[])Conversions.unwrapArray(_parameters, Parameter.class))[0];
    String _nameMethod = this.fieldRepositoryLang.getNameMethod();
    String _name = this.fieldRepositoryMetaModel.getName();
    Assert.assertEquals(_nameMethod, _name);
    String _returnType = this.fieldRepositoryLang.getReturnType();
    ReturnType _returnMethod = this.fieldRepositoryMetaModel.getReturnMethod();
    String _genericType = _returnMethod.genericType();
    Assert.assertEquals(_returnType, _genericType);
    String _type = methodParameterLang.getType();
    String _genericType_1 = methodParameterMetaModel.genericType();
    Assert.assertEquals(_type, _genericType_1);
    String _name_1 = methodParameterLang.getName();
    String _name_2 = methodParameterMetaModel.getName();
    Assert.assertEquals(_name_1, _name_2);
  }
  
  @Test
  public void testQtdEnums() {
    EList<EnumBlock> _enumBlock = this.singleModuleLang.getEnumBlock();
    int _size = _enumBlock.size();
    LinkedHashSet<ClassEnum> _enums = this.singleModuleMetaModel.getEnums();
    int _size_1 = _enums.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testEnumName() {
    String _name = this.singleEnumLang.getName();
    String _name_1 = this.singleEnumMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
  }
  
  @Test
  public void testQtdValuesEnums() {
    EList<String> _values = this.singleEnumLang.getValues();
    int _size = _values.size();
    LinkedHashSet<String> _values_1 = this.singleEnumMetaModel.getValues();
    int _size_1 = _values_1.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testValuesEnum() {
    EList<String> _values = this.singleEnumLang.getValues();
    final String valueEnumLang = _values.get(0);
    LinkedHashSet<String> _values_1 = this.singleEnumMetaModel.getValues();
    final String valueEnumMetaModel = ((String[])Conversions.unwrapArray(_values_1, String.class))[0];
    Assert.assertEquals(valueEnumLang, valueEnumMetaModel);
  }
}
