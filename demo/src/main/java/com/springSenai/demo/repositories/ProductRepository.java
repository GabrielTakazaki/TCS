package com.springSenai.demo.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.springSenai.demo.models.Products;

public interface ProductRepository extends MongoRepository<Products, String> {
    @Override
    void delete (Products deleted);
}