package br.edu.sr.ifes.leds.LedsCode.factory

class InfrastructureFactory {
	def static infrastructureBlock(){
'''
infrastructure{
	basePackage = "org.company.exempla"
	projectVersion = "0.0.0"
	language = {@name: "Java", @version: "8"}
	framework = {@name: "SpringRoo", @version: "1.2"}
	orm = {@name: "Hibernate", @version: "3"}
	database = {@version: "5", @name: "Postgres", @user: "USER", @pass: "123456", @host: "localhost", @env:"prod"}
}
'''
	}
}