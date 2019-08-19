package com.springSenai.demo.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.springSenai.demo.models.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail (String email);
}