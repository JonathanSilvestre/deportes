package mx.uam.integracion.deportes.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import mx.uam.integracion.deportes.DTO.AlumnoDTO;
import mx.uam.integracion.deportes.Entity.Alumno;

@Mapper
public interface AlumnoMapper {
    AlumnoMapper INSTANCE = Mappers.getMapper(AlumnoMapper.class);

    AlumnoDTO toDTO(Alumno alumno);

    Alumno toEntity(AlumnoDTO alumnoDTO);
}
