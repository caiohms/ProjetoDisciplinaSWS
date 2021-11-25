package com.pucpr.projetodisciplina.domain.dtos;

import java.io.Serializable;

public class ProductWithQuantityDTO implements Serializable {

    private final String name;
    private final int availableQuantity;

    public ProductWithQuantityDTO(String name, int availableQuantity) {
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
