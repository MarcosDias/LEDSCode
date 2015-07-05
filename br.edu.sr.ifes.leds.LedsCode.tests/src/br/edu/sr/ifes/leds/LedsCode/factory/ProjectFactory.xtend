package br.edu.sr.ifes.leds.LedsCode.factory

import static br.edu.sr.ifes.leds.LedsCode.factory.ApplicationFactory.applicationBlock
import static br.edu.sr.ifes.leds.LedsCode.factory.DomainFactory.domainBlock
import static br.edu.sr.ifes.leds.LedsCode.factory.InterfaceFactory.interfaceBlock
import static br.edu.sr.ifes.leds.LedsCode.factory.InfrastructureFactory.infrastructureBlock

class ProjectFactory {
	def static completeProject(){
'''
project Projeto{
	«infrastructureBlock()»
	«interfaceBlock()»
	«applicationBlock()»
	«domainBlock()»
}
'''
	}
}