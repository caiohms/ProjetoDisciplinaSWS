package com.pucpr.projetodisciplina.domain.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pucpr.projetodisciplina.domain.entities.Attribute;

public class AttributesDto {

    @JsonProperty("id")
    private String type;

    private String value_name;

    public Attribute convert() {
        return new Attribute(getType(), getValue_name());
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
