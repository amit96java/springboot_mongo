package com.learn.springboot_mongo.repository;

import com.learn.springboot_mongo.entity.AcService;
import com.learn.springboot_mongo.entity.AcUserGroup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcUserGroupRepository extends MongoRepository<AcUserGroup, String> {
}
