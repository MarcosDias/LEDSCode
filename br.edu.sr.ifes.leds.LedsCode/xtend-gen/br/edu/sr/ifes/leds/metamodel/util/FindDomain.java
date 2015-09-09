package br.edu.sr.ifes.leds.metamodel.util;

import java.util.List;
import java.util.Set;
import model.domainLayer.Domain;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class FindDomain {
  public Domain inMetaModel(final Set<Domain> domains, final String nameDomain) {
    for (final Domain dom : domains) {
      String _name = dom.getName();
      boolean _equals = _name.equals(nameDomain);
      if (_equals) {
        return dom;
      }
    }
    return null;
  }
  
  public void findInverseFullPathDomain(final Domain domain, final List<String> incompleteNameEntity, final String full) {
    try {
      String _name = domain.getName();
      String _get = incompleteNameEntity.get(0);
      boolean _equals = _name.equals(_get);
      if (_equals) {
        throw new Exception(("Could not find the entity " + full));
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
