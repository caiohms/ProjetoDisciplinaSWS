package com.pucpr.projetoDisciplina.domain.dtos;

import com.pucpr.projetoDisciplina.domain.entities.*;

import javax.persistence.*;

public class AddressResponseDto extends Address {

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

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public City getCity() {
        return city;
    }

    @Override
    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public void setCountry(Country country) {
        this.country = country;
    }
}
