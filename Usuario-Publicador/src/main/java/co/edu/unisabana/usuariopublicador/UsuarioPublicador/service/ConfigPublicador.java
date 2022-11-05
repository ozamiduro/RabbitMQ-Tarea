package co.edu.unisabana.usuariopublicador.UsuarioPublicador.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Queue;

@Configuration
public class ConfigPublicador {

    @Bean
    public Queue queue() {
        return new Queue("unisabana.cita.notificar", true);
    }
}
