package br.edu.sr.ifes.leds.metamodel;

import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.metamodel.util.FindApplication;
import br.edu.sr.ifes.leds.model.applicationLayer.Application;
import br.edu.sr.ifes.leds.model.interfaceLayer.Interface;
import br.edu.sr.ifes.leds.model.interfaceLayer.Type;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class InterfaceConverter {
  private FindApplication findApplication;
  
  private Project projectLang;
  
  private br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel;
  
  public Interface conveter(final InterfaceBlock ifaceLang, final List<Application> listAppMetaModel) {
    Interface _xblockexpression = null;
    {
      Interface ifaceMetaModel = new Interface();
      String _name = ifaceLang.getName();
      ifaceMetaModel.setName(_name);
      EList<InterfaceApplication> _interfaceApplication = ifaceLang.getInterfaceApplication();
      ArrayList<br.edu.sr.ifes.leds.model.interfaceLayer.InterfaceApplication> _convertInterfaceApp = this.convertInterfaceApp(_interfaceApplication, listAppMetaModel);
      ifaceMetaModel.setInterfaceApplication(_convertInterfaceApp);
      _xblockexpression = ifaceMetaModel;
    }
    return _xblockexpression;
  }
  
  public ArrayList<br.edu.sr.ifes.leds.model.interfaceLayer.InterfaceApplication> convertInterfaceApp(final EList<InterfaceApplication> listIfaceAppLang, final List<Application> listAppMetaModel) {
    ArrayList<br.edu.sr.ifes.leds.model.interfaceLayer.InterfaceApplication> _xblockexpression = null;
    {
      ArrayList<br.edu.sr.ifes.leds.model.interfaceLayer.InterfaceApplication> listIfaceAppMetaModel = new ArrayList<br.edu.sr.ifes.leds.model.interfaceLayer.InterfaceApplication>();
      for (final InterfaceApplication ifaceAppLang : listIfaceAppLang) {
        {
          br.edu.sr.ifes.leds.model.interfaceLayer.InterfaceApplication ifaceAppMetaModel = new br.edu.sr.ifes.leds.model.interfaceLayer.InterfaceApplication();
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
  
  public InterfaceConverter(final Project projectLang, final br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel) {
    FindApplication _findApplication = new FindApplication();
    this.findApplication = _findApplication;
    this.projectLang = projectLang;
    this.projectMetaModel = projectMetaModel;
  }
}
