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
    private long db_id;

    private String id;

    private String value_name;

    @ManyToOne
    private Product product;
}
