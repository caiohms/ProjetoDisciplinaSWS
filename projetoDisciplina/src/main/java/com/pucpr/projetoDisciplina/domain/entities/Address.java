package com.pucpr.projetoDisciplina.domain.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Address implements Serializable {

//    "seller_address":{
//        "city":{
//            "id":"TUxCQ1NFUmI1ZGQx",
//            "name":"Serra"
//        },
//        "state":{
//            "id":"BR-ES",
//            "name":"Espírito Santo"
//        },
//        "country":{
//            "id":"BR",
//            "name":"Brasil"
//        },
//        "id":1017932319
//    },


    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private Seller seller;
    @ManyToOne
    private City city;
    @ManyToOne
    private State state;
    @ManyToOne
    private Country country;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
