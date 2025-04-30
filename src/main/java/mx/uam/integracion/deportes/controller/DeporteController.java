package mx.uam.integracion.deportes.controller;

import mx.uam.integracion.deportes.dto.DeporteDTO;
import mx.uam.integracion.deportes.service.DeporteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class DeporteController {
    private final DeporteService deporteService;

    public DeporteController(DeporteService deporteService) {
        this.deporteService = deporteService;
    }

    @PostMapping("/deporte")
    public ResponseEntity<DeporteDTO> createDeporte(@RequestBody DeporteDTO deporteDTO) {
        DeporteDTO createdDeporte = deporteService.createDeporte(deporteDTO);
        return ResponseEntity.ok(createdDeporte);
    }

    @GetMapping("/deporte")
    public ResponseEntity<List<DeporteDTO>> getDeportes() {
        List<DeporteDTO> deportes = Arrays.asList(deporteService.getAllDeportes());
        return ResponseEntity.ok(deportes);
    }

    @PutMapping("/deporte/{id}")
    public ResponseEntity<DeporteDTO> updateDeporte(@PathVariable Integer id, @RequestBody DeporteDTO deporteDTO) {
        DeporteDTO updatedDeporte = deporteService.updateDeporte(id, deporteDTO);
        return ResponseEntity.ok(updatedDeporte);
    }

    @DeleteMapping("/deporte/{id}")
    public ResponseEntity<Void> deleteDeporte(@PathVariable Integer id) {
        deporteService.deleteDeporte(id);
        return ResponseEntity.noContent().build();
    }
}