package br.com.dev.wakandaacademy.produdoro.projeto.domain;

import java.util.UUID;

import org.springframework.data.mongodb.core.index.Indexed;

public class Projeto {
	
	private UUID idProjeto;
	private String nome;
	private String descricao;
	@Indexed
	private UUID idUsuario; 
	@Indexed
	private UUID idArea;

}
