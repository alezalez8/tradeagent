package com.example.tradeagent_java.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payment_info")
public class PaymentInfo {

    @Id
    private Long id;


    @Column(name = "next_payment")
    private double nextPayment;

    @Column(name = "date_of_payment")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfPayment;

    @Column(name = "comment")
    private String comment;

    @OneToOne()
    @MapsId
    @JoinColumn(name = "order_id")
    private Order order;

    public PaymentInfo() {
    }

    public PaymentInfo(double nextPayment, Date dateOfPayment) {
        this.nextPayment = nextPayment;
        this.dateOfPayment = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getNextPayment() {
        return nextPayment;
    }

    public void setNextPayment(double nextPayment) {
        this.nextPayment = nextPayment;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
