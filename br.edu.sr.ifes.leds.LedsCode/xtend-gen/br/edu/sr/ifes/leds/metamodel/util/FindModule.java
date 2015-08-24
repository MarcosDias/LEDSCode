package br.edu.sr.ifes.leds.metamodel.util;

import java.util.LinkedHashSet;
import model.domainLayer.Module;

@SuppressWarnings("all")
public class FindModule {
  public Module inMetaModel(final LinkedHashSet<Module> modules, final String nameModule) {
    Object _xblockexpression = null;
    {
      for (final Module mod : modules) {
        String _name = mod.getName();
        boolean _equals = _name.equals(nameModule);
        if (_equals) {
          return mod;
        }
      }
      _xblockexpression = null;
    }
    return ((Module)_xblockexpression);
  }
}
