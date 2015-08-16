package br.edu.sr.ifes.leds.transformador.springroo.ctrl;

import br.edu.sr.ifes.leds.transformador.springroo.model.SpringRoo;
import model.mainLayer.Project;

@SuppressWarnings("all")
public class SpringRooController {
  private final String name = "SpringRoo";
  
  private SpringRoo roo;
  
  public String createProject(final Project project) {
    String _xblockexpression = null;
    {
      SpringRoo _springRoo = new SpringRoo();
      this.roo = _springRoo;
      this.roo.criarProjeto(project);
      this.roo.configDomain(project);
      this.roo.quit();
      _xblockexpression = this.roo.getScriptProject();
    }
    return _xblockexpression;
  }
  
  public String getName() {
    return this.name;
  }
}
