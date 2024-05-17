package com.innovarte.universidad.domain.service;

import com.innovarte.universidad.domain.Student;
import com.innovarte.universidad.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll(){

        return studentRepository.getAllStudents();
    }

    


}
