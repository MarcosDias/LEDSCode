package br.edu.sr.ifes.leds.metamodel.domainlayer;

import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod;
import br.edu.sr.ifes.leds.metamodel.util.FindEntity;
import br.edu.sr.ifes.leds.metamodel.util.FindRepositoryMethod;
import br.edu.sr.ifes.leds.metamodel.util.FindService;
import br.edu.sr.ifes.leds.model.domainLayer.Entity;
import br.edu.sr.ifes.leds.model.domainLayer.Method;
import br.edu.sr.ifes.leds.model.domainLayer.Module;
import br.edu.sr.ifes.leds.model.domainLayer.Service;
import br.edu.sr.ifes.leds.model.mainLayer.TableObjects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ServiceConverter {
  private FindEntity findEntity;
  
  private FindRepositoryMethod findRepositoryMethod;
  
  private FindService findService;
  
  private Project projectLang;
  
  private br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel;
  
  public ArrayList<Service> convert(final EList<ServiceBlock> listServiceLang, final Module moduleMetaModel, final TableObjects tableObjects) {
    ArrayList<Service> _xblockexpression = null;
    {
      ArrayList<Service> listServiceMetaModel = new ArrayList<Service>();
      for (final ServiceBlock serviceLang : listServiceLang) {
        {
          Service serviceMetaModel = new Service();
          serviceMetaModel.setParent(moduleMetaModel);
          String _name = serviceLang.getName();
          serviceMetaModel.setName(_name);
          EList<ServiceMethod> _serviceFields = serviceLang.getServiceFields();
          List<Entity> _entities = moduleMetaModel.getEntities();
          ArrayList<br.edu.sr.ifes.leds.model.domainLayer.ServiceMethod> _convertServiceMethod = this.convertServiceMethod(_serviceFields, _entities, tableObjects);
          serviceMetaModel.setMethods(_convertServiceMethod);
          listServiceMetaModel.add(serviceMetaModel);
          List<Service> _services = tableObjects.getServices();
          _services.add(serviceMetaModel);
        }
      }
      _xblockexpression = listServiceMetaModel;
    }
    return _xblockexpression;
  }
  
  public ArrayList<br.edu.sr.ifes.leds.model.domainLayer.ServiceMethod> convertServiceMethod(final EList<ServiceMethod> listServiceLang, final List<Entity> listEntityMetaModel, final TableObjects tableObjects) {
    ArrayList<br.edu.sr.ifes.leds.model.domainLayer.ServiceMethod> _xblockexpression = null;
    {
      ArrayList<br.edu.sr.ifes.leds.model.domainLayer.ServiceMethod> listServiceMethodsMetaModel = new ArrayList<br.edu.sr.ifes.leds.model.domainLayer.ServiceMethod>();
      for (final ServiceMethod serviceMethodLang : listServiceLang) {
        {
          br.edu.sr.ifes.leds.model.domainLayer.ServiceMethod serviceMethodMetaModel = this.compileService(serviceMethodLang, listEntityMetaModel, tableObjects);
          listServiceMethodsMetaModel.add(serviceMethodMetaModel);
        }
      }
      _xblockexpression = listServiceMethodsMetaModel;
    }
    return _xblockexpression;
  }
  
  public br.edu.sr.ifes.leds.model.domainLayer.ServiceMethod compileService(final ServiceMethod serviceMethodLang, final List<Entity> listEntityMetaModel, final TableObjects tableObjects) {
    br.edu.sr.ifes.leds.model.domainLayer.ServiceMethod _xblockexpression = null;
    {
      br.edu.sr.ifes.leds.model.domainLayer.ServiceMethod serviceMethodMetaModel = new br.edu.sr.ifes.leds.model.domainLayer.ServiceMethod();
      String _name = serviceMethodLang.getName();
      serviceMethodMetaModel.setName(_name);
      List<Entity> _entities = tableObjects.getEntities();
      RepositoryFields _methodAcess = serviceMethodLang.getMethodAcess();
      Method _inMetaModel = this.findService.inMetaModel(_entities, _methodAcess);
      serviceMethodMetaModel.setMethodService(_inMetaModel);
      _xblockexpression = serviceMethodMetaModel;
    }
    return _xblockexpression;
  }
  
  public ServiceConverter(final Project projectLang, final br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel) {
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
