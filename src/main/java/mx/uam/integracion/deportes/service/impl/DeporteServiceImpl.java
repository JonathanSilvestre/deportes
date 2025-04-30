package mx.uam.integracion.deportes.service.impl;

import mx.uam.integracion.deportes.dto.DeporteDTO;
import mx.uam.integracion.deportes.entity.Deporte;
import mx.uam.integracion.deportes.repository.DeporteRepository;
import mx.uam.integracion.deportes.service.DeporteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeporteServiceImpl implements DeporteService {
    private final DeporteRepository deporteRepository;

    public DeporteServiceImpl(DeporteRepository deporteRepository) {
        this.deporteRepository = deporteRepository;
    }

    @Override
    public DeporteDTO createDeporte(DeporteDTO deporteDTO) {
        Deporte deporte = convertToEntity(deporteDTO);
        Deporte savedDeporte = deporteRepository.save(deporte);
        return convertToDTO(savedDeporte);
    }

    @Override
    public DeporteDTO[] getAllDeportes() {
        List<Deporte> deportes = deporteRepository.findAll();
        return deportes.stream()
                .map(this::convertToDTO)
                .toArray(DeporteDTO[]::new);
    }

    @Override
    public DeporteDTO updateDeporte(Integer id, DeporteDTO deporteDTO) {
        Optional<Deporte> optionalDeporte = deporteRepository.findById(id);
        if (optionalDeporte.isPresent()) {
            Deporte deporte = optionalDeporte.get();
            deporte.setNombreDeporte(deporteDTO.getNombre_deporte());
            deporte.setCategoria(deporteDTO.getCategoria());
            deporte.setUbicacionEntrenamiento(deporteDTO.getUbicacion_entrenamiento());

            Deporte updatedDeporte = deporteRepository.save(deporte);
            return convertToDTO(updatedDeporte);
        } else {
            throw new RuntimeException("No se encontró un deporte con el ID: " + id);
        }
    }

    @Override
    public void deleteDeporte(Integer id) {
        if (!deporteRepository.existsById(id)) {
            throw new RuntimeException("No se encontró un deporte con el ID: " + id);
        }
        deporteRepository.deleteById(id);
    }

    private DeporteDTO convertToDTO(Deporte deporte) {
        DeporteDTO dto = new DeporteDTO();
        dto.setId_deporte(deporte.getIdDeporte());
        dto.setNombre_deporte(deporte.getNombreDeporte());
        dto.setCategoria(deporte.getCategoria());
        dto.setUbicacion_entrenamiento(deporte.getUbicacionEntrenamiento());
        return dto;
    }

    private Deporte convertToEntity(DeporteDTO dto) {
        Deporte deporte = new Deporte();
        deporte.setIdDeporte(dto.getId_deporte());
        deporte.setNombreDeporte(dto.getNombre_deporte());
        deporte.setCategoria(dto.getCategoria());
        deporte.setUbicacionEntrenamiento(dto.getUbicacion_entrenamiento());
        return deporte;
    }
}