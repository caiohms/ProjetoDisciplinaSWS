package com.pucpr.projetoDisciplina.domain.dtos;

import java.io.Serializable;

public class ProductWithQuantity implements Serializable {

    private final String name;
    private final int availableQuantity;

    public ProductWithQuantity(String name, int availableQuantity) {
        this.name = name;
        this.availableQuantity = availableQuantity;
    }

    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }
}
