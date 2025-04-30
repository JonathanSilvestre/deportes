package mx.uam.integracion.deportes.service;

import mx.uam.integracion.deportes.dto.DeporteDTO;

public interface DeporteService {
    DeporteDTO createDeporte(DeporteDTO deporteDTO);
    DeporteDTO[] getAllDeportes();
    DeporteDTO updateDeporte(Integer id, DeporteDTO deporteDTO);
    void deleteDeporte(Integer id);
}