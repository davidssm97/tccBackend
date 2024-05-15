package com.innovarte.universidad.persistence;

import com.innovarte.universidad.persistence.crud.StudentCrudRepository;
import com.innovarte.universidad.persistence.entity.Student;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class StudentRepository {
    StudentCrudRepository studentCrudRepository;

    public List<Student> getAll() {
        return (List<Student>) studentCrudRepository.findAll();
    }

    public List<Student> getByIdStudent(int idStudent) {
        return studentCrudRepository.findByIdStudentOrderByNameAsc(idStudent);
    }

    public Optional<List<Student>> getEstudents(Date dateOfBirth, String email) {
        return studentCrudRepository.findByDateOfBirthLessThanAndEmail(dateOfBirth, email);
    }
}
