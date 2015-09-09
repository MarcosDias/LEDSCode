package br.edu.sr.ifes.leds.metamodel;

import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.metamodel.util.FindDomain;
import br.edu.sr.ifes.leds.metamodel.util.FindModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import model.applicationLayer.Application;
import model.applicationLayer.SpecificApplicationDomain;
import model.applicationLayer.SpecificApplicationModule;
import model.domainLayer.Domain;
import model.domainLayer.Module;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class AppConverter {
  private Project projectLang;
  
  private model.mainLayer.Project projectMetaModel;
  
  public LinkedHashSet<Application> conveter(final EList<ApplicationBlock> listAppLang, final LinkedHashSet<Domain> listDomainMetaModel) {
    LinkedHashSet<Application> _xblockexpression = null;
    {
      LinkedHashSet<Application> listAppMetaModel = new LinkedHashSet<Application>();
      for (final ApplicationBlock appLang : listAppLang) {
        {
          Application appMetaModel = new Application();
          String _name = appLang.getName();
          appMetaModel.setName(_name);
          EList<String> _applicationDomain = appLang.getApplicationDomain();
          LinkedHashSet<SpecificApplicationDomain> _convertStructureApp = this.convertStructureApp(_applicationDomain, listDomainMetaModel);
          appMetaModel.setStructure(_convertStructureApp);
          listAppMetaModel.add(appMetaModel);
        }
      }
      _xblockexpression = listAppMetaModel;
    }
    return _xblockexpression;
  }
  
  public LinkedHashSet<SpecificApplicationDomain> convertStructureApp(final EList<String> listAppDomainLang, final LinkedHashSet<Domain> listDomainsMetaModel) {
    LinkedHashSet<SpecificApplicationDomain> _xblockexpression = null;
    {
      LinkedHashSet<SpecificApplicationDomain> listAppStructureMetaModel = new LinkedHashSet<SpecificApplicationDomain>();
      for (final String singleStrutureApp : listAppDomainLang) {
        {
          String[] strutureAppLang = singleStrutureApp.split("\\.");
          List<String> _asList = Arrays.<String>asList(strutureAppLang);
          ArrayList<String> _arrayList = new ArrayList<String>(_asList);
          SpecificApplicationDomain singleStrutureMetaModel = this.convertSpecificationDomainApp(_arrayList, listDomainsMetaModel);
          listAppStructureMetaModel.add(singleStrutureMetaModel);
        }
      }
      _xblockexpression = listAppStructureMetaModel;
    }
    return _xblockexpression;
  }
  
  public SpecificApplicationDomain convertSpecificationDomainApp(final List<String> strutureAppLang, final LinkedHashSet<Domain> domains) {
    SpecificApplicationDomain _xblockexpression = null;
    {
      SpecificApplicationDomain strutureDomainAppMetaModel = new SpecificApplicationDomain();
      FindDomain findDomain = new FindDomain();
      String _get = strutureAppLang.get(0);
      Domain _inMetaModel = findDomain.inMetaModel(domains, _get);
      strutureDomainAppMetaModel.setDomain(_inMetaModel);
      strutureAppLang.remove(0);
      Domain _domain = strutureDomainAppMetaModel.getDomain();
      SpecificApplicationModule _convertSpecificationModuleApp = this.convertSpecificationModuleApp(strutureAppLang, _domain);
      strutureDomainAppMetaModel.setSon(_convertSpecificationModuleApp);
      _xblockexpression = strutureDomainAppMetaModel;
    }
    return _xblockexpression;
  }
  
  public SpecificApplicationModule convertSpecificationModuleApp(final List<String> strutureAppLang, final Domain domain) {
    SpecificApplicationModule _xblockexpression = null;
    {
      int _size = strutureAppLang.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        return null;
      }
      SpecificApplicationModule strutureModuleAppMetaModel = new SpecificApplicationModule();
      FindModule findModule = new FindModule();
      LinkedHashSet<Module> _modules = domain.getModules();
      String _get = strutureAppLang.get(0);
      Module _inMetaModel = findModule.inMetaModel(_modules, _get);
      strutureModuleAppMetaModel.setModule(_inMetaModel);
      _xblockexpression = strutureModuleAppMetaModel;
    }
    return _xblockexpression;
  }
  
  public AppConverter(final Project projectLang, final model.mainLayer.Project projectMetaModel) {
    this.projectLang = projectLang;
    this.projectMetaModel = projectMetaModel;
  }
}
