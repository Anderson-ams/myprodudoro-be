package br.com.dev.wakandaacademy.produdoro.usuario.domain;

import java.util.UUID;

import javax.validation.constraints.Email;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection="Ususario")
@Getter

public class Usuario {

	@Id
	private UUID idUsuario;
	@Email
	@Indexed
	private String email;
	private ConfiguracaoUsuario configuracao;
	@Builder.Default
	private StatusUsuario status = StatusUsuario.FOCO;
	@Builder.Default
	private Integer quantidadePomodoroPausaCurta = 0;
	
	public Usuario(UsuarioNovoRequest usuarioNovo) {
		this.email = usuarioNovo.getEmail();
		this.configuracao = ConfiguracaoUsuario.builder()
				.tempoMinutosFoco(25)
				.tempoMinutosPausaCurta(5)
				.tempoMinutosPausaLonga(15)
				.repeticoesParaPausaLonga(3)
				.build();
	}
}
