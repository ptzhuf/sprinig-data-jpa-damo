package com.example.sprinigdatajpadamo.repository;

import com.example.sprinigdatajpadamo.domain.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u where u.name like %?1%")
    List<User> findByAndSort(String name, Sort sort);
}
