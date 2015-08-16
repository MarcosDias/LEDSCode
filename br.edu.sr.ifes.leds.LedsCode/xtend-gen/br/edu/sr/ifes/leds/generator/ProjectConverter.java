package br.edu.sr.ifes.leds.generator;

import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
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
import model.mainLayer.Project;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ProjectConverter {
  public Project convert(final br.edu.sr.ifes.leds.ledsCodeV001.Project projectLang) {
    Project _xblockexpression = null;
    {
      Project projectMetaModel = new Project();
      InfrastructureConverter infraConverter = new InfrastructureConverter();
      InterfaceConverter ifaceConverter = new InterfaceConverter();
      DomainConverter domainConverter = new DomainConverter();
      AppConverter appConverter = new AppConverter();
      String _name = projectLang.getName();
      projectMetaModel.setName(_name);
      Calendar _instance = Calendar.getInstance();
      projectMetaModel.setCreated(_instance);
      EList<DomainBlock> _domainBlock = projectLang.getDomainBlock();
      LinkedHashSet<Domain> _converter = domainConverter.converter(_domainBlock);
      projectMetaModel.setDomains(_converter);
      InfrastructureBlock _infrastructureBlock = projectLang.getInfrastructureBlock();
      Infrastructure _convert = infraConverter.convert(_infrastructureBlock);
      projectMetaModel.setInfrastructure(_convert);
      EList<ApplicationBlock> _applicationBlock = projectLang.getApplicationBlock();
      LinkedHashSet<Domain> _domains = projectMetaModel.getDomains();
      LinkedHashSet<Application> _conveter = appConverter.conveter(_applicationBlock, _domains);
      projectMetaModel.setApplications(_conveter);
      InterfaceBlock _interfaceBlock = projectLang.getInterfaceBlock();
      LinkedHashSet<Application> _applications = projectMetaModel.getApplications();
      Interface _conveter_1 = ifaceConverter.conveter(_interfaceBlock, _applications);
      projectMetaModel.setIface(_conveter_1);
      _xblockexpression = projectMetaModel;
    }
    return _xblockexpression;
  }
}
