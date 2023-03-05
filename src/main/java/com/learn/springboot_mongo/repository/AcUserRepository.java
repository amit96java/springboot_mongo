package com.learn.springboot_mongo.repository;

import com.learn.springboot_mongo.entity.AcRole;
import com.learn.springboot_mongo.entity.AcUser;
import com.learn.springboot_mongo.entity.AcUserGroupRoleMap;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AcUserRepository extends MongoRepository<AcUser, String> {

    Optional<List<AcUser>> findByOrganizationId(String organizationId);


}
