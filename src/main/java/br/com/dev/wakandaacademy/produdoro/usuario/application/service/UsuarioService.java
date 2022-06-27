package br.com.dev.wakandaacademy.produdoro.usuario.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import br.com.dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import br.com.dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UsuarioService implements UsuarioApplicationService{

	@Override
	public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
		log.info("[start] UsuarioService - criaNovoUsuario");
		Usuario usuario = new Usuario(usuarioNovo);
		log.info("[finish] UsuarioService - usuarioNovo");
		
		return new UsuarioCriadoResponse(usuario);
	}

}
