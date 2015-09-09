package br.edu.sr.ifes.leds.LedsCode.factory

class InterfaceFactory {
	def static interfaceBlock(){
'''
interface ifaceSincap  {
	HtmlView interfaceWeb => appSincap
	RestFull interfaceRest => appSincap
}
'''
	}
}