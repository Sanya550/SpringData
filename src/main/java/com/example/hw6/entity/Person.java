package com.example.hw6.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "person")
public class Person {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;


    @OneToMany(fetch = FetchType.LAZY)
    @Column(name = "card")
    private List<Card> carts;


}


