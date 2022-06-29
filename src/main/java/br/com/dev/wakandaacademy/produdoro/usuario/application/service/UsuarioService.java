 package br.com.dev.wakandaacademy.produdoro.usuario.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dev.wakandaacademy.produdoro.credencial.application.service.CredencialApllicationService;
import br.com.dev.wakandaacademy.produdoro.pomodoro.application.service.PomodoroApllicationService;
import br.com.dev.wakandaacademy.produdoro.produdoro.domain.ConfiguracaoPadrao;
import br.com.dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import br.com.dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import br.com.dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;
import br.com.dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioService implements UsuarioApplicationService{

	private final PomodoroApllicationService pomodoroService;
	private final CredencialApllicationService credencialService;
	private final UsuarioRepository usuarioRepository;

	@Override
	public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
		log.info("[start] UsuarioService - criaNovoUsuario");
		var configuracaoPadrao = pomodoroService.getConfiguracaoPadrao();
		credencialService.criaNovaCredencial(usuarioNovo);
		var usuario = new Usuario(usuarioNovo, configuracaoPadrao);
		usuarioRepository.salva(usuario);
		log.info("[finish] UsuarioService - usuarioNovo");
		return new UsuarioCriadoResponse(usuario);
		
		
	}

}
