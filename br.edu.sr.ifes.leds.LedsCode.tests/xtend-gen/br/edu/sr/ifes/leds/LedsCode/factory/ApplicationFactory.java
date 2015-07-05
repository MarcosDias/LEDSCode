package br.edu.sr.ifes.leds.LedsCode.factory;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ApplicationFactory {
  public static CharSequence applicationBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("application LibraryPersonApp{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("composedBy Library.*");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("composedBy Loan.*");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("application LibraryPersonApp2{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("composedBy Library.Person.*");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
