package com.example.tradeagent_java.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "place_of_contact")
public class PlaceOfContact {

    @Id
    @Column(name = "order_id")
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "order_id")
    private Order order;

    @NotNull
    @Size(min = 5, max = 6)
    private int zipcode;

    @NotNull
    private String address;

    @NotNull
    private String marketName;

    @NotNull
    private String contactFirstName;


    private String contactSecondName;

    private String comment;

    public PlaceOfContact() {
    }

    public Long getId() {
        return id;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactSecondName() {
        return contactSecondName;
    }

    public void setContactSecondName(String contactSecondName) {
        this.contactSecondName = contactSecondName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
