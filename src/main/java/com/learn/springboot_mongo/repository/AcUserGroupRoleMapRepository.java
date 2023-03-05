package com.learn.springboot_mongo.repository;

import com.learn.springboot_mongo.entity.AcUserGroupRoleMap;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AcUserGroupRoleMapRepository extends MongoRepository<AcUserGroupRoleMap, String> {


    Optional<AcUserGroupRoleMap> findByUserGroupId(String userGroupId);
}
