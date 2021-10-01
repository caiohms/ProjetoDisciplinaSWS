package com.pucpr.projetoDisciplina.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
//        "country":{
//            "id":"BR",
//            "name":"Brasil"
//        },

    @Id
    private String id;

    private String name;
}
