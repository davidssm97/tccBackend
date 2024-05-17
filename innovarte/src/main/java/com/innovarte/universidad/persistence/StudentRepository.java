package com.innovarte.universidad.persistence;

import com.innovarte.universidad.persistence.crud.StudentCrudRepository;
import com.innovarte.universidad.persistence.entity.Student;
import com.innovarte.universidad.persistence.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository implements StudentCrudRepository{
    @Autowired
    private final StudentCrudRepository studentCrudRepository;

    @Autowired
    private StudentMapper mapper;

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

    @Override
    public List<Student> findByIdStudentOrderByNameAsc(int idStudent) {
        return List.of();
    }

    @Override
    public Optional<List<Student>> findByDateOfBirthLessThanAndEmail(Date dateOfBirth, String email) {
        return Optional.empty();
    }

    @Override
    public <S extends Student> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Student> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Student> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Student> findAll() {
        return null;
    }

    @Override
    public Iterable<Student> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Student entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Student> entities) {

    }

    @Override
    public void deleteAll() {

    }
}