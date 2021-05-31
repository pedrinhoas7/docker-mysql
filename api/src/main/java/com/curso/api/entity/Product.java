package com.curso.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private Long code;

    @Column(name = "description")
    private String description;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "short_price")
    private Double short_price;

    @Column(name = "sale_price")
    private Double sale_price;

    @Column(name = "note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "code_category", referencedColumnName = "code")
    private Category category;

    @ManyToOne
    private Company company;

}
