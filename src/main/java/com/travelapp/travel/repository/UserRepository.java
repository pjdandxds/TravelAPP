package com.travelapp.travel.repository;

import com.travelapp.travel.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface UserRepository extends CrudRepository<User, Integer>{
    Optional<User> getByUsername(String username);
}

