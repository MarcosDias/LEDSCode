package br.edu.sr.ifes.leds.generator;

import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.metamodel.AppConverter;
import br.edu.sr.ifes.leds.metamodel.DomainConverter;
import br.edu.sr.ifes.leds.metamodel.InfrastructureConverter;
import br.edu.sr.ifes.leds.metamodel.InterfaceConverter;
import java.util.Calendar;
import java.util.LinkedHashSet;
import model.applicationLayer.Application;
import model.domainLayer.Domain;
import model.infrastructureLayer.Infrastructure;
import model.interfaceLayer.Interface;
import model.mainLayer.TableObjects;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ProjectConverter {
  public TableObjects convert(final Project projectLang) {
    TableObjects _xblockexpression = null;
    {
      TableObjects tableObjects = new TableObjects();
      model.mainLayer.Project projectMetaModel = new model.mainLayer.Project();
      InfrastructureConverter infraConverter = new InfrastructureConverter();
      InterfaceConverter ifaceConverter = new InterfaceConverter();
      DomainConverter domainConverter = new DomainConverter();
      AppConverter appConverter = new AppConverter();
      String _name = projectLang.getName();
      projectMetaModel.setName(_name);
      Calendar _instance = Calendar.getInstance();
      projectMetaModel.setCreated(_instance);
      this.convertDomains(projectMetaModel, domainConverter, projectLang, tableObjects);
      this.convertInfrastructure(projectMetaModel, infraConverter, projectLang, tableObjects);
      this.convertApplication(projectMetaModel, appConverter, projectLang, tableObjects);
      this.convertInterface(projectMetaModel, ifaceConverter, projectLang, tableObjects);
      tableObjects.setProject(projectMetaModel);
      _xblockexpression = tableObjects;
    }
    return _xblockexpression;
  }
  
  public void convertInterface(final model.mainLayer.Project projectMetaModel, final InterfaceConverter ifaceConverter, final Project projectLang, final TableObjects tableObjects) {
    InterfaceBlock _interfaceBlock = projectLang.getInterfaceBlock();
    LinkedHashSet<Application> _applications = projectMetaModel.getApplications();
    Interface _conveter = ifaceConverter.conveter(_interfaceBlock, _applications);
    projectMetaModel.setIface(_conveter);
    Interface _iface = projectMetaModel.getIface();
    tableObjects.setIface(_iface);
  }
  
  public void convertApplication(final model.mainLayer.Project projectMetaModel, final AppConverter appConverter, final Project projectLang, final TableObjects tableObjects) {
    EList<ApplicationBlock> _applicationBlock = projectLang.getApplicationBlock();
    LinkedHashSet<Domain> _domains = projectMetaModel.getDomains();
    LinkedHashSet<Application> _conveter = appConverter.conveter(_applicationBlock, _domains);
    projectMetaModel.setApplications(_conveter);
    LinkedHashSet<Application> _applications = projectMetaModel.getApplications();
    tableObjects.setApps(_applications);
  }
  
  public void convertInfrastructure(final model.mainLayer.Project projectMetaModel, final InfrastructureConverter infraConverter, final Project projectLang, final TableObjects tableObjects) {
    InfrastructureBlock _infrastructureBlock = projectLang.getInfrastructureBlock();
    Infrastructure _convert = infraConverter.convert(_infrastructureBlock);
    projectMetaModel.setInfrastructure(_convert);
    Infrastructure _infrastructure = projectMetaModel.getInfrastructure();
    tableObjects.setInfrastructure(_infrastructure);
  }
  
  public void convertDomains(final model.mainLayer.Project projectMetaModel, final DomainConverter domainConverter, final Project projectLang, final TableObjects tableObjects) {
    EList<DomainBlock> _domainBlock = projectLang.getDomainBlock();
    LinkedHashSet<Domain> _converter = domainConverter.converter(_domainBlock, tableObjects);
    projectMetaModel.setDomains(_converter);
    LinkedHashSet<Domain> _domains = projectMetaModel.getDomains();
    tableObjects.setDomains(_domains);
  }
}
