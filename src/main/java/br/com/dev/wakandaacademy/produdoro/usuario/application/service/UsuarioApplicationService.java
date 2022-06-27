package br.com.dev.wakandaacademy.produdoro.usuario.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import br.com.dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import lombok.extern.log4j.Log4j2;


public interface UsuarioApplicationService {

	UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo);
	
}
