package br.com.dev.wakandaacademy.produdoro.pomodoro.application.service;

import org.springframework.stereotype.Service;

import br.com.dev.wakandaacademy.produdoro.produdoro.domain.ConfiguracaoPadrao;

@Service
public class PomodoroService implements PomodoroApllicationService{

	@Override
	public ConfiguracaoPadrao getConfiguracaoPadrao() {
		return ConfiguracaoPadrao.builder()
				.tempoMinutosFoco(25)
				.tempoMinutosPausaCurta(5)
				.tempoMinutosPausaLonga(15)
				.repeticoesParaPausaLonga(3)
				.build();				
	}

}
