package co.edu.unisabana.notificarsuscriptor.Notificarsuscriptor.service;

import co.edu.unisabana.usuariopublicador.UsuarioPublicador.dto.CitaMedicaDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {
    @RabbitListener(queues = {"unisabana.cita.notificar"})
    public void receive(@Payload CitaMedicaDTO cita) {
        log.info("Se le notificará al paciente y al doctor que la cita ha sido registrada con la información proveniente de la cola [unisabana.cita.notificar] {}", "\n[Nombre del paciente]: " + cita.getNombre() + "\n[Nombre del doctor]: " + cita.getNombreOdontologo());
    }
}