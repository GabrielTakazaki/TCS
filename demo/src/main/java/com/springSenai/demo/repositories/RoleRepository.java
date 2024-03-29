package com.springSenai.demo.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.springSenai.demo.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByRole (String Role);
}