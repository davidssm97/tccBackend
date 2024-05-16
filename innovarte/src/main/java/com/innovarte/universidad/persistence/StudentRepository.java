package com.innovarte.universidad.persistence;

import com.innovarte.universidad.persistence.crud.StudentCrudRepository;
import com.innovarte.universidad.persistence.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository {
    private final StudentCrudRepository studentCrudRepository;

    public StudentRepository(StudentCrudRepository studentCrudRepository) {
        this.studentCrudRepository = studentCrudRepository;
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentCrudRepository.findAll();
    }

    public List<Student> getStudentsById(int idStudent) {
        return studentCrudRepository.findByIdStudentOrderByNameAsc(idStudent);
    }

    public Optional<List<Student>> getStudentsByDateOfBirthAndEmail(Date dateOfBirth, String email) {
        return studentCrudRepository.findByDateOfBirthLessThanAndEmail(dateOfBirth, email);
    }

    public void deleteStudentById(int idStudent) {
        studentCrudRepository.deleteById(idStudent);
    }

    public void updateStudent(Student updatedStudent) {
        studentCrudRepository.save(updatedStudent);
    }

    public Student addStudent(Student newStudent) {
        return studentCrudRepository.save(newStudent);
    }
}