package com.pucpr.projetoDisciplina.domain.dtos;

import com.pucpr.projetoDisciplina.domain.entities.*;
import com.pucpr.projetoDisciplina.domain.repositories.AddressRepository;

import java.util.Optional;

public class SellerAddressDto {

    private long id;

    private City city;

    private State state;

    private Country country;

    public Address convert(AddressRepository addressRepository) {
        Optional<Address> findAddress = addressRepository.findById(getId());

        return findAddress.orElseGet(() -> new Address(getCity(), getState(), getCountry()));
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public City getCity() { return city; }

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
