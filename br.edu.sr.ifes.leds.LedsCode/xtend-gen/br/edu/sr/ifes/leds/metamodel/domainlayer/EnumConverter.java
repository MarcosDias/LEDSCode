package br.edu.sr.ifes.leds.metamodel.domainlayer;

import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock;
import java.util.LinkedHashSet;
import model.domainLayer.ClassEnum;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class EnumConverter {
  public LinkedHashSet<ClassEnum> convert(final EList<EnumBlock> listEnumLang) {
    LinkedHashSet<ClassEnum> _xblockexpression = null;
    {
      LinkedHashSet<ClassEnum> listEnumMetaModel = new LinkedHashSet<ClassEnum>();
      for (final EnumBlock enumLang : listEnumLang) {
        {
          ClassEnum enumMetaModel = new ClassEnum();
          String _name = enumLang.getName();
          enumMetaModel.setName(_name);
          EList<String> _values = enumLang.getValues();
          LinkedHashSet<String> _linkedHashSet = new LinkedHashSet<String>(_values);
          enumMetaModel.setValues(_linkedHashSet);
          listEnumMetaModel.add(enumMetaModel);
        }
      }
      _xblockexpression = listEnumMetaModel;
    }
    return _xblockexpression;
  }
}
