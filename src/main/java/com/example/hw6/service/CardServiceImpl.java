package com.example.hw6.service;

import com.example.hw6.entity.Card;

import com.example.hw6.entity.Product;
import com.example.hw6.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CardServiceImpl implements CardService {
    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card findById(long id) {
        cardRepository.getById(id);
        return null;
    }

    @Override
    public void saveCard(Card card) {
        cardRepository.save(card);
    }

    @Override
    public void updateCard(Card card) {
        saveCard(card);
    }

    @Override
    public void deleteCard(Card card) {
        cardRepository.delete(card);
    }

    @Override
    public Double findSummary(List<Product> products) {
        double cartPrice = 0;
        for (Product product : products) {
            if (product != null) {
                cartPrice += product.getCost();
            }
        }
        return cartPrice;
    }
}

