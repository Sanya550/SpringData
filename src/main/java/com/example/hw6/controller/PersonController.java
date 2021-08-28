package com.example.hw6.controller;

import com.example.hw6.entity.Person;
import com.example.hw6.entity.Product;
import com.example.hw6.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(value = "/findByIdPerson/{id}")
    public ResponseEntity<Person> findByIdentif(@PathVariable("id") long id) {
        Person person = personService.findByIdPerson(id);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }

    @PostMapping(value = "/createPerson")
    public void create(@RequestBody Person person) {
        personService.savePerson(person);
    }

    @PutMapping(value = "/updatePerson")
    public void update(@RequestBody Person person) {
        personService.updatePerson(person);
    }

    @DeleteMapping(value = "/deletePerson")
    public void delete(@RequestBody Person person) {
        personService.deletePerson(person);
    }
}
