package com.innovarte.universidad.persistence.mapper;

import com.innovarte.universidad.persistence.entity.Assignments;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ClassesMapper.class, StudentMapper.class})
public interface AssignementMapper {

    @Mappings({
            @Mapping(source = "assignmentId", target = "id"),
            @Mapping(source = "idProfesor", target = "professorId"),
            @Mapping(source = "idClase", target = "classesId"),
            @Mapping(source = "assignmentDate", target = "assignmentDate"),
    })
    Assignments toAssignments(Assignments asignaciones);

    @InheritInverseConfiguration
    Assignments toAsignaciones(Assignments asignaciones);
}