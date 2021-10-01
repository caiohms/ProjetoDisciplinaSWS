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
}
