package br.edu.sr.ifes.leds.LedsCode.factory;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ApplicationFactory {
  public static CharSequence applicationBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("application LibraryPersonApp{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("composedBy Domain1.Module.*");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("composedBy Domain2.*");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
