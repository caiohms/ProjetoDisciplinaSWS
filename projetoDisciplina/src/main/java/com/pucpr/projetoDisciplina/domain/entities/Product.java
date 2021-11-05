package com.pucpr.projetoDisciplina.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*
{
    "id":"MLB1191972200",
    "site_id":"MLB", //Serviço do colega ou o seu próprio
    "title":"iPhone Xs 64gb",
    "id_integracao": 123123, // Id da integração deve estar preenchido se esse produto tiver sido cadastrado por meio de uma integração.
    "subtitle":null,
    "seller_id":386261073, //Id do vendedor interno do seu micro serviço ou o Id que deu para o vendedor que esta publicando
    "price":7299,
    "base_price":7299,
    "original_price":null,
    "currency_id":"BRL",
    "initial_quantity":5,
    "available_quantity":2,
    "start_time":"2019-03-11T20:12:44.000Z",
    "stop_time":"2039-03-06T04:00:00.000Z",
    "condition":"new",
    "permalink":"URLASERDADA/NOMESERVICO/PRODUTO/IDANUNCIO",
    "seller_address":{
        "city":{
            "id":"TUxCQ1NFUmI1ZGQx",
            "name":"Serra"
        },
        "state":{
            "id":"BR-ES",
            "name":"Espírito Santo"
        },
        "country":{
            "id":"BR",
            "name":"Brasil"
        },
        "id":1017932319
    },
    "seller_contact":null,
    "attributes":[
        {
            "id":"BRAND",
            "value_name":"Marca del producto"
        },
        {
            "id":"EAN", //Dúvidas sobre EAN https://magis5.com.br/o-que-e-codigo-ean-para-queserve/
            "value_name":"7898095297749"
        }
    ]
}
*/

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue
    private Long id; // "MLB1191972200"
    private String site_id; // "MLB", //Serviço do colega ou o seu próprio
    private String title; // "iPhone Xs 64gb",
    private int id_integracao; // 123123, // Id da integração deve estar preenchido se esse produto tiver sido
    private String subtitle; // null,

    @ManyToOne(cascade = CascadeType.ALL)
    private Seller seller;
    // cadastrado por meio de uma integração.
    private int price; // 7299,
    private int base_price; // 7299,

    // private int seller_id; // 386261073, //Id do vendedor interno do seu micro
    // serviço ou o Id que deu para o vendedor que esta publicando
    private int original_price; // null,
    private String currency_id; // "BRL",
    private int initial_quantity; // 5,
    private int available_quantity; // 2,

    @Temporal(TemporalType.DATE)
    private Date start_time; // "2019-03-11T20:12:44.000Z",

    @Temporal(TemporalType.DATE)
    private Date stop_time; // "2039-03-06T04:00:00.000Z",

    @JsonProperty("condition")
    private String product_condition; // "new",
    private String permalink; // "URLASERDADA/NOMESERVICO/PRODUTO/IDANUNCIO",

    @OneToMany(cascade = CascadeType.ALL)
    private List<Attribute> attributes;

    public Product() {
    }

    public Product(long id, String title, int available_quantity) {
        this.id = id;
        this.title = title;
        this.available_quantity = available_quantity;
    }

    public Product(String site_id, String title, int id_integracao, String subtitle, Seller seller,
                   int price, int base_price, int original_price, String currency_id, int initial_quantity,
                   int available_quantity, Date start_time, Date stop_time, String product_condition,
                   String permalink, List<Attribute> attributes) {
        this.site_id = site_id;
        this.title = title;
        this.id_integracao = id_integracao;
        this.subtitle = subtitle;
        this.seller = seller;
        this.price = price;
        this.base_price = base_price;
        this.original_price = original_price;
        this.currency_id = currency_id;
        this.initial_quantity = initial_quantity;
        this.available_quantity = available_quantity;
        this.start_time = start_time;
        this.stop_time = stop_time;
        this.product_condition = product_condition;
        this.permalink = permalink;
        this.attributes = attributes;
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

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
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

    public String getProduct_condition() {
        return product_condition;
    }

    public void setProduct_condition(String product_condition) {
        this.product_condition = product_condition;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}