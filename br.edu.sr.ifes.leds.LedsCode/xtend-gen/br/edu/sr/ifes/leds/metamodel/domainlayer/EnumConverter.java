package br.edu.sr.ifes.leds.metamodel.domainlayer;

import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import java.util.LinkedHashSet;
import java.util.Set;
import model.domainLayer.ClassEnum;
import model.mainLayer.TableObjects;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class EnumConverter {
  private Project projectLang;
  
  private model.mainLayer.Project projectMetaModel;
  
  public LinkedHashSet<ClassEnum> convert(final EList<EnumBlock> listEnumLang, final TableObjects tableObjects) {
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
          Set<ClassEnum> _enums = tableObjects.getEnums();
          _enums.add(enumMetaModel);
        }
      }
      _xblockexpression = listEnumMetaModel;
    }
    return _xblockexpression;
  }
  
  public EnumConverter(final Project projectLang, final model.mainLayer.Project projectMetaModel) {
    this.projectLang = projectLang;
    this.projectMetaModel = projectMetaModel;
  }
}
