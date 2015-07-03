package br.edu.sr.ifes.leds.LedsCode.factory;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DomainFactory {
  public static CharSequence completeDomain() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("domain Domain {");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _completeModule = DomainFactory.completeModule();
    _builder.append(_completeModule, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence completeModule() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("module Modulo {");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _completeService = DomainFactory.completeService();
    _builder.append(_completeService, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _completeEntity = DomainFactory.completeEntity();
    _builder.append(_completeEntity, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence completeService() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("service LibraryService {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//nome => entity.repositorio.metodo");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//nome => service.metodo");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//nome => module.service.metodo");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//nome => domain.module.service.metodo");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("findLibraryByName => Library.LibraryRepository.findLibraryByName");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("findMediaByName => Media.MediaRepository.findMediaByName");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("findMediaByCharacter => Media.MediaRepository.findMediaByCharacter");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("findPersonByName => PersonService.findPersonByName");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence completeEntity() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity LibraryEntity {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String name //key");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Set<PhysicalMedia> media");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("repository LibraryRepository {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("findLibraryByName(String name) : Library");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
