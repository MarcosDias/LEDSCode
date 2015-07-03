package br.edu.sr.ifes.leds.LedsCode.factory

import static br.edu.sr.ifes.leds.LedsCode.factory.DomainFactory.completeDomain
import static br.edu.sr.ifes.leds.LedsCode.factory.ApplicationFactory.completeApp
import static br.edu.sr.ifes.leds.LedsCode.factory.InfrastructureFactory.completeInfrastructure
import static br.edu.sr.ifes.leds.LedsCode.factory.InterfaceFactory.completeInterface

class ProjectFactory {
	def static completeProject(){
'''
project Projeto{
	«completeInfrastructure()»
	«completeInterface()»
	«completeDomain()»
	«completeApp()»
}
'''
	}
}