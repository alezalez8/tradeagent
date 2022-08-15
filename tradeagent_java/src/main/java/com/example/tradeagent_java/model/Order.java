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
    private long id;

    @Transient
   // @Column(name = "agent")
    private Agent agent;

    @Transient
   // @Column(name = "place_of_contact")
    private PlaceOfContact placeOfContact;

    @Column(name = "total_sum")
    private double totalSum;

    @Column(name = "payd")
    private double payd;

    @Transient
   // @Column(name = "payment_info")
    private PaymentInfo paymentInfo;

    @Column(name = "date_creation")
    @Timestamp
    private Date dateOfCreation = new Date();

   // List<Product> productList = new ArrayList<>();

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public PlaceOfContact getPlaceOfContact() {
        return placeOfContact;
    }

    public void setPlaceOfContact(PlaceOfContact placeOfContact) {
        this.placeOfContact = placeOfContact;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    public double getPayd() {
        return payd;
    }

    public void setPayd(double payd) {
        this.payd = payd;
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

   /* public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }*/
}
