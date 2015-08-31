package br.edu.sr.ifes.leds.metamodel;

import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock;
import br.edu.sr.ifes.leds.metamodel.domainlayer.EntityConverter;
import br.edu.sr.ifes.leds.metamodel.domainlayer.EnumConverter;
import br.edu.sr.ifes.leds.metamodel.domainlayer.ServiceConverter;
import java.util.LinkedHashSet;
import java.util.Set;
import model.domainLayer.ClassEnum;
import model.domainLayer.Domain;
import model.domainLayer.Entity;
import model.domainLayer.Module;
import model.domainLayer.Service;
import model.mainLayer.TableObjects;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class DomainConverter {
  private EnumConverter enumConverter;
  
  private EntityConverter entityConverter;
  
  private ServiceConverter serviceConverter;
  
  /**
   * Metodo que converte uma lista de objetos de dominio provenientes de uma linguagem
   * em objetos de dominio do metadominio
   * @author MarcosDias
   * 
   * @param listDomainLang Lista de dominio que serao traduzidos de objetos
   * da linguagem para objetos do metamodelo
   * @return HashSet<Domain> Set de dominio do metamodelo
   */
  public LinkedHashSet<Domain> converter(final EList<DomainBlock> listDomainLang, final TableObjects tableObjects) {
    LinkedHashSet<Domain> _xblockexpression = null;
    {
      final LinkedHashSet<Domain> setDomainMetaModel = new LinkedHashSet<Domain>();
      for (final DomainBlock domainLang : listDomainLang) {
        {
          final Domain domainMetaModel = new Domain();
          String _name = domainLang.getName();
          domainMetaModel.setName(_name);
          EList<ModuleBlock> _module = domainLang.getModule();
          LinkedHashSet<Module> _convertModule = this.convertModule(_module, domainMetaModel, tableObjects);
          domainMetaModel.setModules(_convertModule);
          setDomainMetaModel.add(domainMetaModel);
        }
      }
      _xblockexpression = setDomainMetaModel;
    }
    return _xblockexpression;
  }
  
  /**
   * Método que converte uma lista de modulos provenientes de uma linguagem
   * em objetos do metamodelo
   * @author MarcosDias
   * 
   * @paran listModulesLang Lista de modulos que serao traduzidos
   * @param domainMetaModel Dominio que esta sendo processado
   * @return LinkedHashSet<model.domainLayer.Module> Set de modulo de metamodelo
   */
  public LinkedHashSet<Module> convertModule(final EList<ModuleBlock> listModulesLang, final Domain domainMetaModel, final TableObjects tableObjects) {
    LinkedHashSet<Module> _xblockexpression = null;
    {
      final LinkedHashSet<Module> setModulesMetaModule = new LinkedHashSet<Module>();
      for (final ModuleBlock moduleLang : listModulesLang) {
        {
          Module moduleMetaModel = new Module();
          moduleMetaModel.setParent(domainMetaModel);
          String _name = moduleLang.getName();
          moduleMetaModel.setName(_name);
          EList<EntityBlock> _entityBlock = moduleLang.getEntityBlock();
          LinkedHashSet<Entity> _convert = this.entityConverter.convert(_entityBlock, moduleMetaModel, tableObjects);
          moduleMetaModel.setEntities(_convert);
          EList<EnumBlock> _enumBlock = moduleLang.getEnumBlock();
          LinkedHashSet<ClassEnum> _convert_1 = this.enumConverter.convert(_enumBlock, tableObjects);
          moduleMetaModel.setEnums(_convert_1);
          EList<ServiceBlock> _serviceBlock = moduleLang.getServiceBlock();
          LinkedHashSet<Service> _convert_2 = this.serviceConverter.convert(_serviceBlock, moduleMetaModel, tableObjects);
          moduleMetaModel.setServices(_convert_2);
          setModulesMetaModule.add(moduleMetaModel);
          Set<Module> _modules = tableObjects.getModules();
          _modules.add(moduleMetaModel);
        }
      }
      _xblockexpression = setModulesMetaModule;
    }
    return _xblockexpression;
  }
  
  public DomainConverter() {
    EntityConverter _entityConverter = new EntityConverter();
    this.entityConverter = _entityConverter;
    EnumConverter _enumConverter = new EnumConverter();
    this.enumConverter = _enumConverter;
    ServiceConverter _serviceConverter = new ServiceConverter();
    this.serviceConverter = _serviceConverter;
  }
}
