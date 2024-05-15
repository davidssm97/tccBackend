package com.innovarte.universidad.persistence.entity;

import jakarta.persistence.*;
import jdk.jfr.Category;

import java.util.List;

@Entity
@Table(name = "ASIGNATURAS")
public class Subject {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ASIGNATURA")
    private Integer idAsignatura;

    @Column(name = "NOMBRE")
    private String name;

    @Column(name = "DESCRIPCION")
    private String description;

    @Column(name = "ID_CURSO")
    private Integer idCurso;

    @ManyToOne
    @JoinColumn(name = "ID_CURSO", insertable = false, updatable = false)
    private Course course;

    @OneToMany(mappedBy = "subject")
    private List<Classes> classes;

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
