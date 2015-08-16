package br.edu.sr.ifes.leds.LedsCode.factory;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class InterfaceFactory {
  public static CharSequence interfaceBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("interface InterfaceLibrary  {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Cria as telas da aplicação Library");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("HtmlView Interface1 => LibraryPersonApp");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Criar um webservice do application Library");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("RestFull Interface2 => LibraryPersonApp2");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
