package br.edu.sr.ifes.leds.LedsCode.factory;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ApplicationFactory {
  public static CharSequence completeApp() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("application LibraryPersonApp{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// Tem acesso apenas aos elemento do modulo person");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("composedBy Library.Person.*");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
