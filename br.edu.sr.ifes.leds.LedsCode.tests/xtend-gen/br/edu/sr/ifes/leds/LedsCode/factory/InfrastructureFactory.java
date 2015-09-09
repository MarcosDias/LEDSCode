package br.edu.sr.ifes.leds.LedsCode.factory;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class InfrastructureFactory {
  public static CharSequence infrastructureBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("infrastructure{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("basePackage = \"br.edu.ifes.sr.leds\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("projectVersion = \"0.0.0\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("language = {@name: \"Java\", @version: \"8\"}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("framework = {@name: \"SpringRoo\", @version: \"1.2\"}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("orm = {@name: \"Hibernate\", @version: \"3\"}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("database = {@version: \"5\", @name: \"Postgres\", @user: \"USER\", @pass: \"123456\", @host: \"localhost\", @env: \"prod\"}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
