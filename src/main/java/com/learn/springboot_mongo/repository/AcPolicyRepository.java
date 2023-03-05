package com.learn.springboot_mongo.repository;

import com.learn.springboot_mongo.entity.AcPolicy;
import com.learn.springboot_mongo.entity.AcRole;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcPolicyRepository extends MongoRepository<AcPolicy, String> {
}
