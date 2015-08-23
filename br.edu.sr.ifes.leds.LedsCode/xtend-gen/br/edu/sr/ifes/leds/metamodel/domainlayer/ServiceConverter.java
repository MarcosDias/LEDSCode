package br.edu.sr.ifes.leds.metamodel.domainlayer;

import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod;
import br.edu.sr.ifes.leds.metamodel.util.FindEntity;
import br.edu.sr.ifes.leds.metamodel.util.FindRepositoryMethod;
import java.util.LinkedHashSet;
import model.domainLayer.Entity;
import model.domainLayer.InternalServiceMethod;
import model.domainLayer.Method;
import model.domainLayer.Module;
import model.domainLayer.Repository;
import model.domainLayer.Service;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ServiceConverter {
  private FindEntity findEntity;
  
  private FindRepositoryMethod findRepositoryMethod;
  
  public LinkedHashSet<Service> convert(final EList<ServiceBlock> listServiceLang, final Module moduleMetaModel) {
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
          LinkedHashSet<model.domainLayer.ServiceMethod> _convertServiceMethod = this.convertServiceMethod(_serviceFields, _entities);
          serviceMetaModel.setMethods(_convertServiceMethod);
          listServiceMetaModel.add(serviceMetaModel);
        }
      }
      _xblockexpression = listServiceMetaModel;
    }
    return _xblockexpression;
  }
  
  public LinkedHashSet<model.domainLayer.ServiceMethod> convertServiceMethod(final EList<ServiceMethod> listServiceLang, final LinkedHashSet<Entity> listEntityMetaModel) {
    LinkedHashSet<model.domainLayer.ServiceMethod> _xblockexpression = null;
    {
      LinkedHashSet<model.domainLayer.ServiceMethod> listServiceMethodsMetaModel = new LinkedHashSet<model.domainLayer.ServiceMethod>();
      for (final ServiceMethod serviceMethodLang : listServiceLang) {
        {
          String _methodAcess = serviceMethodLang.getMethodAcess();
          InternalServiceMethod servicemethodMetaModel = this.compileService(_methodAcess, listEntityMetaModel);
          String _name = serviceMethodLang.getName();
          servicemethodMetaModel.setName(_name);
          listServiceMethodsMetaModel.add(servicemethodMetaModel);
        }
      }
      _xblockexpression = listServiceMethodsMetaModel;
    }
    return _xblockexpression;
  }
  
  public InternalServiceMethod compileService(final String methodAcessLang, final LinkedHashSet<Entity> listEntityMetaModel) {
    InternalServiceMethod _xblockexpression = null;
    {
      String[] splitMethodAcessLang = methodAcessLang.split("\\.");
      InternalServiceMethod serviceMethodMetaModel = new InternalServiceMethod();
      String _get = splitMethodAcessLang[0];
      Entity _inMetaModel = this.findEntity.inMetaModel(listEntityMetaModel, _get);
      serviceMethodMetaModel.setEntity(_inMetaModel);
      Entity _entity = serviceMethodMetaModel.getEntity();
      Repository _repository = _entity.getRepository();
      LinkedHashSet<Method> _methods = _repository.getMethods();
      String _get_1 = splitMethodAcessLang[2];
      Method repositoryMethod = this.findRepositoryMethod.inRepository(_methods, _get_1);
      serviceMethodMetaModel.setMethod(repositoryMethod);
      _xblockexpression = serviceMethodMetaModel;
    }
    return _xblockexpression;
  }
  
  public ServiceConverter() {
    FindEntity _findEntity = new FindEntity();
    this.findEntity = _findEntity;
    FindRepositoryMethod _findRepositoryMethod = new FindRepositoryMethod();
    this.findRepositoryMethod = _findRepositoryMethod;
  }
}
