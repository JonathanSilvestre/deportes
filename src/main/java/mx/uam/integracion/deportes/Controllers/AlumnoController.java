package mx.uam.integracion.deportes.Controllers;

import mx.uam.integracion.deportes.DTO.AlumnoDTO;
import mx.uam.integracion.deportes.Service.AlumnoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @PostMapping
    public ResponseEntity<AlumnoDTO> createAlumno(@RequestBody AlumnoDTO alumnoDTO) {
        return ResponseEntity.ok(alumnoService.createAlumno(alumnoDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlumnoDTO> getAlumnoById(@PathVariable Integer id) {
        return ResponseEntity.ok(alumnoService.getAlumnoById(id));
    }

    @GetMapping
    public ResponseEntity<List<AlumnoDTO>> getAllAlumnos() {
        return ResponseEntity.ok(alumnoService.getAllAlumnos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlumnoDTO> updateAlumno(@PathVariable Integer id, @RequestBody AlumnoDTO alumnoDTO) {
        return ResponseEntity.ok(alumnoService.updateAlumno(id, alumnoDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlumno(@PathVariable Integer id) {
        alumnoService.deleteAlumno(id);
        return ResponseEntity.noContent().build();
    }
}