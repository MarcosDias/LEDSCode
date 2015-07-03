package br.edu.sr.ifes.leds.LedsCode.factory;

import br.edu.sr.ifes.leds.LedsCode.factory.ApplicationFactory;
import br.edu.sr.ifes.leds.LedsCode.factory.DomainFactory;
import br.edu.sr.ifes.leds.LedsCode.factory.InfrastructureFactory;
import br.edu.sr.ifes.leds.LedsCode.factory.InterfaceFactory;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ProjectFactory {
  public static CharSequence completeProject() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("project Projeto{");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _completeInfrastructure = InfrastructureFactory.completeInfrastructure();
    _builder.append(_completeInfrastructure, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _completeInterface = InterfaceFactory.completeInterface();
    _builder.append(_completeInterface, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _completeDomain = DomainFactory.completeDomain();
    _builder.append(_completeDomain, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _completeApp = ApplicationFactory.completeApp();
    _builder.append(_completeApp, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
