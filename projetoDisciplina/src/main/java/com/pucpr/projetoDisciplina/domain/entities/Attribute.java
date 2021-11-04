package com.pucpr.projetoDisciplina.domain.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Attribute implements Serializable {
//        {
//            "id":"BRAND",
//            "value_name":"Marca del producto"
//        },

    @Id
    @GeneratedValue
    private long id;

    private String type;

    private String value_name;

    public Attribute(String value_name) {
        this.value_name = value_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue_name() {
        return value_name;
    }

    public void setValue_name(String value_name) {
        this.value_name = value_name;
    }
}
