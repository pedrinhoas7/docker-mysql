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

    public Long getcodeCat() {
        return code;
    }


    public Long getcode() {
        return code;
    }

    public void setcode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setQuantidade(Integer amount) {
        this.amount = amount;
    }

    public Double getShort_Price() {
        return short_price;
    }

    public void setPreco_curto(Double short_price) {
        this.short_price = short_price;
    }

    public Double getSalePrice() {
        return sale_price;
    }

    public void setPreco_venda(Double sale_price) {
        this.sale_price = sale_price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((note == null) ? 0 : note.hashCode());
        result = prime * result + ((short_price == null) ? 0 : short_price.hashCode());
        result = prime * result + ((sale_price == null) ? 0 : sale_price.hashCode());
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (note == null) {
            if (other.note != null)
                return false;
        } else if (!note.equals(other.note))
            return false;
        if (short_price == null) {
            if (other.short_price != null)
                return false;
        } else if (!short_price.equals(other.short_price))
            return false;
        if (sale_price == null) {
            if (other.sale_price != null)
                return false;
        } else if (!sale_price.equals(other.sale_price))
            return false;
        if (amount == null) {
            if (other.amount != null)
                return false;
        } else if (!amount.equals(other.amount))
            return false;
        return true;
    }

}
