package mx.uam.integracion.deportes.DTO;

import lombok.Data;

@Data
public class AlumnoDTO {
    private Integer idAlumno;
    private String nombre;
    private String matricula;
    private Integer edad;
    private String genero;
    private String carrera;
}
