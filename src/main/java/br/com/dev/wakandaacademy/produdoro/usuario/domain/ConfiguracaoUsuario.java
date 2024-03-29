package br.com.dev.wakandaacademy.produdoro.usuario.domain;

import br.com.dev.wakandaacademy.produdoro.produdoro.domain.ConfiguracaoPadrao;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ConfiguracaoUsuario {

	private Integer tempoMinutosFoco;
	private Integer tempoMinutosPausaCurta;
	private Integer tempoMinutosPausaLonga;
	private Integer repeticoesParaPausaLonga;

	public ConfiguracaoUsuario(ConfiguracaoPadrao configuracaoPadrao) {
		this.tempoMinutosFoco = configuracaoPadrao.getTempoMinutosFoco();
		this.tempoMinutosPausaCurta = configuracaoPadrao.getTempoMinutosPausaCurta();
		this.tempoMinutosPausaLonga = configuracaoPadrao.getTempoMinutosPausaLonga();
		this.repeticoesParaPausaLonga = configuracaoPadrao.getRepeticoesParaPausaLonga();
	}
}
