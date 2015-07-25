package br.edu.sr.ifes.leds.generator;

import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.metamodel.DomainConverter;
import br.edu.sr.ifes.leds.metamodel.InfrastructureConverter;
import br.edu.sr.ifes.leds.metamodel.InterfaceConverter;
import java.util.Calendar;
import java.util.LinkedHashSet;
import model.domainLayer.Domain;
import model.infrastructureLayer.Infrastructure;
import model.interfaceLayer.Interface;
import model.mainLayer.Project;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ProjectConverter {
  private Project projectMetaModel;
  
  private InfrastructureConverter infraConverter;
  
  private InterfaceConverter ifaceConverter;
  
  private DomainConverter domainConverter;
  
  public Project convert(final br.edu.sr.ifes.leds.ledsCodeV001.Project projectLang) {
    Project _xblockexpression = null;
    {
      String _name = projectLang.getName();
      this.projectMetaModel.setName(_name);
      Calendar _instance = Calendar.getInstance();
      this.projectMetaModel.setCreated(_instance);
      EList<DomainBlock> _domainBlock = projectLang.getDomainBlock();
      LinkedHashSet<Domain> _converter = this.domainConverter.converter(_domainBlock);
      this.projectMetaModel.setDomains(_converter);
      InfrastructureBlock _infrastructureBlock = projectLang.getInfrastructureBlock();
      Infrastructure _convert = this.infraConverter.convert(_infrastructureBlock);
      this.projectMetaModel.setInfrastructure(_convert);
      InterfaceBlock _interfaceBlock = projectLang.getInterfaceBlock();
      Interface _conveter = this.ifaceConverter.conveter(_interfaceBlock);
      this.projectMetaModel.setIface(_conveter);
      _xblockexpression = this.projectMetaModel;
    }
    return _xblockexpression;
  }
  
  public ProjectConverter() {
    Project _project = new Project();
    this.projectMetaModel = _project;
    InfrastructureConverter _infrastructureConverter = new InfrastructureConverter();
    this.infraConverter = _infrastructureConverter;
    InterfaceConverter _interfaceConverter = new InterfaceConverter();
    this.ifaceConverter = _interfaceConverter;
    DomainConverter _domainConverter = new DomainConverter();
    this.domainConverter = _domainConverter;
  }
}
