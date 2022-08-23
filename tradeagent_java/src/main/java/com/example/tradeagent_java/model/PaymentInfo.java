package com.example.tradeagent_java.model;

import jdk.jfr.Timestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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

    @OneToOne()
    @MapsId
    @JoinColumn(name = "order_id")
    private Order order;





}
