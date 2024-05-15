package com.innovarte.universidad.persistence.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "PROFESORES")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PROFESOR")
    private Integer idProfesor;

    @Column(name = "NOMBRE")
    private String name;

    @Column(name = "ESPECIALIDAD")
    private String specialty;

    @Column(name = "EMAIL")
    private String email;

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
