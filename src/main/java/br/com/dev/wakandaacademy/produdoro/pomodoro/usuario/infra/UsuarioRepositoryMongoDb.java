package br.com.dev.wakandaacademy.produdoro.pomodoro.usuario.infra;

import org.springframework.stereotype.Repository;

import br.com.dev.wakandaacademy.produdoro.usuario.application.service.UsuarioRepository;
import br.com.dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryMongoDb implements UsuarioRepository {

	private UsuarioMongoSpringRepository usuarioMongoRepository;

	@Override
	public Usuario salva(Usuario usuario) {
		return usuarioMongoRepository.save(usuario);
	}

}
