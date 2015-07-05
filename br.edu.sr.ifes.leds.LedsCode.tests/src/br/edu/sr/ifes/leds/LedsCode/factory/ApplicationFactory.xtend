package br.edu.sr.ifes.leds.LedsCode.factory

class ApplicationFactory {
	def static applicationBlock(){
'''
application LibraryPersonApp{
	composedBy Library.*
	composedBy Loan.*
}
application LibraryPersonApp2{
	composedBy Library.Person.*
}
'''
	}
}