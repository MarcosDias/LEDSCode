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
    CharSequence _infrastructureBlock = InfrastructureFactory.infrastructureBlock();
    _builder.append(_infrastructureBlock, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _interfaceBlock = InterfaceFactory.interfaceBlock();
    _builder.append(_interfaceBlock, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _applicationBlock = ApplicationFactory.applicationBlock();
    _builder.append(_applicationBlock, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _domainBlock = DomainFactory.domainBlock();
    _builder.append(_domainBlock, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
