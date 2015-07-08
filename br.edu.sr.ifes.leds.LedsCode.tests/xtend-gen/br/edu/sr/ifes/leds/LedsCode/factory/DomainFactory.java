package br.edu.sr.ifes.leds.LedsCode.factory;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DomainFactory {
  public static CharSequence domainBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("domain Domain1 {");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _moduleBlock = DomainFactory.moduleBlock();
    _builder.append(_moduleBlock, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("domain Domain2 {");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _moduleBlock_1 = DomainFactory.moduleBlock();
    _builder.append(_moduleBlock_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence moduleBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("module Module {");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _serviceBlock = DomainFactory.serviceBlock();
    _builder.append(_serviceBlock, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _entityBlock = DomainFactory.entityBlock();
    _builder.append(_entityBlock, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _enumBlock = DomainFactory.enumBlock();
    _builder.append(_enumBlock, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence serviceBlock() {
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
    _builder.newLine();
    _builder.append("service PersonService {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("findPersonByName => PersonRepository.findPersonByName");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence entityBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("abstract entity Media : SuperClass1, SuperClass2 {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String titleb");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("- Set<PhysicalMedia> physicalMedia");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("repository MediaRepository {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("findMediaByCharacter(String characterName) : List<Media>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("findMediaByName(Long libraryId, String name) : List<Media>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("entity LibraryEntity : Media{");
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
  
  public static CharSequence enumBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("enum Gender {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FEMALE,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("MALE");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("enum Gen {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FEM,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("MA");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
