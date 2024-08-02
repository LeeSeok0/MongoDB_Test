package com.example.documentdb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TestEntityRepository extends MongoRepository<TestEntity, String> {
    List<TestEntity> findAllByTestIdIsContaining(String id);
    void deleteAllByTestIdIsContaining(String id);
}
