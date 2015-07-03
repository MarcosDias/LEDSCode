package br.edu.sr.ifes.leds.LedsCode.factory

class ApplicationFactory {
	def static completeApp(){
'''
application LibraryPersonApp{
    // Tem acesso apenas aos elemento do modulo person
	composedBy Library.Person.*
}
'''
	}
}