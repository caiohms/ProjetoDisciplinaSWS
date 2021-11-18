package com.pucpr.projetodisciplina.domain.dtos;

import com.pucpr.projetodisciplina.domain.entities.Product;
import com.pucpr.projetodisciplina.domain.entities.Seller;

import java.util.List;

public class SellerResponseDto {

    private long id;

    private List<Product> productsList;

    private AddressResponseDto address;

    private String contact;

    public SellerResponseDto(Seller seller) {
        this.id = seller.getId();
//        this.productsList = seller.getProductsList(); TODO: criar um dto para este atributo não sobrecarregar.
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

    public AddressResponseDto getAddress() {
        return address;
    }

    public void setAddress(AddressResponseDto address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
