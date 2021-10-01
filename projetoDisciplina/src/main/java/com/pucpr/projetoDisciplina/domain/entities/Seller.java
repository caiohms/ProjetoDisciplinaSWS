package com.pucpr.projetoDisciplina.domain.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Seller implements Serializable {

    @Id
    private long id;

    @OneToMany
    private List<Product> productsList;

    @OneToOne
    private Address address;

    private String contact;
}
