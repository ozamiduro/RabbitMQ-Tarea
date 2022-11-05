package co.edu.unisabana.usuariopublicador.UsuarioPublicador.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class CitaMedicaDTO implements Serializable {

    private int cc;
    private String nombre;
    private int edad;
    private String fecha;
    private String telefono;
    private String motivoConsulta;
    private String numeroConsulta;
    private String nombreOdontologo;

    public CitaMedicaDTO(int cc, String nombre, int edad, String fecha, String telefono, String motivoConsulta, String numeroConsulta, String nombreOdontologo) {
        this.cc = cc;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.telefono = telefono;
        this.motivoConsulta = motivoConsulta;
        this.numeroConsulta = numeroConsulta;
        this.nombreOdontologo = nombreOdontologo;
    }
}
