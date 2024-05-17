package com.innovarte.universidad.persistence.mapper;

import com.innovarte.universidad.persistence.entity.Classes;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ClassesMapper {

    @Mappings({
            @Mapping(source = "idClase", target = "idClase"),
            @Mapping(source = "assignmentId", target = "idAsignatura"),
            @Mapping(source = "idProfesor", target = "idProfesor"),
            @Mapping(source = "schedule", target = "schedule")
    })
    Classes toClasses(Classes clases);

    @InheritInverseConfiguration(name = "toClasses")
    @Mapping(target = "professor2", ignore = true)
    @Mapping(target = "subject", ignore = true)
    @Mapping(target = "assignments", ignore = true)
    @Mapping(target = "enrollments", ignore = true)
    Classes toClases(Classes clases);
}