package mx.uam.integracion.deportes.Service;

import mx.uam.integracion.deportes.DTO.AlumnoDTO;
import java.util.List;

public interface AlumnoService {
    AlumnoDTO createAlumno(AlumnoDTO alumnoDTO);

    AlumnoDTO getAlumnoById(Integer id);

    List<AlumnoDTO> getAllAlumnos();

    AlumnoDTO updateAlumno(Integer id, AlumnoDTO alumnoDTO);

    void deleteAlumno(Integer id);
}
