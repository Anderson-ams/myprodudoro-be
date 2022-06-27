package br.com.dev.wakandaacademy.produdoro.usuario.application.api;

import br.com.dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;

public class ConfiguracaoUsuarioResponse {

	private final Integer tempoMinutosFoco;
	private final Integer tempoMinutosPausaCurta;
	private final Integer tempoMinutosPausaLonga;
	private final Integer repeticoesParaPausaLonga;
	
	public ConfiguracaoUsuarioResponse(ConfiguracaoUsuario configuracao) {
		
		this.tempoMinutosFoco = configuracao.getTempoMinutosFoco();
		this.tempoMinutosPausaCurta = configuracao.getTempoMinutosPausaCurta();
		this.tempoMinutosPausaLonga = configuracao.getTempoMinutosPausaLonga();
		this.repeticoesParaPausaLonga = configuracao.getRepeticoesParaPausaLonga();
	}
	
		
}
