package br.edu.sr.ifes.leds.LedsCode.factory

class InterfaceFactory {
	def static completeInterface(){
'''
interface InterfaceLibrary  {
	//Cria as telas da aplicação Library
	HtmlView Interface1 => Domain

	//Criar um webservice do application Library
	RestFull Interface2 => Domain
}
'''
	}
}