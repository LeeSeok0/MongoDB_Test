package com.example.documentdb;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestEntityRepository extends MongoRepository<TestEntity, String> {
}
