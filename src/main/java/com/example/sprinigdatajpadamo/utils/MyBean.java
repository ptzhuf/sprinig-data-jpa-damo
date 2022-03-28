package com.example.sprinigdatajpadamo.utils;

import com.example.sprinigdatajpadamo.domain.Person;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public String getEvoName(Person person) {
        return person.getLastname() + " mybean yeah " + person.getFirstname();
    }

}
