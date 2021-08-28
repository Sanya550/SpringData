package com.example.hw6.service;

import com.example.hw6.entity.Card;
import com.example.hw6.entity.Product;

import java.util.List;

public interface CardService {
    Card findById(long id);

    void saveCard(Card card);

    void updateCard(Card card);

    void deleteCard(Card card);

    Double findSummary(List<Product> products);

}
