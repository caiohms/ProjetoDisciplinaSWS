package com.pucpr.projetoDisciplina.domain.dtos;

import com.pucpr.projetoDisciplina.domain.entities.Address;
import com.pucpr.projetoDisciplina.domain.entities.Product;
import com.pucpr.projetoDisciplina.domain.entities.Seller;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

public class SellerResponseDto {

    private long id;

    private List<Product> productsList;

    private Address address;

    private String contact;

    public SellerResponseDto(Seller seller) {
        this.id = seller.getId();
        this.productsList = seller.getProductsList();
        this.address = new AddressResponseDto(seller.getAddress());
        this.contact = seller.getContact();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
