package br.edu.sr.ifes.leds.LedsCode.factory

class DomainFactory {
	def static domainBlock(){
'''
domain domSincap {
	«moduleBlock()»
	«moduleBlock2()»
}
'''
	}
	
	def static moduleBlock(){
'''
module controleInterno {
	«serviceBlock()»
	«entityBlock()»

}
'''
	}
	
		def static moduleBlock2(){
'''
module controleNotificacao {
	«enumBlock()»
	«entityBlock2()»
}
'''
	}
	
	def static serviceBlock(){
'''
service aplProcessoNotificacao {
	FindByName => Funcionario.funcionarioRepository.findByName
	FindNotificadorProcessoNotificacao => controleNotificacao.ProcessoNotificacao.processoNotificacaoRepository.findByNotificadorName
}
'''
	}
	
	def static entityBlock(){
'''
abstract entity Pessoa{
	protected String nome
}

abstract entity Funcionario ext Pessoa{
  private String cpf @pk @between(15,15)
  private String telefone @max(11)
  private String email @unique(true) @null(true)
  private String endereco 
  private boolean status
  
  repository funcionarioRepository {
  	findByName(String name) : Funcionario
  }
}

entity AnalistaCNCDO ext Funcionario{}
entity Notificador ext Funcionario{}
entity Captador ext Funcionario{}

abstract entity Instituicao{
	protected String nome
	protected String endereco
	protected List<Funcionario> funcionarios
}

entity BancoOlhos ext Instituicao{}

abstract entity InstituicaoNotificadora ext Instituicao{
	private BancoOlhos bancoOlhos
}

entity Setor{
	private String nome
}

entity Hospital ext InstituicaoNotificadora {
	private String sigla
	private String cnes
	private Setor setor
}
'''
	}
	
	def static entityBlock2(){
'''
entity Paciente ext controleInterno.Pessoa{
	private String numeroProntuario
	private String nome
	private String numeroSUS
	private Datetime dataNascimento
	private String sexo
	private EstadoCivil estadoCivil
	private String nomeMae
	private String nacionalidade
	private String endereco
	private Datetime dataInternacao
	private Datetime horaInternacao
}

entity ResponsavelLegal ext controleInterno.Pessoa{
	private String nacionalidade
	private EstadoCivil estadoCivil
	private String profissao
	private GrauParentesco grauParentesco
}

entity Testemunha ext controleInterno.Pessoa{
	private String cpf
	private String endereco
}

entity Obito {
	private controleInterno.Hospital hospital
	private controleInterno.Setor setor
	private controleInterno.Notificador notificador
	private Paciente paciente
}

entity Entrevista {
	private boolean entrevistaRealizada
	private boolean doacaoAutorizado
	private Datetime dataRealizacao
	private Datetime horaRealizacao
	private List<Testemunha> testemunhas
	private List<ResponsavelLegal> responsavel
	private controleInterno.Funcionario notificador
}

entity Captacao {
	private boolean captacaoRealizada
	private Datetime dataRealizacao
	private controleInterno.Captador captador
}

entity CausaNaoDoacao {
	private String descricao
}

entity ProcessoNotificacao{
  private String codigo
  private Datetime dataCriacao
  private Datetime horaCriacao
  private Datetime dataFinalizacao
  private Datetime horaFinalizacao
  private controleInterno.Funcionario notificador
  private boolean arquivado
  private Obito obito
  private Entrevista entrevista
  private Captacao captacao
  private CausaNaoDoacao causa
  private AnalistaCNCDO analista
  
  repository processoNotificacaoRepository {
  	findByNotificadorName(String notificador) : Funcionario
  }
}
'''
	}
	
	def static enumBlock() {
'''
enum EstadoCivil {
	Casado, Solteiro, Viuvo
}

enum GrauParentesco {
	Irmao, Pai, Mae, Avos
}
'''
	}
}