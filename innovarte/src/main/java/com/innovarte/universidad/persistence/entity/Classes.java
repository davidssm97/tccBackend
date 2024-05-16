package com.innovarte.universidad.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "CLASES")
public class Classes {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_CLASE")
    private Integer idClase;

    @Column(name = "ID_ASIGNATURA")
    private Integer idAsignatura;

    @Column(name = "ID_PROFESOR")
    private Integer idProfesor;

    @Column(name = "HORARIO")
    private String schedule;

    @ManyToOne
    @JoinColumn(name = "ID_PROFESOR", insertable = false, updatable = false)
    private Professor professor2;

    @ManyToOne
    @JoinColumn(name = "ID_ASIGNATURA", insertable = false, updatable = false)
    private Subject subject;

    @OneToMany(mappedBy = "classes")
    private List<Assignments> assignments;

    @OneToMany(mappedBy = "classes")
    private List<Enrollments> enrollments;

    public Integer getIdClase() {
        return idClase;
    }

    public void setIdClase(Integer idClase) {
        this.idClase = idClase;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }
}
