package br.edu.sr.ifes.leds.transformador.springroo.model;

import com.google.common.base.Objects;
import model.infrastructureLayer.Infrastructure;
import model.mainLayer.Project;

@SuppressWarnings("all")
public class SpringRoo {
  private String scriptProject;
  
  public String criarProjeto(final Project project) {
    String _xblockexpression = null;
    {
      String _scriptProject = this.scriptProject;
      this.scriptProject = (_scriptProject + "// CRIANDO O NOVO PROJETO\n");
      String _scriptProject_1 = this.scriptProject;
      String _configpath = this.configpath(project);
      String _plus = ("project --topLevelPackage " + _configpath);
      String _name = project.getName();
      String _plus_1 = (_plus + _name);
      String _plus_2 = (_plus_1 + 
        "\n\n");
      _xblockexpression = this.scriptProject = (_scriptProject_1 + _plus_2);
    }
    return _xblockexpression;
  }
  
  private String configpath(final Project project) {
    Infrastructure _infrastructure = project.getInfrastructure();
    String _basePackage = _infrastructure.getBasePackage();
    boolean _notEquals = (!Objects.equal(_basePackage, null));
    if (_notEquals) {
      return "";
    }
    Infrastructure _infrastructure_1 = project.getInfrastructure();
    return _infrastructure_1.getBasePackage();
  }
  
  public Object configDomain(final Project project) {
    return null;
  }
  
  public Object configInfra(final Infrastructure infrastructure) {
    return null;
  }
  
  public Object quit() {
    return null;
  }
  
  public String getScriptProject() {
    return this.scriptProject;
  }
}
