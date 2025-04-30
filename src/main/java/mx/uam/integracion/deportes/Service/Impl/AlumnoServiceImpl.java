package mx.uam.integracion.deportes.Service.Impl;

import mx.uam.integracion.deportes.DTO.AlumnoDTO;
import mx.uam.integracion.deportes.Entity.Alumno;
import mx.uam.integracion.deportes.repository.AlumnoRepository;
import mx.uam.integracion.deportes.Service.AlumnoService;
import mx.uam.integracion.deportes.mapper.AlumnoMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    private final AlumnoRepository alumnoRepository;
    private final AlumnoMapper alumnoMapper = AlumnoMapper.INSTANCE;

    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public AlumnoDTO createAlumno(AlumnoDTO alumnoDTO) {
        Alumno alumno = alumnoMapper.toEntity(alumnoDTO);
        return alumnoMapper.toDTO(alumnoRepository.save(alumno));
    }

    @Override
    public AlumnoDTO getAlumnoById(Integer id) {
        Alumno alumno = alumnoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado"));
        return alumnoMapper.toDTO(alumno);
    }

    @Override
    public List<AlumnoDTO> getAllAlumnos() {
        return alumnoRepository.findAll().stream()
                .map(alumnoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AlumnoDTO updateAlumno(Integer id, AlumnoDTO alumnoDTO) {
        Alumno alumno = alumnoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado"));
        alumno.setNombre(alumnoDTO.getNombre());
        alumno.setMatricula(alumnoDTO.getMatricula());
        alumno.setEdad(alumnoDTO.getEdad());
        alumno.setGenero(Alumno.Genero.valueOf(alumnoDTO.getGenero()));
        alumno.setCarrera(alumnoDTO.getCarrera());
        return alumnoMapper.toDTO(alumnoRepository.save(alumno));
    }

    @Override
    public void deleteAlumno(Integer id) {
        alumnoRepository.deleteById(id);
    }
}
