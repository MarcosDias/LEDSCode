package br.edu.sr.ifes.leds.metamodel;

import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Module;
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields;
import com.google.common.base.Objects;
import java.util.LinkedHashSet;
import model.domainLayer.AccessModifier;
import model.domainLayer.Attribute;
import model.domainLayer.CollectionType;
import model.domainLayer.Domain;
import model.domainLayer.Entity;
import model.domainLayer.Method;
import model.domainLayer.PrimaryDateType;
import model.domainLayer.PrimaryDateTypeEnum;
import model.domainLayer.Repository;
import model.domainLayer.ReturnType;
import model.domainLayer.SuperAttribute;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class DomainConverter {
  /**
   * Metodo que converte uma lista de objetos de dominio provenientes de uma linguagem
   * em objetos de dominio do metadominio
   * @author MarcosDias
   * 
   * @param listDomainLang Lista de dominio que serao traduzidos de objetos
   * da linguagem para objetos do metamodelo
   * @return HashSet<Domain> Set de dominio do metamodelo
   */
  public LinkedHashSet<Domain> converter(final EList<DomainBlock> listDomainLang) {
    LinkedHashSet<Domain> _xblockexpression = null;
    {
      final LinkedHashSet<Domain> setDomainMetaModel = new LinkedHashSet<Domain>();
      for (final DomainBlock domainLang : listDomainLang) {
        {
          final Domain domainMetaModel = new Domain();
          String _name = domainLang.getName();
          domainMetaModel.setName(_name);
          EList<Module> _module = domainLang.getModule();
          LinkedHashSet<model.domainLayer.Module> _convertModule = this.convertModule(_module);
          domainMetaModel.setModules(_convertModule);
          setDomainMetaModel.add(domainMetaModel);
        }
      }
      _xblockexpression = setDomainMetaModel;
    }
    return _xblockexpression;
  }
  
  /**
   * Método que converte uma lista de modulos provenientes de uma linguagem
   * em objetos do metamodelo
   * @author MarcosDias
   * 
   * @paran listModulesLang Lista de modulos que serao traduzidos
   * @return LinkedHashSet<model.domainLayer.Module> Set de modulo de metamodelo
   */
  public LinkedHashSet<model.domainLayer.Module> convertModule(final EList<Module> listModulesLang) {
    LinkedHashSet<model.domainLayer.Module> _xblockexpression = null;
    {
      final LinkedHashSet<model.domainLayer.Module> setModulesMetaModule = new LinkedHashSet<model.domainLayer.Module>();
      for (final Module moduleLang : listModulesLang) {
        {
          model.domainLayer.Module moduleMetaModel = new model.domainLayer.Module();
          String _name = moduleLang.getName();
          moduleMetaModel.setName(_name);
          EList<EntityBlock> _entityBlock = moduleLang.getEntityBlock();
          LinkedHashSet<Entity> _convertEntity = this.convertEntity(_entityBlock);
          moduleMetaModel.setEntities(_convertEntity);
          setModulesMetaModule.add(moduleMetaModel);
        }
      }
      _xblockexpression = setModulesMetaModule;
    }
    return _xblockexpression;
  }
  
  /**
   * Metodo que converte uma lista de entidades provenientes de uma linguagem
   * em objetos do metamodelo
   * @author MarcosDias
   * 
   * @param listEntityLang Lista de entidades que serao traduzidas de objetos
   * da linguagem para objetos do metamodelo
   * @return LinkedHashSet<Entity> Set de entidade do metamodelo
   */
  public LinkedHashSet<Entity> convertEntity(final EList<EntityBlock> listEntityLang) {
    LinkedHashSet<Entity> _xblockexpression = null;
    {
      LinkedHashSet<Entity> listEntityMetaModel = this.buildIncompleteEntities(listEntityLang);
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
   * @return LinkedHashSet<Entity> Lista de entidade do metamodelo
   */
  public LinkedHashSet<Entity> buildIncompleteEntities(final EList<EntityBlock> listEntityLang) {
    LinkedHashSet<Entity> _xblockexpression = null;
    {
      LinkedHashSet<Entity> listEntityMetaModel = new LinkedHashSet<Entity>();
      for (final EntityBlock entityLang : listEntityLang) {
        {
          Entity entityMetaModel = new Entity();
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
    Entity entityMetaModel = this.findEntityInMetaModel(listEntityMetaModel, entityLang);
    ExtendBlock _classExtends = entityLang.getClassExtends();
    EList<String> _values = _classExtends.getValues();
    for (final String extendLang : _values) {
      {
        Entity extendsMetaModel = this.findEntityInMetaModel(listEntityMetaModel, extendLang);
        LinkedHashSet<Entity> _classExtends_1 = entityMetaModel.getClassExtends();
        _classExtends_1.add(extendsMetaModel);
      }
    }
  }
  
  /**
   * Metodo que converte o reposotorio de uma entidade de um metamodelo
   * @author MarcosDias
   * 
   * @param listEntityLang Lista de entidades que terao seus repositorios
   * convertidos
   * @return LinkedHashSet<Entity> Set de entidade do metamodelo
   */
  public void convertRepository(final LinkedHashSet<Entity> listEntityMetaModel, final EList<EntityBlock> listEntityLang) {
    for (final EntityBlock entityLang : listEntityLang) {
      {
        Entity entityMetaModel = this.findEntityInMetaModel(listEntityMetaModel, entityLang);
        Repository repositoryMetaModel = new Repository();
        br.edu.sr.ifes.leds.ledsCodeV001.Repository _repository = entityLang.getRepository();
        String _name = _repository.getName();
        repositoryMetaModel.setName(_name);
        br.edu.sr.ifes.leds.ledsCodeV001.Repository _repository_1 = entityLang.getRepository();
        EList<RepositoryFields> _methods = _repository_1.getMethods();
        LinkedHashSet<Method> _convertRepositoriyMethods = this.convertRepositoriyMethods(listEntityMetaModel, _methods);
        repositoryMetaModel.setMethods(_convertRepositoriyMethods);
        entityMetaModel.setRepository(repositoryMetaModel);
      }
    }
  }
  
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
          listRepositoryMethodsMetaModelo.add(repositoryMethodMetaModel);
        }
      }
      _xblockexpression = listRepositoryMethodsMetaModelo;
    }
    return _xblockexpression;
  }
  
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
        Entity entityMetaModel = this.findEntityInMetaModel(listEntityMetaModel, entityLang);
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
      Entity _findEntityInMetaModel = this.findEntityInMetaModel(listEntityMetaModel, type);
      genericTypeMetaModel.setDatetype(_findEntityInMetaModel);
    } else {
      PrimaryDateType _primaryDateType = new PrimaryDateType(primitiveType);
      genericTypeMetaModel.setDatetype(_primaryDateType);
    }
  }
  
  /**
   * Método que busca uma entidade em um metamodelo,caso encontrado,
   * ele é retornado
   * @author MarcosDias
   * 
   * @param listEntityMetaModel Lista de entidades de um metamodelo
   * @param entityLang Objeto entidade de uma linguagem que serah buscado em um metamodelo
   * @return Entity Caso entrontrado retorna a entidade de um metamodelo, caso contrario, retorna null
   */
  public Entity findEntityInMetaModel(final LinkedHashSet<Entity> listEntityMetaModel, final EntityBlock entityLang) {
    String _name = entityLang.getName();
    return this.findEntityInList(listEntityMetaModel, _name);
  }
  
  /**
   * Método que busca uma entidade em um metamodelo,caso encontrado,
   * ele é retornado
   * @author MarcosDias
   * 
   * @param listEntityMetaModel Lista de entidades de um metamodelo
   * @param nameEntity Nome da entidade que deseja ser buscada
   * @return Entity Caso entrontrado retorna a entidade de um metamodelo, caso contrario, retorna null
   */
  public Entity findEntityInMetaModel(final LinkedHashSet<Entity> listEntityMetaModel, final String nameEntity) {
    return this.findEntityInList(listEntityMetaModel, nameEntity);
  }
  
  /**
   * Metodo generico que busca entitdade em um metamodelo
   * @author MarcosDias
   * 
   * @param listEntityMetaModel Lista de entidades de um metamodelo
   * @param nameEntity Nome da entidade que deseja ser buscada
   * @return Entity Caso entrontrado retorna a entidade de um metamodelo, caso contrario, retorna null
   */
  private Entity findEntityInList(final LinkedHashSet<Entity> listEntityMetaModel, final String nameEntity) {
    Object _xblockexpression = null;
    {
      for (final Entity entityMetaModel : listEntityMetaModel) {
        String _name = entityMetaModel.getName();
        boolean _equals = _name.equals(nameEntity);
        if (_equals) {
          return entityMetaModel;
        }
      }
      _xblockexpression = null;
    }
    return ((Entity)_xblockexpression);
  }
}
