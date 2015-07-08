package br.edu.sr.ifes.leds.LedsCode.factory

class InterfaceFactory {
	def static interfaceBlock(){
'''
interface InterfaceLibrary  {
	//Cria as telas da aplicação Library
	HtmlView Interface1 => AppDomain

	//Criar um webservice do application Library
	RestFull Interface2 => AppDomain
}
'''
	}
}