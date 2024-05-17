package com.innovarte.universidad.persistence.mapper;

import com.innovarte.universidad.persistence.entity.Student;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    @Mappings({
            @Mapping(source = "idStudent", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "dateOfBirth", target = "dateOfBirth"),
            @Mapping(source = "email", target = "email")
    })
    Student toEstudiante(Student student);

    @InheritInverseConfiguration(name = "toEstudiante")
    @Mapping(target = "enrollments", ignore = true) // Ignoramos la propiedad "enrollments"
    Student toStudent(Student student);
}