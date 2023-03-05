package com.learn.springboot_mongo.repository;

import com.learn.springboot_mongo.entity.AcService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcServiceRepository extends MongoRepository<AcService, String> {
}
