package com.innovarte.universidad.persistence.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PAGOS")
public class Payment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PAGO")
    private Integer idPayment;

    @Column(name = "ID_ESTUDIANTE")
    private Integer idStudent;

    @Column(name = "FECHA_PAGO")
    private Date paymentDate;

    @Column(name = "MONTO")
    private BigDecimal amount;

    @Column(name = "METODO_PAGO")
    private String paymentMethod;

    @Column(name = "ESTADO")
    private String Status;

    @ManyToOne
    @JoinColumn(name = "ID_ESTUDIANTE", insertable = false, updatable = false)
    private Student student;


    public Integer getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Integer idPayment) {
        this.idPayment = idPayment;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
