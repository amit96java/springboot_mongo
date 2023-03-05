package com.learn.springboot_mongo.repository;

import com.learn.springboot_mongo.entity.AcAccessBit;
import com.learn.springboot_mongo.entity.AcPolicy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcAccessBitRepository extends MongoRepository<AcAccessBit, String> {
}
