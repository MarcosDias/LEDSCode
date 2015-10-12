package br.edu.sr.ifes.leds.model.infrastructureLayer;

/**
 * @author MarcosDias
 */
public class Infrastructure {
    private String basePackage;
    private String projectVersion;
    private DataBase dataBase;
    private Language language;
    private DatabaseFramework dbFramework;
    private LanguageFramework languageFramework;
    
	public String getBasePackage() {
		return basePackage;
	}
	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}
	public String getProjectVersion() {
		return projectVersion;
	}
	public void setProjectVersion(String projectVersion) {
		this.projectVersion = projectVersion;
	}
	public DataBase getDataBase() {
		return dataBase;
	}
	public void setDataBase(DataBase dataBase) {
		this.dataBase = dataBase;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public DatabaseFramework getDbFramework() {
		return dbFramework;
	}
	public void setDbFramework(DatabaseFramework dbFramework) {
		this.dbFramework = dbFramework;
	}
	public LanguageFramework getLanguageFramework() {
		return languageFramework;
	}
	public void setLanguageFramework(LanguageFramework languageFramework) {
		this.languageFramework = languageFramework;
	}
}
