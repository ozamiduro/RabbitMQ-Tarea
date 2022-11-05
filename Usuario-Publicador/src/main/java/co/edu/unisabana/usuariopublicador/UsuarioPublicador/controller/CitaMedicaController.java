package co.edu.unisabana.usuariopublicador.UsuarioPublicador.controller;

import co.edu.unisabana.usuariopublicador.UsuarioPublicador.dto.CitaMedicaDTO;
import co.edu.unisabana.usuariopublicador.UsuarioPublicador.service.Publicador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CitaMedicaController {

    @Autowired
    private Publicador publicador;

    public CitaMedicaController(Publicador publicador) {
        this.publicador = publicador;
    }

    @PostMapping("/send")
    public String registrar(@RequestBody CitaMedicaDTO cita) {
        publicador.enviarMensajeFanOut(cita);
        return "La información de su cita ha sido enviado para el registro señor/señora " + cita.getNombre() + "\nEl odontólogo que lo atenderá es  " + cita.getNombreOdontologo();
    }
}
