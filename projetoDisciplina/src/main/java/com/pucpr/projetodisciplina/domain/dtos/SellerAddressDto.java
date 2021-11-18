package com.pucpr.projetodisciplina.domain.dtos;

import com.pucpr.projetodisciplina.domain.entities.Address;
import com.pucpr.projetodisciplina.domain.entities.City;
import com.pucpr.projetodisciplina.domain.entities.Country;
import com.pucpr.projetodisciplina.domain.entities.State;
import com.pucpr.projetodisciplina.domain.repositories.AddressRepository;
import com.pucpr.projetodisciplina.domain.repositories.CityRepository;
import com.pucpr.projetodisciplina.domain.repositories.CountryRepository;
import com.pucpr.projetodisciplina.domain.repositories.StateRepository;

import java.util.Optional;

public class SellerAddressDto {

    private long id;

    private City city;

    private State state;

    private Country country;

    public Address convert(AddressRepository addressRepository, CityRepository cityRepository,
                           StateRepository stateRepository, CountryRepository countryRepository) {
        Optional<Address> optionalAddress = addressRepository.findById(getId());

        if (optionalAddress.isPresent()) return optionalAddress.get();

        Address newAddress = new Address(getCity(), getState(), getCountry());
        cityRepository.save(newAddress.getCity());
        stateRepository.save(newAddress.getState());
        countryRepository.save(newAddress.getCountry());

        return newAddress;
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
