package co.edu.unisabana.registrarsuscriptor.Registrarsuscriptor.service;

import co.edu.unisabana.usuariopublicador.UsuarioPublicador.dto.CitaMedicaDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {
    @RabbitListener(queues = {"unisabana.cita.registrar"})
    public void receive(@Payload CitaMedicaDTO cita) {
        log.info("Se registrará toda la información, proveniente de la cola [unisabana.cita.registrar], de la cita del paciente en la BD --> {}", "\nCita registrada para el paciente " + cita.getNombre() + " con cédula " + cita.getCc() + " y lo atenderá el doctor " + cita.getNombreOdontologo());
    }
}
