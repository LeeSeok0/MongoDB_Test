package com.example.documentdb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

public interface TestEntityRepository extends MongoRepository<TestEntity, String> {
    @Query("{ 'dateTime' : { $gte: ?0, $lt: ?1 } }")
    List<TestEntity> findAllByDateTimeRange(LocalDateTime start, LocalDateTime end);

    @Transactional
    @Query(value = "{ 'dateTime' : { $gte: ?0, $lt: ?1 } }", delete = true)
    void deleteAllByDateTime(LocalDateTime start, LocalDateTime end);
}
