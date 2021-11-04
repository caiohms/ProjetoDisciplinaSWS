package com.pucpr.projetoDisciplina.domain.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Seller implements Serializable {

    @Id
    private long id;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Product> productsList;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    private String contact;

    public Seller() {
    }

    public Seller(long id, String contact) {
        this.id = id;
        this.contact = contact;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
