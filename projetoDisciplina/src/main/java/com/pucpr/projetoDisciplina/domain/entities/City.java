package com.pucpr.projetoDisciplina.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class City implements Serializable {
//    "city":{
//        "id":"TUxCQ1NFUmI1ZGQx",
//        "name":"Serra"
//    },

    @Id
    private String id;

    private String name;

}
