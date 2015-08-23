package br.edu.sr.ifes.leds.metamodel.domainlayer;

import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter;
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields;
import br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute;
import br.edu.sr.ifes.leds.metamodel.util.FindEntity;
import com.google.common.base.Objects;
import java.util.LinkedHashSet;
import model.domainLayer.AccessModifier;
import model.domainLayer.Attribute;
import model.domainLayer.CollectionType;
import model.domainLayer.Constraints;
import model.domainLayer.Entity;
import model.domainLayer.Method;
import model.domainLayer.Module;
import model.domainLayer.Parameter;
import model.domainLayer.PrimaryDateType;
import model.domainLayer.PrimaryDateTypeEnum;
import model.domainLayer.Repository;
import model.domainLayer.ReturnType;
import model.domainLayer.SuperAttribute;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class EntityConverter {
  private FindEntity findEntity;
  
  /**
   * Metodo que converte uma lista de entidades provenientes de uma linguagem
   * em objetos do metamodelo
   * @author MarcosDias
   * 
   * @param listEntityLang Lista de entidades que serao traduzidas de objetos
   * da linguagem para objetos do metamodelo
   * @param moduleMetaModel Modulo que está sendo processado no momento
   * @return LinkedHashSet<Entity> Set de entidade do metamodelo
   */
  public LinkedHashSet<Entity> convert(final EList<EntityBlock> listEntityLang, final Module moduleMetaModel) {
    LinkedHashSet<Entity> _xblockexpression = null;
    {
      LinkedHashSet<Entity> listEntityMetaModel = this.buildIncompleteEntities(listEntityLang, moduleMetaModel);
      this.convertClassExtendsEntities(listEntityMetaModel, listEntityLang);
      this.convertAttributes(listEntityMetaModel, listEntityLang);
      this.convertRepository(listEntityMetaModel, listEntityLang);
      _xblockexpression = listEntityMetaModel;
    }
    return _xblockexpression;
  }
  
  /**
   * Como a entidade se comporta como um grafo com possiveis ciclos,
   * é necessario que todos as entidades estejam na lista para que os ciclos sejam
   * montados. Esse metodo monta a lista inicial de entidades do MetaModelo
   * baseado na linguagem
   * @author MarcosDias
   * 
   * @param listEntityLang List de entidades da linguagem
   * @param moduleMetaModel Modulo que está sendo processado no momento
   * @return LinkedHashSet<Entity> Lista de entidade do metamodelo
   */
  public LinkedHashSet<Entity> buildIncompleteEntities(final EList<EntityBlock> listEntityLang, final Module moduleMetaModel) {
    LinkedHashSet<Entity> _xblockexpression = null;
    {
      LinkedHashSet<Entity> listEntityMetaModel = new LinkedHashSet<Entity>();
      for (final EntityBlock entityLang : listEntityLang) {
        {
          Entity entityMetaModel = new Entity();
          entityMetaModel.setParent(moduleMetaModel);
          String _name = entityLang.getName();
          entityMetaModel.setName(_name);
          boolean _isIsAbstract = entityLang.isIsAbstract();
          entityMetaModel.setAbstrato(_isIsAbstract);
          String _acessModifier = entityLang.getAcessModifier();
          AccessModifier _fromString = AccessModifier.fromString(_acessModifier);
          entityMetaModel.setAccessModifier(_fromString);
          LinkedHashSet<Attribute> _linkedHashSet = new LinkedHashSet<Attribute>();
          entityMetaModel.setAttributes(_linkedHashSet);
          LinkedHashSet<Entity> _linkedHashSet_1 = new LinkedHashSet<Entity>();
          entityMetaModel.setClassExtends(_linkedHashSet_1);
          Repository _repository = new Repository();
          entityMetaModel.setRepository(_repository);
          listEntityMetaModel.add(entityMetaModel);
        }
      }
      _xblockexpression = listEntityMetaModel;
    }
    return _xblockexpression;
  }
  
  /**
   * Como a entidade se comporta como um grafo com possiveis ciclos,
   * é necessario que todos as entidades estejam na lista para que os ciclos sejam
   * montados. Dado que a lista de entidades foi montada, esse método
   * monta os ciclos existentes.
   * @author MarcosDias
   * 
   * @param listEntityMetaModel Lista de Entidades provenientes do MetaModelo
   * @paran listEntityLang Lista de Entidades provenientes do linguagem
   */
  public void convertClassExtendsEntities(final LinkedHashSet<Entity> listEntityMetaModel, final EList<EntityBlock> listEntityLang) {
    for (final EntityBlock entityLang : listEntityLang) {
      ExtendBlock _classExtends = entityLang.getClassExtends();
      boolean _notEquals = (!Objects.equal(_classExtends, null));
      if (_notEquals) {
        this.buildClassExtendsEntities(listEntityMetaModel, entityLang);
      }
    }
  }
  
  /**
   * Adiciona as entidades suas classes extensoras
   * @author MarcosDias
   * 
   * @param listEntityMetaModel Lista de entidades do MetaModelo que será processada
   * @param entityLang entidade da linguagem que que serah processada
   */
  private void buildClassExtendsEntities(final LinkedHashSet<Entity> listEntityMetaModel, final EntityBlock entityLang) {
    Entity entityMetaModel = this.findEntity.inMetaModel(listEntityMetaModel, entityLang);
    ExtendBlock _classExtends = entityLang.getClassExtends();
    EList<String> _values = _classExtends.getValues();
    for (final String extendLang : _values) {
      {
        Entity extendsMetaModel = this.findEntity.inMetaModel(listEntityMetaModel, extendLang);
        LinkedHashSet<Entity> _classExtends_1 = entityMetaModel.getClassExtends();
        _classExtends_1.add(extendsMetaModel);
      }
    }
  }
  
  /**
   * Metodo que converte o reposotorio de uma entidade de um metamodelo
   * @author MarcosDias
   * 
   * @param listEntityMetaModel Lista de Entidades provenientes do MetaModelo
   * convertidos
   * @return LinkedHashSet<Entity> Set de entidade do metamodelo
   */
  public void convertRepository(final LinkedHashSet<Entity> listEntityMetaModel, final EList<EntityBlock> listEntityLang) {
    for (final EntityBlock entityLang : listEntityLang) {
      {
        Entity entityMetaModel = this.findEntity.inMetaModel(listEntityMetaModel, entityLang);
        Repository repositoryMetaModel = new Repository();
        br.edu.sr.ifes.leds.ledsCodeV001.Repository _repository = entityLang.getRepository();
        boolean _notEquals = (!Objects.equal(_repository, null));
        if (_notEquals) {
          br.edu.sr.ifes.leds.ledsCodeV001.Repository _repository_1 = entityLang.getRepository();
          String _name = _repository_1.getName();
          repositoryMetaModel.setName(_name);
          br.edu.sr.ifes.leds.ledsCodeV001.Repository _repository_2 = entityLang.getRepository();
          EList<RepositoryFields> _methods = _repository_2.getMethods();
          LinkedHashSet<Method> _convertRepositoriyMethods = this.convertRepositoriyMethods(listEntityMetaModel, _methods);
          repositoryMetaModel.setMethods(_convertRepositoriyMethods);
          entityMetaModel.setRepository(repositoryMetaModel);
        }
      }
    }
  }
  
  /**
   * Método que converte os metodos dos repositorios para metamodelo
   * @author MarcosDias
   * 
   * @param listEntityLang Lista de entidades que terao seus repositorios
   * convertidos
   * @param listRepositoryMethodsLang Lista de metodos de um repositorio de uma linguagem
   * @return LinkedHashSet<Method> Lista de metodos de um repositorio já em no
   * formato do MetaModelo
   */
  public LinkedHashSet<Method> convertRepositoriyMethods(final LinkedHashSet<Entity> listEntityMetaModel, final EList<RepositoryFields> listRepositoryMethodsLang) {
    LinkedHashSet<Method> _xblockexpression = null;
    {
      LinkedHashSet<Method> listRepositoryMethodsMetaModelo = new LinkedHashSet<Method>();
      for (final RepositoryFields repositoryMethodslang : listRepositoryMethodsLang) {
        {
          Method repositoryMethodMetaModel = new Method();
          String _nameMethod = repositoryMethodslang.getNameMethod();
          repositoryMethodMetaModel.setName(_nameMethod);
          String _returnType = repositoryMethodslang.getReturnType();
          ReturnType _returnType_1 = new ReturnType();
          SuperAttribute _convertGenericType = this.convertGenericType(listEntityMetaModel, _returnType, _returnType_1);
          repositoryMethodMetaModel.setReturnMethod(((ReturnType) _convertGenericType));
          MethodParameter _methodsParameters = repositoryMethodslang.getMethodsParameters();
          LinkedHashSet<Parameter> _convertparameters = this.convertparameters(listEntityMetaModel, _methodsParameters);
          repositoryMethodMetaModel.setParameters(_convertparameters);
          listRepositoryMethodsMetaModelo.add(repositoryMethodMetaModel);
        }
      }
      _xblockexpression = listRepositoryMethodsMetaModelo;
    }
    return _xblockexpression;
  }
  
  /**
   * Metodo que converte uma lista de parametros em parametros para um metamodelo
   * @author MarcosDias
   * 
   * @param listEntityMetaModel Lista de Entidades provenientes do MetaModelo
   * @param parameteresLang Lista de paramentros que seram convertidos
   * @return LinkedHashSet<Parameter> Lista de parametros do metamodelo
   */
  public LinkedHashSet<Parameter> convertparameters(final LinkedHashSet<Entity> listEntityMetaModel, final MethodParameter parameteresLang) {
    LinkedHashSet<Parameter> _xblockexpression = null;
    {
      LinkedHashSet<Parameter> parameteresMetaModel = new LinkedHashSet<Parameter>();
      boolean _notEquals = (!Objects.equal(parameteresLang, null));
      if (_notEquals) {
        EList<TypeAndAttribute> _typeAndAttr = parameteresLang.getTypeAndAttr();
        for (final TypeAndAttribute paramLang : _typeAndAttr) {
          {
            Parameter paramMetaModel = new Parameter();
            String _name = paramLang.getName();
            paramMetaModel.setName(_name);
            String _type = paramLang.getType();
            this.convertGenericType(listEntityMetaModel, _type, paramMetaModel);
            parameteresMetaModel.add(paramMetaModel);
          }
        }
      }
      _xblockexpression = parameteresMetaModel;
    }
    return _xblockexpression;
  }
  
  /**
   * Método que converte um tipo de um objeto para um tipo do metamodelo
   * @author MarcosDias
   * 
   * @param listEntityMetaModel Lista de Entidades do MetaModelo
   * @param typeObject Nome do tipo do objeto que deseja ser traduzido
   * @param genericTypeMetaModel Objeto de destino após a conversão,
   * podendo ser um `Attribute`, `ReturnType` ou um `Parameter`
   * @return SuperAttribute Objecto Convertido e com o tipo correto
   */
  public SuperAttribute convertGenericType(final LinkedHashSet<Entity> listEntityMetaModel, final String typeObject, final SuperAttribute genericTypeMetaModel) {
    SuperAttribute _xblockexpression = null;
    {
      boolean _or = false;
      boolean _contains = typeObject.contains("Set");
      if (_contains) {
        _or = true;
      } else {
        boolean _contains_1 = typeObject.contains("List");
        _or = _contains_1;
      }
      if (_or) {
        String[] splitType = typeObject.split("<");
        String collectionType = splitType[0];
        String _get = splitType[1];
        String[] _split = _get.split(">");
        String type = _split[0];
        CollectionType _fromString = CollectionType.fromString(collectionType);
        genericTypeMetaModel.setCollectionType(_fromString);
        this.processAttrType(type, genericTypeMetaModel, listEntityMetaModel);
      } else {
        genericTypeMetaModel.setCollectionType(null);
        this.processAttrType(typeObject, genericTypeMetaModel, listEntityMetaModel);
      }
      _xblockexpression = genericTypeMetaModel;
    }
    return _xblockexpression;
  }
  
  /**
   * Metodo que converte uma lista de entidades provenientes de uma linguagem
   * em objetos do metamodelo
   * @author MarcosDias
   * 
   * @param listEntityMetaModel Lista de entidades que terao seus atributos
   * processados
   * @param listEntityLang Lista de entidades da linguagem para suporte
   */
  public void convertAttributes(final LinkedHashSet<Entity> listEntityMetaModel, final EList<EntityBlock> listEntityLang) {
    for (final EntityBlock entityLang : listEntityLang) {
      {
        Entity entityMetaModel = this.findEntity.inMetaModel(listEntityMetaModel, entityLang);
        LinkedHashSet<Attribute> _linkedHashSet = new LinkedHashSet<Attribute>();
        entityMetaModel.setAttributes(_linkedHashSet);
        EList<br.edu.sr.ifes.leds.ledsCodeV001.Attribute> _attributes = entityLang.getAttributes();
        for (final br.edu.sr.ifes.leds.ledsCodeV001.Attribute attrLang : _attributes) {
          {
            Attribute attrMetaModel = new Attribute();
            String _name = attrLang.getName();
            attrMetaModel.setName(_name);
            String _acessModifier = attrLang.getAcessModifier();
            AccessModifier _fromString = AccessModifier.fromString(_acessModifier);
            attrMetaModel.setAccessModifier(_fromString);
            Constraints _processConstraintsAttr = this.processConstraintsAttr(attrLang);
            attrMetaModel.setConstraints(_processConstraintsAttr);
            String _type = attrLang.getType();
            this.convertGenericType(listEntityMetaModel, _type, attrMetaModel);
            LinkedHashSet<Attribute> _attributes_1 = entityMetaModel.getAttributes();
            _attributes_1.add(attrMetaModel);
          }
        }
      }
    }
  }
  
  /**
   * Metodo que converte a constraint usada para o MetaModelo
   * @author MarcosDias
   * 
   * @param attr Atributo da Linguagem que sera usada para converter o Constraint
   * @return Constraint do MetaModelo
   */
  public Constraints processConstraintsAttr(final br.edu.sr.ifes.leds.ledsCodeV001.Attribute attr) {
    Constraints _xblockexpression = null;
    {
      Constraints const_ = new Constraints();
      boolean _isPk = attr.isPk();
      const_.setPk(_isPk);
      String _unique = attr.getUnique();
      boolean _parseBoolean = Boolean.parseBoolean(_unique);
      const_.setUnique(_parseBoolean);
      String _nullable = attr.getNullable();
      boolean _parseBoolean_1 = Boolean.parseBoolean(_nullable);
      const_.setNullable(_parseBoolean_1);
      Integer _max = attr.getMax();
      const_.setMax(_max);
      Integer _min = attr.getMin();
      const_.setMin(_min);
      _xblockexpression = const_;
    }
    return _xblockexpression;
  }
  
  /**
   * Metodo que processa a conversao do tipo da linguagem para o metamodelo
   * @author MarcosDias
   * 
   * @param type Tipo da linguagem proveniente de uma linguagem
   * @param attrMetaModel atributo do metamodelo que sera processado no momento
   * @param listEntityMetaModel Lista de entidades do metamodelo
   */
  public void processAttrType(final String type, final SuperAttribute genericTypeMetaModel, final LinkedHashSet<Entity> listEntityMetaModel) {
    PrimaryDateTypeEnum primitiveType = PrimaryDateTypeEnum.fromString(type);
    boolean _equals = Objects.equal(primitiveType, null);
    if (_equals) {
      Entity _inMetaModel = this.findEntity.inMetaModel(listEntityMetaModel, type);
      genericTypeMetaModel.setDatetype(_inMetaModel);
    } else {
      PrimaryDateType _primaryDateType = new PrimaryDateType(primitiveType);
      genericTypeMetaModel.setDatetype(_primaryDateType);
    }
  }
  
  public EntityConverter() {
    FindEntity _findEntity = new FindEntity();
    this.findEntity = _findEntity;
  }
}
