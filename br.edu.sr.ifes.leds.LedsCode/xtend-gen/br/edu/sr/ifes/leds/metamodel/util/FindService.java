package br.edu.sr.ifes.leds.metamodel.util;

import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields;
import com.google.common.base.Objects;
import java.util.List;
import model.domainLayer.Entity;
import model.domainLayer.Method;
import model.domainLayer.Repository;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class FindService {
  public Method inMetaModel(final List<Entity> entities, final RepositoryFields fields) {
    try {
      for (final Entity entity : entities) {
        {
          Repository _repository = entity.getRepository();
          String _name = fields.getName();
          Method field = this.inRepository(_repository, _name);
          boolean _notEquals = (!Objects.equal(field, null));
          if (_notEquals) {
            return field;
          }
        }
      }
      String _name = fields.getName();
      String _plus = ("Could not find the method of service " + _name);
      throw new Exception(_plus);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Method inRepository(final Repository repository, final String name) {
    boolean _notEquals = (!Objects.equal(repository, null));
    if (_notEquals) {
      boolean _and = false;
      List<Method> _methods = repository.getMethods();
      boolean _notEquals_1 = (!Objects.equal(_methods, null));
      if (!_notEquals_1) {
        _and = false;
      } else {
        List<Method> _methods_1 = repository.getMethods();
        int _size = _methods_1.size();
        boolean _greaterThan = (_size > 0);
        _and = _greaterThan;
      }
      if (_and) {
        List<Method> _methods_2 = repository.getMethods();
        for (final Method field : _methods_2) {
          String _name = field.getName();
          boolean _notEquals_2 = (!Objects.equal(_name, null));
          if (_notEquals_2) {
            return field;
          }
        }
      }
    }
    return null;
  }
}
