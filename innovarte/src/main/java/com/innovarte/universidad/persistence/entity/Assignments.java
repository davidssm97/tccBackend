package com.innovarte.universidad.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ASIGNACIONES")
public class Assignments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ASIGNACION")
    private Integer assignmentId;

    @Column(name = "ID_PROFESOR")
    private Integer idProfesor;

    @Column(name = "ID_CLASE")
    private Integer idClase;

    @Column(name = "FECHA_ASIGNACION")
    private Date assignmentDate;

    @ManyToOne
    @JoinColumn(name = "ID_PROFESOR", insertable = false, updatable = false)
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "ID_CLASE", insertable = false,updatable = false)
    private Classes clases2;

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Date getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(Date assignmentDate) {
        this.assignmentDate = assignmentDate;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Integer getIdClase() {
        return idClase;
    }

    public void setIdClase(Integer idClase) {
        this.idClase = idClase;
    }
}
