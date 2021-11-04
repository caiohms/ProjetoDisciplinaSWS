package com.pucpr.projetoDisciplina.domain.dtos;

import com.pucpr.projetoDisciplina.domain.entities.Product;
import com.pucpr.projetoDisciplina.domain.repositories.ProductRepository;

import java.util.Date;
import java.util.List;

public class RegisterProductDto {

    private long id;

    private String site_id;

    private String title;

    private int id_integracao;

    private String subtitle;

    private long seller_id;

    private int price;

    private int base_price;

    private int original_price;

    private String currency_id;

    private int initial_quantity;

    private int available_quantity;

    private Date start_time;

    private Date stop_time;

    private String condition;

    private String permalink;

    private SellerAddressDto seller_address;

    private String seller_contact;

    private List<AttributesDto> attributes;

//    public Product createProduct(ProductRepository productRepository) {
//
//    }
}
