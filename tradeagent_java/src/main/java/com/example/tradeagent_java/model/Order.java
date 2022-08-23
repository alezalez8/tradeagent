package com.example.tradeagent_java.model;


import jdk.jfr.Timestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;


//-------------------------------------------

    @Transient
   // @Column(name = "place_of_contact")
    private PlaceOfContact placeOfContact;
//------------------------------------------------
    @Column(name = "total_sum")
    private double totalSum;

    @Column(name = "paid")
    private double paid;

    @Column(name = "rest")
    private double restFromTotalSum;


    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private PaymentInfo paymentInfo;

    @Column(name = "date_creation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfCreation = new Date();

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

   @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
   private  List<Product> productList = new ArrayList<>();

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.example.tradeagent_java.model.PlaceOfContact getPlaceOfContact() {
        return placeOfContact;
    }

    public void setPlaceOfContact(com.example.tradeagent_java.model.PlaceOfContact placeOfContact) {
        this.placeOfContact = placeOfContact;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getRestFromTotalSum() {
        return restFromTotalSum;
    }

    public void setRestFromTotalSum(double restFromTotalSum) {
        this.restFromTotalSum = restFromTotalSum;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
