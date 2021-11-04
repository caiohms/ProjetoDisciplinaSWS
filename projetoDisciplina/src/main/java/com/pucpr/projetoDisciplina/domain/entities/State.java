package com.pucpr.projetoDisciplina.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class State implements Serializable {
//    "state":{
//        "id":"BR-ES",
//        "name":"Espírito Santo"
//    },

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
