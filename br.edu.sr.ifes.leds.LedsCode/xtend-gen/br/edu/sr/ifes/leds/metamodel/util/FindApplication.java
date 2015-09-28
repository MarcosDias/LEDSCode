package br.edu.sr.ifes.leds.metamodel.util;

import com.google.common.base.Objects;
import java.util.List;
import model.applicationLayer.Application;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class FindApplication {
  public Application inList(final String name, final List<Application> listAppMetaModel) {
    try {
      for (final Application appMetaModel : listAppMetaModel) {
        String _name = appMetaModel.getName();
        boolean _equals = Objects.equal(_name, name);
        if (_equals) {
          return appMetaModel;
        }
      }
      throw new Exception(("Could not find the application " + name));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
