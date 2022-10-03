package com.nttdata.bootcamp.priceservice.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "prices")
public class Price {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "price")
    private BigDecimal precio;
    private String description;
    @Column(name = "code_product")
    private String codeProduct;
}
