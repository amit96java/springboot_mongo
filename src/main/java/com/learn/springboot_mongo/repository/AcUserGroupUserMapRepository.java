package com.learn.springboot_mongo.repository;

import com.learn.springboot_mongo.entity.AcUserGroupRoleMap;
import com.learn.springboot_mongo.entity.AcUserGroupUserMap;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AcUserGroupUserMapRepository extends MongoRepository<AcUserGroupUserMap, String> {


    Optional<List<AcUserGroupUserMap>> findByUserId(String userId);
}
