package com.example.hw6.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "cost")
    private Long cost;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product", referencedColumnName = "card_id")
    private Card cart;

}



