package com.innovarte.universidad.persistence.crud;

import com.innovarte.universidad.persistence.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface StudentCrudRepository extends CrudRepository<Student, Integer> {

    List<Student> findByIdStudentOrderByNameAsc(int idStudent);

    Optional<List<Student>> findByDateOfBirthLessThanAndEmail(Date dateOfBirth, String email);

}


