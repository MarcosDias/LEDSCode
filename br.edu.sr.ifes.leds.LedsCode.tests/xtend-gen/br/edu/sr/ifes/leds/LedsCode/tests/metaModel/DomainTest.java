package br.edu.sr.ifes.leds.LedsCode.tests.metaModel;

import br.edu.sr.ifes.leds.LedsCode.tests.AbstractTestClass;
import br.edu.sr.ifes.leds.generator.ProjectConverter;
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
import java.util.List;
import model.domainLayer.AccessModifier;
import model.domainLayer.ClassEnum;
import model.domainLayer.Constraints;
import model.domainLayer.Domain;
import model.domainLayer.Entity;
import model.domainLayer.Method;
import model.domainLayer.Module;
import model.domainLayer.Parameter;
import model.domainLayer.ReturnType;
import model.domainLayer.Service;
import model.mainLayer.TableObjects;
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
  
  private List<Domain> domainMetaModel;
  
  private Domain singleDomMetaModel;
  
  private Module singleModuleMetaModel;
  
  private Module othersingleModuleMetaModel;
  
  private Entity singleEntityMetaModel;
  
  private model.domainLayer.Attribute singleAttrMetaModel;
  
  private model.domainLayer.Repository repositoryMetaModel;
  
  private Method fieldRepositoryMetaModel;
  
  private ClassEnum singleEnumMetaModel;
  
  private Service singleServiceMetaModel;
  
  private model.domainLayer.ServiceMethod fieldSingleServiceMetaModel;
  
  @Before
  public void setUp() {
    Project _parseProject = this.parseProject();
    this.projectLang = _parseProject;
    EList<DomainBlock> _domainBlock = this.projectLang.getDomainBlock();
    this.domainLang = _domainBlock;
    DomainBlock _get = this.domainLang.get(0);
    this.singleDomLang = _get;
    EList<ModuleBlock> _module = this.singleDomLang.getModule();
    ModuleBlock _get_1 = _module.get(0);
    this.singleModuleLang = _get_1;
    EList<ModuleBlock> _module_1 = this.singleDomLang.getModule();
    ModuleBlock _get_2 = _module_1.get(1);
    this.otherSingleModuleLang = _get_2;
    EList<EnumBlock> _enumBlock = this.otherSingleModuleLang.getEnumBlock();
    EnumBlock _get_3 = _enumBlock.get(0);
    this.singleEnumLang = _get_3;
    EList<EntityBlock> _entityBlock = this.singleModuleLang.getEntityBlock();
    EntityBlock _get_4 = _entityBlock.get(1);
    this.singleEntityLang = _get_4;
    EList<Attribute> _attributes = this.singleEntityLang.getAttributes();
    Attribute _get_5 = _attributes.get(0);
    this.singleAttrLang = _get_5;
    Repository _repository = this.singleEntityLang.getRepository();
    this.repositoryLang = _repository;
    EList<RepositoryFields> _methods = this.repositoryLang.getMethods();
    RepositoryFields _get_6 = _methods.get(0);
    this.fieldRepositoryLang = _get_6;
    EList<ServiceBlock> _serviceBlock = this.singleModuleLang.getServiceBlock();
    ServiceBlock _get_7 = _serviceBlock.get(0);
    this.singleServiceLang = _get_7;
    EList<ServiceMethod> _serviceFields = this.singleServiceLang.getServiceFields();
    ServiceMethod _get_8 = _serviceFields.get(0);
    this.fieldSingleServiceLang = _get_8;
    ProjectConverter _projectConverter = new ProjectConverter();
    TableObjects _convert = _projectConverter.convert(this.projectLang);
    this.tableObjects = _convert;
    model.mainLayer.Project _project = this.tableObjects.getProject();
    this.projectMetaModel = _project;
    List<Domain> _domains = this.projectMetaModel.getDomains();
    this.domainMetaModel = _domains;
    Domain _get_9 = this.domainMetaModel.get(0);
    this.singleDomMetaModel = _get_9;
    List<Module> _modules = this.singleDomMetaModel.getModules();
    Module _get_10 = _modules.get(0);
    this.singleModuleMetaModel = _get_10;
    List<Module> _modules_1 = this.singleDomMetaModel.getModules();
    Module _get_11 = _modules_1.get(1);
    this.othersingleModuleMetaModel = _get_11;
    List<ClassEnum> _enums = this.othersingleModuleMetaModel.getEnums();
    ClassEnum _get_12 = _enums.get(0);
    this.singleEnumMetaModel = _get_12;
    List<Entity> _entities = this.singleModuleMetaModel.getEntities();
    Entity _get_13 = _entities.get(1);
    this.singleEntityMetaModel = _get_13;
    List<model.domainLayer.Attribute> _attributes_1 = this.singleEntityMetaModel.getAttributes();
    model.domainLayer.Attribute _get_14 = _attributes_1.get(0);
    this.singleAttrMetaModel = _get_14;
    model.domainLayer.Repository _repository_1 = this.singleEntityMetaModel.getRepository();
    this.repositoryMetaModel = _repository_1;
    List<Method> _methods_1 = this.repositoryMetaModel.getMethods();
    Method _get_15 = _methods_1.get(0);
    this.fieldRepositoryMetaModel = _get_15;
    List<Service> _services = this.singleModuleMetaModel.getServices();
    Service _get_16 = _services.get(0);
    this.singleServiceMetaModel = _get_16;
    List<model.domainLayer.ServiceMethod> _methods_2 = this.singleServiceMetaModel.getMethods();
    model.domainLayer.ServiceMethod _get_17 = _methods_2.get(0);
    this.fieldSingleServiceMetaModel = _get_17;
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
    EList<ModuleBlock> _module = this.singleDomLang.getModule();
    int _size = _module.size();
    List<Module> _modules = this.singleDomMetaModel.getModules();
    int _size_1 = _modules.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testModuleName() {
    String _name = this.singleModuleLang.getName();
    String _name_1 = this.singleModuleMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
  }
  
  @Test
  public void testModuleParent() {
    Domain _parent = this.singleModuleMetaModel.getParent();
    Assert.assertNotNull(_parent);
  }
  
  @Test
  public void testQtdEnums() {
    EList<EnumBlock> _enumBlock = this.singleModuleLang.getEnumBlock();
    int _size = _enumBlock.size();
    List<ClassEnum> _enums = this.singleModuleMetaModel.getEnums();
    int _size_1 = _enums.size();
    Assert.assertEquals(_size, _size_1);
    List<ClassEnum> _enums_1 = this.singleModuleMetaModel.getEnums();
    int _size_2 = _enums_1.size();
    Assert.assertEquals(0, _size_2);
    List<ClassEnum> _enums_2 = this.othersingleModuleMetaModel.getEnums();
    int _size_3 = _enums_2.size();
    Assert.assertEquals(2, _size_3);
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
    List<String> _values_1 = this.singleEnumMetaModel.getValues();
    int _size_1 = _values_1.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testValuesEnum() {
    EList<String> _values = this.singleEnumLang.getValues();
    final String valueEnumLang = _values.get(0);
    List<String> _values_1 = this.singleEnumMetaModel.getValues();
    final String valueEnumMetaModel = _values_1.get(0);
    Assert.assertEquals(valueEnumLang, valueEnumMetaModel);
  }
  
  @Test
  public void testQtdEntity() {
    EList<EntityBlock> _entityBlock = this.singleModuleLang.getEntityBlock();
    int _size = _entityBlock.size();
    List<Entity> _entities = this.singleModuleMetaModel.getEntities();
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
  public void testEntityParent() {
    Module _parent = this.singleEntityMetaModel.getParent();
    Assert.assertNotNull(_parent);
  }
  
  @Test
  public void testQtdInheritanceClass() {
    ExtendBlock _classExtends = this.singleEntityLang.getClassExtends();
    EList<EntityBlock> _values = _classExtends.getValues();
    int _size = _values.size();
    List<Entity> _classExtends_1 = this.singleEntityMetaModel.getClassExtends();
    int _size_1 = _classExtends_1.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testInheritanceClass() {
    List<Entity> _classExtends = this.singleEntityMetaModel.getClassExtends();
    for (final Entity superClass : _classExtends) {
      String _name = superClass.getName();
      boolean _contains = _name.contains("Pessoa");
      Assert.assertTrue(_contains);
    }
  }
  
  @Test
  public void testQtdAttributes() {
    EList<Attribute> _attributes = this.singleEntityLang.getAttributes();
    int _size = _attributes.size();
    List<model.domainLayer.Attribute> _attributes_1 = this.singleEntityMetaModel.getAttributes();
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
  public void testConstraintsFirtsAttr() {
    EList<Attribute> _attributes = this.singleEntityLang.getAttributes();
    Attribute firstLang = _attributes.get(0);
    List<model.domainLayer.Attribute> _attributes_1 = this.singleEntityMetaModel.getAttributes();
    model.domainLayer.Attribute firstMetaModel = _attributes_1.get(0);
    boolean _isPk = firstLang.isPk();
    Constraints _constraints = firstMetaModel.getConstraints();
    boolean _isPk_1 = _constraints.isPk();
    Assert.assertEquals(Boolean.valueOf(_isPk), Boolean.valueOf(_isPk_1));
    Integer _max = firstLang.getMax();
    Constraints _constraints_1 = firstMetaModel.getConstraints();
    Integer _max_1 = _constraints_1.getMax();
    Assert.assertEquals(_max, _max_1);
    Integer _min = firstLang.getMin();
    Constraints _constraints_2 = firstMetaModel.getConstraints();
    Integer _min_1 = _constraints_2.getMin();
    Assert.assertEquals(_min, _min_1);
    Constraints _constraints_3 = firstMetaModel.getConstraints();
    boolean _isPk_2 = _constraints_3.isPk();
    Assert.assertTrue(_isPk_2);
    Constraints _constraints_4 = firstMetaModel.getConstraints();
    boolean _isNullable = _constraints_4.isNullable();
    Assert.assertFalse(_isNullable);
    Constraints _constraints_5 = firstMetaModel.getConstraints();
    boolean _isUnique = _constraints_5.isUnique();
    Assert.assertFalse(_isUnique);
  }
  
  @Test
  public void testConstraintsSecundAttr() {
    EList<Attribute> _attributes = this.singleEntityLang.getAttributes();
    Attribute secundLang = _attributes.get(1);
    List<model.domainLayer.Attribute> _attributes_1 = this.singleEntityMetaModel.getAttributes();
    model.domainLayer.Attribute secundMetaModel = _attributes_1.get(1);
    Integer _max = secundLang.getMax();
    Constraints _constraints = secundMetaModel.getConstraints();
    Integer _max_1 = _constraints.getMax();
    Assert.assertEquals(_max, _max_1);
    Constraints _constraints_1 = secundMetaModel.getConstraints();
    boolean _isPk = _constraints_1.isPk();
    Assert.assertFalse(_isPk);
    Constraints _constraints_2 = secundMetaModel.getConstraints();
    Integer _min = _constraints_2.getMin();
    Assert.assertNull(_min);
    Constraints _constraints_3 = secundMetaModel.getConstraints();
    boolean _isNullable = _constraints_3.isNullable();
    Assert.assertFalse(_isNullable);
    Constraints _constraints_4 = secundMetaModel.getConstraints();
    boolean _isUnique = _constraints_4.isUnique();
    Assert.assertFalse(_isUnique);
  }
  
  @Test
  public void testcConstraintsThirdAttr() {
    EList<Attribute> _attributes = this.singleEntityLang.getAttributes();
    Attribute thirdLang = _attributes.get(2);
    List<model.domainLayer.Attribute> _attributes_1 = this.singleEntityMetaModel.getAttributes();
    model.domainLayer.Attribute thirdMetaModel = _attributes_1.get(2);
    String _unique = thirdLang.getUnique();
    Constraints _constraints = thirdMetaModel.getConstraints();
    boolean _isUnique = _constraints.isUnique();
    String _string = Boolean.valueOf(_isUnique).toString();
    Assert.assertEquals(_unique, _string);
    Integer _min = thirdLang.getMin();
    Constraints _constraints_1 = thirdMetaModel.getConstraints();
    Integer _min_1 = _constraints_1.getMin();
    Assert.assertEquals(_min, _min_1);
    Integer _max = thirdLang.getMax();
    Constraints _constraints_2 = thirdMetaModel.getConstraints();
    Integer _max_1 = _constraints_2.getMax();
    Assert.assertEquals(_max, _max_1);
    Constraints _constraints_3 = thirdMetaModel.getConstraints();
    boolean _isPk = _constraints_3.isPk();
    Assert.assertFalse(_isPk);
    Constraints _constraints_4 = thirdMetaModel.getConstraints();
    boolean _isNullable = _constraints_4.isNullable();
    Assert.assertTrue(_isNullable);
    Constraints _constraints_5 = thirdMetaModel.getConstraints();
    boolean _isUnique_1 = _constraints_5.isUnique();
    Assert.assertTrue(_isUnique_1);
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
    List<Method> _methods_1 = this.repositoryMetaModel.getMethods();
    int _size_1 = _methods_1.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testRepositoryFields() {
    MethodParameter _methodsParameters = this.fieldRepositoryLang.getMethodsParameters();
    EList<TypeAndAttribute> _typeAndAttr = _methodsParameters.getTypeAndAttr();
    final TypeAndAttribute methodParameterLang = _typeAndAttr.get(0);
    List<Parameter> _parameters = this.fieldRepositoryMetaModel.getParameters();
    final Parameter methodParameterMetaModel = _parameters.get(0);
    String _name = this.fieldRepositoryLang.getName();
    String _name_1 = this.fieldRepositoryMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
    model.domainLayer.Repository _parent = this.fieldRepositoryMetaModel.getParent();
    Assert.assertNotNull(_parent);
    String _returnType = this.fieldRepositoryLang.getReturnType();
    ReturnType _returnMethod = this.fieldRepositoryMetaModel.getReturnMethod();
    String _genericType = _returnMethod.genericType();
    Assert.assertEquals(_returnType, _genericType);
    String _type = methodParameterLang.getType();
    String _genericType_1 = methodParameterMetaModel.genericType();
    Assert.assertEquals(_type, _genericType_1);
    String _name_2 = methodParameterLang.getName();
    String _name_3 = methodParameterMetaModel.getName();
    Assert.assertEquals(_name_2, _name_3);
  }
  
  @Test
  public void testQtdServices() {
    EList<ServiceBlock> _serviceBlock = this.singleModuleLang.getServiceBlock();
    int _size = _serviceBlock.size();
    List<Service> _services = this.singleModuleMetaModel.getServices();
    int _size_1 = _services.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testServiceName() {
    String _name = this.singleServiceLang.getName();
    String _name_1 = this.singleServiceMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
  }
  
  @Test
  public void testServiceParent() {
    Module _parent = this.singleServiceMetaModel.getParent();
    Assert.assertNotNull(_parent);
  }
  
  @Test
  public void testQtdServicesFields() {
    EList<ServiceMethod> _serviceFields = this.singleServiceLang.getServiceFields();
    int _size = _serviceFields.size();
    List<model.domainLayer.ServiceMethod> _methods = this.singleServiceMetaModel.getMethods();
    int _size_1 = _methods.size();
    Assert.assertEquals(_size, _size_1);
  }
  
  @Test
  public void testServiceField() {
    String _name = this.fieldSingleServiceLang.getName();
    String _name_1 = this.fieldSingleServiceMetaModel.getName();
    Assert.assertEquals(_name, _name_1);
    RepositoryFields _methodAcess = this.fieldSingleServiceLang.getMethodAcess();
    String _name_2 = _methodAcess.getName();
    Method _methodService = this.fieldSingleServiceMetaModel.getMethodService();
    String _name_3 = _methodService.getName();
    Assert.assertEquals(_name_2, _name_3);
  }
}
