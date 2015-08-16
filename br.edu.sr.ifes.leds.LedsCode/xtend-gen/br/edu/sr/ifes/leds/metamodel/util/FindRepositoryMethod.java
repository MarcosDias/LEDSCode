package br.edu.sr.ifes.leds.metamodel.util;

import com.google.common.base.Objects;
import java.util.LinkedHashSet;
import model.domainLayer.Method;

@SuppressWarnings("all")
public class FindRepositoryMethod {
  public Method inRepository(final LinkedHashSet<Method> listRepositoryMethods, final String name) {
    Object _xblockexpression = null;
    {
      for (final Method repositoryMethod : listRepositoryMethods) {
        String _name = repositoryMethod.getName();
        boolean _equals = Objects.equal(_name, name);
        if (_equals) {
          return repositoryMethod;
        }
      }
      _xblockexpression = null;
    }
    return ((Method)_xblockexpression);
  }
}
