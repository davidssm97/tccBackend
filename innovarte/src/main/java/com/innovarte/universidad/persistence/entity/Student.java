package com.innovarte.universidad.persistence.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "ESTUDIANTES")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTUDIANTE")
    private Integer idStudent;

    @Column(name = "NOMBRE")
    private String name;

    @Column(name = "FECHA_NACIMIENTO")
    private Date dateOfBirth;

    @Column(name = "EMAIL")
    private String email;


    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
