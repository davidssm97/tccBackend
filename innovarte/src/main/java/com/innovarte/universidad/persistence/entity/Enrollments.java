package com.innovarte.universidad.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "INSCRIPCIONES")
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_INSCRIPCION")
    private Integer enrollmentId;

    @Column(name = "ID_ESTUDIANTE")
    private Integer studentId;

    @Column(name = "ID_CLASE")
    private Integer classID;

    @Column(name = "FECHA_INSCRIPCION")
    private Date enrollmentDate;

    @ManyToOne
    @JoinColumn(name = "ID_ESTUDIANTE", referencedColumnName = "ID_ESTUDIANTE", insertable = false, updatable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "ID_CLASE", referencedColumnName = "ID_CLASE", insertable = false, updatable = false)
    private Classes classes;



    public Integer getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Integer enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
