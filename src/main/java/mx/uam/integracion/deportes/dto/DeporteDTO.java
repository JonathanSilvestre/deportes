package mx.uam.integracion.deportes.dto;

import mx.uam.integracion.deportes.entity.Deporte.Categoria;

public class DeporteDTO {

    private Integer id_deporte;
    private String nombre_deporte;
    private Categoria categoria;
    private String ubicacion_entrenamiento;

    // Getters y setters

    public Integer getId_deporte() {
        return id_deporte;
    }

    public void setId_deporte(Integer id_deporte) {
        this.id_deporte = id_deporte;
    }

    public String getNombre_deporte() {
        return nombre_deporte;
    }

    public void setNombre_deporte(String nombre_deporte) {
        this.nombre_deporte = nombre_deporte;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getUbicacion_entrenamiento() {
        return ubicacion_entrenamiento;
    }

    public void setUbicacion_entrenamiento(String ubicacion_entrenamiento) {
        this.ubicacion_entrenamiento = ubicacion_entrenamiento;
    }
}