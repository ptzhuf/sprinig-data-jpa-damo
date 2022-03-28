package com.example.sprinigdatajpadamo.controller;

import com.example.sprinigdatajpadamo.domain.NamesOnly;
import com.example.sprinigdatajpadamo.domain.Person;
import com.example.sprinigdatajpadamo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/add")
    @ResponseBody
    public Person add(@RequestParam String firstname, @RequestParam String lastname) {
        Person entity = Person.builder().firstname(firstname).lastname(lastname).build();
        entity = personRepository.save(entity);
        return entity;
    }

    @GetMapping("/names/all")
    @ResponseBody
    public List<NamesOnly> namesAll(@RequestParam String lastname) {
//        return personRepository.findByLastname(lastname);
        return new ArrayList<>();
    }

    @GetMapping("/t/all")
    @ResponseBody
    public <T> List<T> t(@RequestParam String lastname) {
        List<NamesOnly> result = personRepository.findByLastname(lastname, NamesOnly.class);
        return (List<T>) result;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Person> all() {
        return personRepository.findAll();
    }
}

