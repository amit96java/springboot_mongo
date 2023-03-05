package com.learn.springboot_mongo.repository;

import com.learn.springboot_mongo.entity.AcPolicyRoleMap;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcPolicyRoleMapRepository extends MongoRepository<AcPolicyRoleMap, String> {
}
