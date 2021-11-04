package com.pucpr.projetoDisciplina.domain.dtos;

import com.pucpr.projetoDisciplina.domain.entities.Address;
import com.pucpr.projetoDisciplina.domain.entities.Attribute;
import com.pucpr.projetoDisciplina.domain.entities.Product;
import com.pucpr.projetoDisciplina.domain.entities.Seller;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProductDTO implements Serializable {

    private Long id;
    private String site_id;
    private String title;
    private Integer id_integracao;
    private String subtitle;
    private Long seller_id;
    private Integer price; // 7299,
    private Integer base_price; // 7299,
    private Integer original_price; // null,
    private String currency_id; // "BRL",
    private Integer initial_quantity; // 5,
    private Integer available_quantity; // 2,

    @Temporal(TemporalType.DATE)
    private Date start_time; // "2019-03-11T20:12:44.000Z",

    @Temporal(TemporalType.DATE)
    private Date stop_time; // "2039-03-06T04:00:00.000Z",

    private String condition; // "new",
    private String permalink; // "URLASERDADA/NOMESERVICO/PRODUTO/IDANUNCIO",
    private Address seller_address;
    private String seller_contact;
    private List<Attribute> attributes;

    public ProductDTO() {
    }

    public ProductDTO(Product p) {
        this.id = p.getId();
        this.site_id = p.getSite_id();
        this.title = p.getTitle();
        this.id_integracao = p.getId_integracao();
        this.subtitle = p.getSubtitle();
        this.seller_id = p.getSeller() != null ? p.getSeller().getId() : null;
        this.price = p.getPrice();
        this.base_price = p.getBase_price();
        this.original_price = p.getOriginal_price();
        this.currency_id = p.getCurrency_id();
        this.initial_quantity = p.getInitial_quantity();
        this.available_quantity = p.getAvailable_quantity();
        this.start_time = p.getStart_time();
        this.stop_time = p.getStop_time();
        this.condition = p.getProduct_condition();
        this.permalink = p.getPermalink();
        this.seller_contact = p.getSeller() != null ? p.getSeller().getContact() : null;
        this.seller_address = p.getSeller() != null ? p.getSeller().getAddress() : null;
        this.attributes = p.getAttributes();
    }

    public String getSeller_contact() {
        return seller_contact;
    }

    public void setSeller_contact(String seller_contact) {
        this.seller_contact = seller_contact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getId_integracao() {
        return id_integracao;
    }

    public void setId_integracao(Integer id_integracao) {
        this.id_integracao = id_integracao;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Long getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(Long seller_id) {
        this.seller_id = seller_id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getBase_price() {
        return base_price;
    }

    public void setBase_price(Integer base_price) {
        this.base_price = base_price;
    }

    public Integer getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(Integer original_price) {
        this.original_price = original_price;
    }

    public String getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(String currency_id) {
        this.currency_id = currency_id;
    }

    public Integer getInitial_quantity() {
        return initial_quantity;
    }

    public void setInitial_quantity(Integer initial_quantity) {
        this.initial_quantity = initial_quantity;
    }

    public Integer getAvailable_quantity() {
        return available_quantity;
    }

    public void setAvailable_quantity(Integer available_quantity) {
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

    public Address getSeller_address() {
        return seller_address;
    }

    public void setSeller_address(Address seller_address) {
        this.seller_address = seller_address;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
