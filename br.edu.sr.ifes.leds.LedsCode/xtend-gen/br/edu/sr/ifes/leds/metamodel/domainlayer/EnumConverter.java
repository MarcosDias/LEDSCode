package br.edu.sr.ifes.leds.metamodel.domainlayer;

import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.metamodel.util.FindModule;
import br.edu.sr.ifes.leds.model.domainLayer.ClassEnum;
import br.edu.sr.ifes.leds.model.domainLayer.Module;
import br.edu.sr.ifes.leds.model.mainLayer.TableObjects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class EnumConverter {
  private Project projectLang;
  
  private br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel;
  
  private FindModule findModule;
  
  public ArrayList<ClassEnum> convert(final EList<EnumBlock> listEnumLang, final TableObjects tableObjects, final Module moduleMetaModel) {
    ArrayList<ClassEnum> _xblockexpression = null;
    {
      ArrayList<ClassEnum> listEnumMetaModel = new ArrayList<ClassEnum>();
      for (final EnumBlock enumLang : listEnumLang) {
        {
          ClassEnum enumMetaModel = new ClassEnum();
          String _name = enumLang.getName();
          enumMetaModel.setName(_name);
          enumMetaModel.setParent(moduleMetaModel);
          EList<String> _values = enumLang.getValues();
          ArrayList<String> _arrayList = new ArrayList<String>(_values);
          enumMetaModel.setValues(_arrayList);
          listEnumMetaModel.add(enumMetaModel);
          List<ClassEnum> _enums = tableObjects.getEnums();
          _enums.add(enumMetaModel);
        }
      }
      _xblockexpression = listEnumMetaModel;
    }
    return _xblockexpression;
  }
  
  public EnumConverter(final Project projectLang, final br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel) {
    FindModule _findModule = new FindModule();
    this.findModule = _findModule;
    this.projectLang = projectLang;
    this.projectMetaModel = projectMetaModel;
  }
}
