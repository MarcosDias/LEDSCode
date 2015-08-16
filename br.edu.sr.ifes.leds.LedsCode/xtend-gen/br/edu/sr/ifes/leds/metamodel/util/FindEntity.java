package br.edu.sr.ifes.leds.metamodel.util;

import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import java.util.LinkedHashSet;
import model.domainLayer.Entity;

@SuppressWarnings("all")
public class FindEntity {
  /**
   * Método que busca uma entidade em um metamodelo,caso encontrado,
   * ele é retornado
   * @author MarcosDias
   * 
   * @param listEntityMetaModel Lista de entidades de um metamodelo
   * @param entityLang Objeto entidade de uma linguagem que serah buscado em um metamodelo
   * @return Entity Caso entrontrado retorna a entidade de um metamodelo, caso contrario, retorna null
   */
  public Entity inMetaModel(final LinkedHashSet<Entity> listEntityMetaModel, final EntityBlock entityLang) {
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
  public Entity inMetaModel(final LinkedHashSet<Entity> listEntityMetaModel, final String nameEntity) {
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
