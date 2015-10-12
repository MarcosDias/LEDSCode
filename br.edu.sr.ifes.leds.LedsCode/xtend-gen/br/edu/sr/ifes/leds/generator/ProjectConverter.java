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
import br.edu.sr.ifes.leds.model.applicationLayer.Application;
import br.edu.sr.ifes.leds.model.domainLayer.Domain;
import br.edu.sr.ifes.leds.model.infrastructureLayer.Infrastructure;
import br.edu.sr.ifes.leds.model.interfaceLayer.Interface;
import br.edu.sr.ifes.leds.model.mainLayer.TableObjects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ProjectConverter {
  public TableObjects convert(final Project projectLang) {
    TableObjects _xblockexpression = null;
    {
      TableObjects tableObjects = new TableObjects();
      br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel = new br.edu.sr.ifes.leds.model.mainLayer.Project();
      InfrastructureConverter infraConverter = new InfrastructureConverter(projectLang, projectMetaModel);
      InterfaceConverter ifaceConverter = new InterfaceConverter(projectLang, projectMetaModel);
      DomainConverter domainConverter = new DomainConverter(projectLang, projectMetaModel);
      AppConverter appConverter = new AppConverter(projectLang, projectMetaModel);
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
  
  public void convertInterface(final br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel, final InterfaceConverter ifaceConverter, final Project projectLang, final TableObjects tableObjects) {
    InterfaceBlock _interfaceBlock = projectLang.getInterfaceBlock();
    List<Application> _applications = projectMetaModel.getApplications();
    Interface _conveter = ifaceConverter.conveter(_interfaceBlock, _applications);
    projectMetaModel.setIface(_conveter);
    Interface _iface = projectMetaModel.getIface();
    tableObjects.setIface(_iface);
  }
  
  public void convertApplication(final br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel, final AppConverter appConverter, final Project projectLang, final TableObjects tableObjects) {
    EList<ApplicationBlock> _applicationBlock = projectLang.getApplicationBlock();
    List<Domain> _domains = projectMetaModel.getDomains();
    ArrayList<Application> _conveter = appConverter.conveter(_applicationBlock, _domains);
    projectMetaModel.setApplications(_conveter);
    List<Application> _applications = projectMetaModel.getApplications();
    tableObjects.setApps(_applications);
  }
  
  public void convertInfrastructure(final br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel, final InfrastructureConverter infraConverter, final Project projectLang, final TableObjects tableObjects) {
    InfrastructureBlock _infrastructureBlock = projectLang.getInfrastructureBlock();
    Infrastructure _convert = infraConverter.convert(_infrastructureBlock);
    projectMetaModel.setInfrastructure(_convert);
    Infrastructure _infrastructure = projectMetaModel.getInfrastructure();
    tableObjects.setInfrastructure(_infrastructure);
  }
  
  public void convertDomains(final br.edu.sr.ifes.leds.model.mainLayer.Project projectMetaModel, final DomainConverter domainConverter, final Project projectLang, final TableObjects tableObjects) {
    EList<DomainBlock> _domainBlock = projectLang.getDomainBlock();
    ArrayList<Domain> _converter = domainConverter.converter(_domainBlock, tableObjects);
    projectMetaModel.setDomains(_converter);
    List<Domain> _domains = projectMetaModel.getDomains();
    tableObjects.setDomains(_domains);
  }
}
