package br.edu.sr.ifes.leds.metamodel.util;

import br.edu.sr.ifes.leds.metamodel.util.FindDomain;
import br.edu.sr.ifes.leds.model.domainLayer.Domain;
import br.edu.sr.ifes.leds.model.domainLayer.Module;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FindModule {
  private FindDomain findDomain;
  
  public Module inMetaModel(final List<Module> modules, final String nameModule) {
    try {
      for (final Module mod : modules) {
        String _name = mod.getName();
        boolean _equals = _name.equals(nameModule);
        if (_equals) {
          return mod;
        }
      }
      throw new Exception(("Could not find the module " + nameModule));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void findInverseFullPathModule(final Module module, final List<String> incompleteNameEntity, final String full) {
    try {
      String _name = module.getName();
      String _get = incompleteNameEntity.get(0);
      boolean _equals = _name.equals(_get);
      boolean _not = (!_equals);
      if (_not) {
        throw new Exception(("Could not find the entity " + full));
      }
      int _size = incompleteNameEntity.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        Domain _parent = module.getParent();
        Iterable<String> _tail = IterableExtensions.<String>tail(incompleteNameEntity);
        List<String> _asList = Arrays.<String>asList(((String[])Conversions.unwrapArray(_tail, String.class)));
        this.findDomain.findInverseFullPathDomain(_parent, _asList, full);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public FindModule() {
    FindDomain _findDomain = new FindDomain();
    this.findDomain = _findDomain;
  }
}
