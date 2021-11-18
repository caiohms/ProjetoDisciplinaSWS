package com.pucpr.projetodisciplina.domain.dtos;

import com.pucpr.projetodisciplina.domain.entities.Address;
import com.pucpr.projetodisciplina.domain.entities.City;
import com.pucpr.projetodisciplina.domain.entities.Country;
import com.pucpr.projetodisciplina.domain.entities.State;

public class AddressResponseDto {

    private long id;

    private City city;

    private State state;

    private Country country;

    public AddressResponseDto(Address address) {
        this.id = address.getId();
        this.city = address.getCity();
        this.state = address.getState();
        this.country = address.getCountry();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
