package com.example.hw6.controller;

import com.example.hw6.entity.Card;
import com.example.hw6.entity.Product;
import com.example.hw6.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardConroller {
    @Autowired
    private CardService cardService;

    @GetMapping(value = "/findByIdCard/{id}")
    public ResponseEntity<Card> findByIdentif(@PathVariable("id") long id) {
        Card card = cardService.findById(id);
        return new ResponseEntity<Card>(card, HttpStatus.OK);
    }

    @PostMapping(value = "/createCard")
    public void create(@RequestBody Card card) {
        cardService.saveCard(card);
    }

    @PutMapping(value = "/updateCard")
    public void update(@RequestBody Card card) {
        cardService.updateCard(card);
    }

    @DeleteMapping(value = "/deleteCard")
    public void delete(@RequestBody Card card) {
        cardService.deleteCard(card);
    }

    @PostMapping(value = "/summaryOfCart")
    public void summary(@RequestBody List<Product> products) {
        cardService.findSummary(products);
    }
}
