package com.pucpr.projetodisciplina.domain.dtos;

import com.pucpr.projetodisciplina.domain.entities.Attribute;
import com.pucpr.projetodisciplina.domain.entities.Product;

import java.util.Date;
import java.util.List;

public class ProductResponseDto {
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

    private AddressResponseDto seller_address;

    private String seller_contact;

    private List<Attribute> attributes;

    public ProductResponseDto(Product product) {
        this.id = product.getId();
        this.site_id = product.getSite_id();
        this.title = product.getTitle();
        this.id_integracao = product.getId_integracao();
        this.subtitle = product.getSubtitle();
        this.seller_id = product.getSeller().getId();
        this.price = product.getPrice();
        this.base_price = product.getBase_price();
        this.original_price = product.getOriginal_price();
        this.currency_id = product.getCurrency_id();
        this.initial_quantity = product.getInitial_quantity();
        this.available_quantity = product.getAvailable_quantity();
        this.start_time = product.getStart_time();
        this.stop_time = product.getStop_time();
        this.condition = product.getProduct_condition();
        this.permalink = "localhost:8080/produtos/" + getId();
        this.seller_address = new AddressResponseDto(product.getSeller().getAddress());
        this.seller_contact = product.getSeller().getContact();
        this.attributes = product.getAttributes();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId_integracao() {
        return id_integracao;
    }

    public void setId_integracao(int id_integracao) {
        this.id_integracao = id_integracao;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public long getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(long seller_id) {
        this.seller_id = seller_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBase_price() {
        return base_price;
    }

    public void setBase_price(int base_price) {
        this.base_price = base_price;
    }

    public int getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(int original_price) {
        this.original_price = original_price;
    }

    public String getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(String currency_id) {
        this.currency_id = currency_id;
    }

    public int getInitial_quantity() {
        return initial_quantity;
    }

    public void setInitial_quantity(int initial_quantity) {
        this.initial_quantity = initial_quantity;
    }

    public int getAvailable_quantity() {
        return available_quantity;
    }

    public void setAvailable_quantity(int available_quantity) {
        this.available_quantity = available_quantity;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getStop_time() {
        return stop_time;
    }

    public void setStop_time(Date stop_time) {
        this.stop_time = stop_time;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public AddressResponseDto getSeller_address() {
        return seller_address;
    }

    public void setSeller_address(AddressResponseDto seller_address) {
        this.seller_address = seller_address;
    }

    public String getSeller_contact() {
        return seller_contact;
    }

    public void setSeller_contact(String seller_contact) {
        this.seller_contact = seller_contact;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
