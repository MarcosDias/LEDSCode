package br.edu.sr.ifes.leds.metamodel;

import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import java.util.LinkedHashSet;
import model.applicationLayer.Application;
import model.applicationLayer.SpecificApplicationDomain;
import model.domainLayer.Domain;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class AppConverter {
  public LinkedHashSet<Application> conveter(final EList<ApplicationBlock> listAppLang, final LinkedHashSet<Domain> listDomainMetaModel) {
    LinkedHashSet<Application> _xblockexpression = null;
    {
      LinkedHashSet<Application> listAppMetaModel = new LinkedHashSet<Application>();
      for (final ApplicationBlock appLang : listAppLang) {
        {
          Application appMetaModel = new Application();
          String _name = appLang.getName();
          appMetaModel.setName(_name);
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
      for (final String appDomainLang : listAppDomainLang) {
      }
      _xblockexpression = listAppStructureMetaModel;
    }
    return _xblockexpression;
  }
}
