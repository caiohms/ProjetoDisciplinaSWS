package com.pucpr.projetoDisciplina.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class City implements Serializable {
//    "city":{
//        "id":"TUxCQ1NFUmI1ZGQx",
//        "name":"Serra"
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
