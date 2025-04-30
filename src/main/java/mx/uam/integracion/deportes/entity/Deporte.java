package mx.uam.integracion.deportes.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "deportes")
public class Deporte {

    public enum Categoria {
        futbol, baloncesto, natacion, tennis, boleibol
    }

    @Id
    @Column(name = "id_deporte")
    private Integer idDeporte;

    @Column(name = "nombre_deporte")
    private String nombreDeporte;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria")
    private Categoria categoria;

    @Column(name = "ubicacion_entrenamiento")
    private String ubicacionEntrenamiento;

    // Getters y setters

    public Integer getIdDeporte() {
        return idDeporte;
    }

    public void setIdDeporte(Integer idDeporte) {
        this.idDeporte = idDeporte;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getUbicacionEntrenamiento() {
        return ubicacionEntrenamiento;
    }

    public void setUbicacionEntrenamiento(String ubicacionEntrenamiento) {
        this.ubicacionEntrenamiento = ubicacionEntrenamiento;
    }
}