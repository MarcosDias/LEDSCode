package br.edu.sr.ifes.leds.LedsCode.factory

class ApplicationFactory {
	def static applicationBlock(){
'''
application LibraryPersonApp{
	composedBy Domain1.Module.*
	composedBy Domain2.*
}
'''
	}
}