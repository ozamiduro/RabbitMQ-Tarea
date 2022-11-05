package co.edu.unisabana.usuariopublicador.UsuarioPublicador.service;

import co.edu.unisabana.usuariopublicador.UsuarioPublicador.dto.CitaMedicaDTO;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@EnableRabbit
@Service
public class Publicador {

    private RabbitTemplate rabbitTemplate;
    private Queue queue;

    public Publicador(RabbitTemplate rabbitTemplate, Queue queue) {
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }

    public void enviarMensajeFanOut(Object cita) {
        rabbitTemplate.convertAndSend("unisabana.cita.fanout", null, cita);
    }
}
