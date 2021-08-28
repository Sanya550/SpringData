package com.example.hw6.service;

import com.example.hw6.entity.Person;


public interface PersonService {
    Person findByIdPerson(long id);

    void savePerson(Person person);

    void updatePerson(Person person);

    void deletePerson(Person person);
}
