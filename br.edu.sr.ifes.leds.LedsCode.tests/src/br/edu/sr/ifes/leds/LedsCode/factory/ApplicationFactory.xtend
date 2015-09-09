package br.edu.sr.ifes.leds.LedsCode.factory

class ApplicationFactory {
	def static applicationBlock(){
'''
application appSincap{
	composedBy domSincap.*
}
'''
	}
}