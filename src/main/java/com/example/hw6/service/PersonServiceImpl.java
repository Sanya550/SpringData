package com.example.hw6.service;

import com.example.hw6.entity.Person;
import com.example.hw6.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person findByIdPerson(long id) {
        return personRepository.getById(id);
    }


    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public void updatePerson(Person person) {
        savePerson(person);
    }

    @Override
    public void deletePerson(Person person) {
        personRepository.delete(person);
    }
}
