package br.com.dev.wakandaacademy.produdoro.pomodoro.usuario.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.dev.wakandaacademy.produdoro.usuario.domain.Usuario;

public interface UsuarioMongoSpringRepository extends MongoRepository<Usuario, UUID>{
	
	
}
