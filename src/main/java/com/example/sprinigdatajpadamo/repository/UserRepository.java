package com.example.sprinigdatajpadamo.repository;

import com.example.sprinigdatajpadamo.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
