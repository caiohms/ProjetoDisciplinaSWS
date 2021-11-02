package com.pucpr.projetoDisciplina.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Attribute implements Serializable {
//        {
//            "id":"BRAND",
//            "value_name":"Marca del producto"
//        },

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long dbid;

    @JsonProperty("id")
    private String type;

    private String value_name;

    public Long getDbid() {
        return dbid;
    }

    public void setDbid(Long dbid) {
        this.dbid = dbid;
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
