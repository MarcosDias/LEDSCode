package br.edu.sr.ifes.leds.LedsCode.factory;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class InterfaceFactory {
  public static CharSequence interfaceBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("interface ifaceSincap  {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("HtmlView interfaceWeb => appSincap");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("RestFull interfaceRest => appSincap");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
