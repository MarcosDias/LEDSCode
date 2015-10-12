package br.edu.sr.ifes.leds.metamodel.util;

import br.edu.sr.ifes.leds.model.domainLayer.Method;
import com.google.common.base.Objects;
import java.util.LinkedHashSet;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class FindRepositoryMethod {
  public Method inRepository(final LinkedHashSet<Method> listRepositoryMethods, final String name) {
    try {
      for (final Method repositoryMethod : listRepositoryMethods) {
        String _name = repositoryMethod.getName();
        boolean _equals = Objects.equal(_name, name);
        if (_equals) {
          return repositoryMethod;
        }
      }
      throw new Exception(("Could not find the repository " + name));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
