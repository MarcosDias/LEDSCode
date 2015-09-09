package br.edu.sr.ifes.leds.metamodel.domainlayer;

import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod;
import br.edu.sr.ifes.leds.metamodel.util.FindEntity;
import br.edu.sr.ifes.leds.metamodel.util.FindRepositoryMethod;
import br.edu.sr.ifes.leds.metamodel.util.FindService;
import java.util.LinkedHashSet;
import java.util.Set;
import model.domainLayer.Entity;
import model.domainLayer.Method;
import model.domainLayer.Module;
import model.domainLayer.Service;
import model.mainLayer.TableObjects;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ServiceConverter {
  private FindEntity findEntity;
  
  private FindRepositoryMethod findRepositoryMethod;
  
  private FindService findService;
  
  private Project projectLang;
  
  private model.mainLayer.Project projectMetaModel;
  
  public LinkedHashSet<Service> convert(final EList<ServiceBlock> listServiceLang, final Module moduleMetaModel, final TableObjects tableObjects) {
    LinkedHashSet<Service> _xblockexpression = null;
    {
      LinkedHashSet<Service> listServiceMetaModel = new LinkedHashSet<Service>();
      for (final ServiceBlock serviceLang : listServiceLang) {
        {
          Service serviceMetaModel = new Service();
          serviceMetaModel.setParent(moduleMetaModel);
          String _name = serviceLang.getName();
          serviceMetaModel.setName(_name);
          EList<ServiceMethod> _serviceFields = serviceLang.getServiceFields();
          LinkedHashSet<Entity> _entities = moduleMetaModel.getEntities();
          LinkedHashSet<model.domainLayer.ServiceMethod> _convertServiceMethod = this.convertServiceMethod(_serviceFields, _entities, tableObjects);
          serviceMetaModel.setMethods(_convertServiceMethod);
          listServiceMetaModel.add(serviceMetaModel);
          Set<Service> _services = tableObjects.getServices();
          _services.add(serviceMetaModel);
        }
      }
      _xblockexpression = listServiceMetaModel;
    }
    return _xblockexpression;
  }
  
  public LinkedHashSet<model.domainLayer.ServiceMethod> convertServiceMethod(final EList<ServiceMethod> listServiceLang, final LinkedHashSet<Entity> listEntityMetaModel, final TableObjects tableObjects) {
    LinkedHashSet<model.domainLayer.ServiceMethod> _xblockexpression = null;
    {
      LinkedHashSet<model.domainLayer.ServiceMethod> listServiceMethodsMetaModel = new LinkedHashSet<model.domainLayer.ServiceMethod>();
      for (final ServiceMethod serviceMethodLang : listServiceLang) {
        {
          model.domainLayer.ServiceMethod serviceMethodMetaModel = this.compileService(serviceMethodLang, listEntityMetaModel, tableObjects);
          listServiceMethodsMetaModel.add(serviceMethodMetaModel);
        }
      }
      _xblockexpression = listServiceMethodsMetaModel;
    }
    return _xblockexpression;
  }
  
  public model.domainLayer.ServiceMethod compileService(final ServiceMethod serviceMethodLang, final LinkedHashSet<Entity> listEntityMetaModel, final TableObjects tableObjects) {
    model.domainLayer.ServiceMethod _xblockexpression = null;
    {
      model.domainLayer.ServiceMethod serviceMethodMetaModel = new model.domainLayer.ServiceMethod();
      String _name = serviceMethodLang.getName();
      serviceMethodMetaModel.setName(_name);
      Set<Entity> _entities = tableObjects.getEntities();
      RepositoryFields _methodAcess = serviceMethodLang.getMethodAcess();
      Method _inMetaModel = this.findService.inMetaModel(_entities, _methodAcess);
      serviceMethodMetaModel.setMethodService(_inMetaModel);
      _xblockexpression = serviceMethodMetaModel;
    }
    return _xblockexpression;
  }
  
  public ServiceConverter(final Project projectLang, final model.mainLayer.Project projectMetaModel) {
    FindEntity _findEntity = new FindEntity();
    this.findEntity = _findEntity;
    FindRepositoryMethod _findRepositoryMethod = new FindRepositoryMethod();
    this.findRepositoryMethod = _findRepositoryMethod;
    FindService _findService = new FindService();
    this.findService = _findService;
    this.projectLang = projectLang;
    this.projectMetaModel = projectMetaModel;
  }
}
