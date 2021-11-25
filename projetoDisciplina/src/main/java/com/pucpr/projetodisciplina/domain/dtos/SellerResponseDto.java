package com.pucpr.projetodisciplina.domain.dtos;

import com.pucpr.projetodisciplina.domain.entities.Seller;

public class SellerResponseDto {

    private long id;

    private AddressResponseDto address;

    private String contact;

    public SellerResponseDto(Seller seller) {
        this.id = seller.getId();
//        this.productsList = new ArrayList<>();
//        this.productsList = seller.getProductsList();
        this.address = new AddressResponseDto(seller.getAddress());
        this.contact = seller.getContact();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public List<Product> getProductsList() {
//        return productsList;
//    }
//
//    public void setProductsList(List<Product> productsList) {
//        this.productsList = productsList;
//    }

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
