package com.example.hw6.repository;

import com.example.hw6.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CardRepository extends JpaRepository<Card, Long> {
}
