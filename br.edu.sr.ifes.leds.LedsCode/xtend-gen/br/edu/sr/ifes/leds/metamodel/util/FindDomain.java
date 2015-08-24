package br.edu.sr.ifes.leds.metamodel.util;

import java.util.LinkedHashSet;
import model.domainLayer.Domain;

@SuppressWarnings("all")
public class FindDomain {
  public Domain inMetaModel(final LinkedHashSet<Domain> domains, final String nameDomain) {
    for (final Domain dom : domains) {
      String _name = dom.getName();
      boolean _equals = _name.equals(nameDomain);
      if (_equals) {
        return dom;
      }
    }
    return null;
  }
}
