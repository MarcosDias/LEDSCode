package br.edu.sr.ifes.leds.metamodel.util;

import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.metamodel.util.FindModule;
import br.edu.sr.ifes.leds.model.domainLayer.ClassEnum;
import br.edu.sr.ifes.leds.model.domainLayer.Entity;
import br.edu.sr.ifes.leds.model.domainLayer.Module;
import br.edu.sr.ifes.leds.model.domainLayer.SuperClass;
import br.edu.sr.ifes.leds.model.mainLayer.TableObjects;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class FindEntity {
  private FindModule findModule;
  
  public Entity findFullPathEntity(final List<Entity> listEntity, final String full) {
    try {
      Entity _xblockexpression = null;
      {
        String[] _split = full.split("\\.");
        List<String> splitedReverseName = ListExtensions.<String>reverse(((List<String>)Conversions.doWrapArray(_split)));
        String _head = IterableExtensions.<String>head(splitedReverseName);
        Entity resultEntntity = this.inMetaModel(listEntity, ((String) _head));
        boolean _equals = Objects.equal(resultEntntity, null);
        if (_equals) {
          throw new Exception(("Could not find the entity " + full));
        }
        Module _parent = resultEntntity.getParent();
        Iterable<String> _tail = IterableExtensions.<String>tail(splitedReverseName);
        List<String> _asList = Arrays.<String>asList(((String[])Conversions.unwrapArray(_tail, String.class)));
        this.findModule.findInverseFullPathModule(_parent, _asList, full);
        _xblockexpression = resultEntntity;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public SuperClass findFullPath(final TableObjects tableObjects, final String fullName) {
    SuperClass _xblockexpression = null;
    {
      String nameResult = fullName;
      fullName.contains(".");
      {
        String[] _split = fullName.split("\\.");
        List<String> splitedReverseName = ListExtensions.<String>reverse(((List<String>)Conversions.doWrapArray(_split)));
        String _head = IterableExtensions.<String>head(splitedReverseName);
        nameResult = ((String) _head);
      }
      SuperClass _xtrycatchfinallyexpression = null;
      try {
        List<Entity> _entities = tableObjects.getEntities();
        Entity _inMetaModel = this.inMetaModel(_entities, nameResult);
        _xtrycatchfinallyexpression = ((SuperClass) _inMetaModel);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          List<ClassEnum> _enums = tableObjects.getEnums();
          ClassEnum _inEnums = this.inEnums(_enums, nameResult);
          _xtrycatchfinallyexpression = ((SuperClass) _inEnums);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
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
  public Entity inMetaModel(final List<Entity> listEntityMetaModel, final EntityBlock entityLang) {
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
  public Entity inMetaModel(final List<Entity> listEntityMetaModel, final String nameEntity) {
    return this.findEntityInList(listEntityMetaModel, nameEntity);
  }
  
  public ClassEnum inEnums(final List<ClassEnum> cEnums, final String name) {
    try {
      for (final ClassEnum ennum : cEnums) {
        String _name = ennum.getName();
        boolean _equals = name.equals(_name);
        if (_equals) {
          return ennum;
        }
      }
      throw new Exception(("Could not find the enum " + name));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Metodo generico que busca entitdade em um metamodelo
   * @author MarcosDias
   * 
   * @param listEntityMetaModel Lista de entidades de um metamodelo
   * @param nameEntity Nome da entidade que deseja ser buscada
   * @return Entity Caso entrontrado retorna a entidade de um metamodelo, caso contrario, retorna null
   */
  private Entity findEntityInList(final List<Entity> listEntityMetaModel, final String nameEntity) {
    try {
      for (final Entity entityMetaModel : listEntityMetaModel) {
        String _name = entityMetaModel.getName();
        boolean _equals = _name.equals(nameEntity);
        if (_equals) {
          return entityMetaModel;
        }
      }
      throw new Exception(("Could not find the entity " + nameEntity));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public FindEntity() {
    FindModule _findModule = new FindModule();
    this.findModule = _findModule;
  }
}
