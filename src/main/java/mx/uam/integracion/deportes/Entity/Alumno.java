package mx.uam.integracion.deportes.Entity;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
public class Alumno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlumno;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100, unique = true)
    private String matricula;

    @Column(nullable = false)
    private Integer edad;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genero genero;

    @Column(nullable = false, length = 100)
    private String carrera;

    public enum Genero {
        Masculino, Femenino, Otro
    }
}
