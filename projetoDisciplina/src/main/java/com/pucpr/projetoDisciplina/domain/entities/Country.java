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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
