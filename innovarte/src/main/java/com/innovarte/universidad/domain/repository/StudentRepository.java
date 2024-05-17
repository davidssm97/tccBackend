package com.innovarte.universidad.domain.repository;

import com.innovarte.universidad.domain.Student;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    List<Student> getAllStudents();

    List<Student> getStudentsById(int idStudent);

    Optional<List<Student>> getStudentsByDateOfBirthAndEmail(Date dateOfBirth, String email);

    void deleteStudentById(int idStudent);

    void updateStudent(Student student);

    void addStudent(Student student);
}