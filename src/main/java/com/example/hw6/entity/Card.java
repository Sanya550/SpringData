package com.example.hw6.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long id;
    @Column(name = "sum")
    private Double sum;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card", referencedColumnName = "person_id")
    private Person person;
}