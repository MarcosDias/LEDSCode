package br.edu.sr.ifes.leds.LedsCode.factory;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ApplicationFactory {
  public static CharSequence applicationBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("application appSincap{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("composedBy domSincap.*");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
