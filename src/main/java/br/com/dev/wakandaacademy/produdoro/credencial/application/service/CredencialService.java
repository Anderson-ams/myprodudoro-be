package br.com.dev.wakandaacademy.produdoro.credencial.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;

@Service
public class CredencialService implements CredencialApllicationService {

	@Override
	public void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo) {

	}

}
