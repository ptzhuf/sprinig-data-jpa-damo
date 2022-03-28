package com.example.sprinigdatajpadamo.repository;

import com.example.sprinigdatajpadamo.domain.NamesOnly;
import com.example.sprinigdatajpadamo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
//    List<NamesOnly> findByLastname(String lastname);

    <T> List<T> findByLastname(String lastname, Class<T> type);
}
