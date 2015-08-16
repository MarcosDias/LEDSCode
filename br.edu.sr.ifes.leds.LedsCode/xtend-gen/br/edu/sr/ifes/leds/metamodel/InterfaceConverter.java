package br.edu.sr.ifes.leds.metamodel;

import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.metamodel.util.FindApplication;
import java.util.LinkedHashSet;
import model.applicationLayer.Application;
import model.interfaceLayer.Interface;
import model.interfaceLayer.Type;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class InterfaceConverter {
  private FindApplication findApplication;
  
  public Interface conveter(final InterfaceBlock ifaceLang, final LinkedHashSet<Application> listAppMetaModel) {
    Interface _xblockexpression = null;
    {
      Interface ifaceMetaModel = new Interface();
      String _name = ifaceLang.getName();
      ifaceMetaModel.setName(_name);
      EList<InterfaceApplication> _interfaceApplication = ifaceLang.getInterfaceApplication();
      LinkedHashSet<model.interfaceLayer.InterfaceApplication> _convertInterfaceApp = this.convertInterfaceApp(_interfaceApplication, listAppMetaModel);
      ifaceMetaModel.setInterfaceApplication(_convertInterfaceApp);
      _xblockexpression = ifaceMetaModel;
    }
    return _xblockexpression;
  }
  
  public LinkedHashSet<model.interfaceLayer.InterfaceApplication> convertInterfaceApp(final EList<InterfaceApplication> listIfaceAppLang, final LinkedHashSet<Application> listAppMetaModel) {
    LinkedHashSet<model.interfaceLayer.InterfaceApplication> _xblockexpression = null;
    {
      LinkedHashSet<model.interfaceLayer.InterfaceApplication> listIfaceAppMetaModel = new LinkedHashSet<model.interfaceLayer.InterfaceApplication>();
      for (final InterfaceApplication ifaceAppLang : listIfaceAppLang) {
        {
          model.interfaceLayer.InterfaceApplication ifaceAppMetaModel = new model.interfaceLayer.InterfaceApplication();
          String _name = ifaceAppLang.getName();
          ifaceAppMetaModel.setName(_name);
          String _type = ifaceAppLang.getType();
          Type _fromString = Type.fromString(_type);
          ifaceAppMetaModel.setType(_fromString);
          String _nameApp = ifaceAppLang.getNameApp();
          Application _inList = this.findApplication.inList(_nameApp, listAppMetaModel);
          ifaceAppMetaModel.setApplication(_inList);
          listIfaceAppMetaModel.add(ifaceAppMetaModel);
        }
      }
      _xblockexpression = listIfaceAppMetaModel;
    }
    return _xblockexpression;
  }
  
  public InterfaceConverter() {
    FindApplication _findApplication = new FindApplication();
    this.findApplication = _findApplication;
  }
}
