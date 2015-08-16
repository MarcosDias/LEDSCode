package br.edu.sr.ifes.leds.metamodel.util;

import com.google.common.base.Objects;
import java.util.LinkedHashSet;
import model.applicationLayer.Application;

@SuppressWarnings("all")
public class FindApplication {
  public Application inList(final String name, final LinkedHashSet<Application> listAppMetaModel) {
    for (final Application appMetaModel : listAppMetaModel) {
      String _name = appMetaModel.getName();
      boolean _equals = Objects.equal(_name, name);
      if (_equals) {
        return appMetaModel;
      }
    }
    return null;
  }
}
