package br.edu.sr.ifes.leds.metamodel;

import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock;
import br.edu.sr.ifes.leds.metamodel.domainlayer.EntityConverter;
import br.edu.sr.ifes.leds.metamodel.domainlayer.EnumConverter;
import br.edu.sr.ifes.leds.metamodel.domainlayer.ServiceConverter;
import br.edu.sr.ifes.leds.model.domainLayer.ClassEnum;
import br.edu.sr.ifes.leds.model.domainLayer.Domain;
import br.edu.sr.ifes.leds.model.domainLayer.Entity;
import br.edu.sr.ifes.leds.model.domainLayer.Module;
import br.edu.sr.ifes.leds.model.domainLayer.Service;
import br.edu.sr.ifes.leds.model.mainLayer.TableObjects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class DomainConverter {
  private EnumConverter enumConverter;
  
  private EntityConverter entityConverter;
  
  private ServiceConverter serviceConverter;
  
  private Project projectLang;
  
  private br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel;
  
  /**
   * Metodo que converte uma lista de objetos de dominio provenientes de uma linguagem
   * em objetos de dominio do metadominio
   * @author MarcosDias
   * 
   * @param listDomainLang Lista de dominio que serao traduzidos de objetos
   * da linguagem para objetos do metamodelo
   * @return HashSet<Domain> Set de dominio do metamodelo
   */
  public ArrayList<Domain> converter(final EList<DomainBlock> listDomainLang, final TableObjects tableObjects) {
    ArrayList<Domain> _xblockexpression = null;
    {
      final ArrayList<Domain> setDomainMetaModel = new ArrayList<Domain>();
      for (final DomainBlock domainLang : listDomainLang) {
        {
          final Domain domainMetaModel = new Domain();
          String _name = domainLang.getName();
          domainMetaModel.setName(_name);
          EList<ModuleBlock> _module = domainLang.getModule();
          ArrayList<Module> _convertModule = this.convertModule(_module, domainMetaModel, tableObjects);
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
   * @return List<model.domainLayer.Module> Set de modulo de metamodelo
   */
  public ArrayList<Module> convertModule(final EList<ModuleBlock> listModulesLang, final Domain domainMetaModel, final TableObjects tableObjects) {
    ArrayList<Module> _xblockexpression = null;
    {
      final ArrayList<Module> setModulesMetaModule = new ArrayList<Module>();
      for (final ModuleBlock moduleLang : listModulesLang) {
        {
          Module moduleMetaModel = new Module();
          moduleMetaModel.setParent(domainMetaModel);
          String _name = moduleLang.getName();
          moduleMetaModel.setName(_name);
          EList<EnumBlock> _enumBlock = moduleLang.getEnumBlock();
          ArrayList<ClassEnum> _convert = this.enumConverter.convert(_enumBlock, tableObjects, moduleMetaModel);
          moduleMetaModel.setEnums(_convert);
          EList<EntityBlock> _entityBlock = moduleLang.getEntityBlock();
          ArrayList<Entity> _convert_1 = this.entityConverter.convert(_entityBlock, moduleMetaModel, tableObjects);
          moduleMetaModel.setEntities(_convert_1);
          EList<ServiceBlock> _serviceBlock = moduleLang.getServiceBlock();
          ArrayList<Service> _convert_2 = this.serviceConverter.convert(_serviceBlock, moduleMetaModel, tableObjects);
          moduleMetaModel.setServices(_convert_2);
          setModulesMetaModule.add(moduleMetaModel);
          List<Module> _modules = tableObjects.getModules();
          _modules.add(moduleMetaModel);
        }
      }
      _xblockexpression = setModulesMetaModule;
    }
    return _xblockexpression;
  }
  
  public DomainConverter(final Project projectLang, final br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel) {
    EntityConverter _entityConverter = new EntityConverter(projectLang, projectMetaModel);
    this.entityConverter = _entityConverter;
    EnumConverter _enumConverter = new EnumConverter(projectLang, projectMetaModel);
    this.enumConverter = _enumConverter;
    ServiceConverter _serviceConverter = new ServiceConverter(projectLang, projectMetaModel);
    this.serviceConverter = _serviceConverter;
    this.projectLang = projectLang;
    this.projectMetaModel = projectMetaModel;
  }
}
