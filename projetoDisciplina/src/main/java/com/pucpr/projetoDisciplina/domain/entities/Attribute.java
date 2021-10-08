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

}
