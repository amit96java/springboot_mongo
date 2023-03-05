package com.learn.springboot_mongo.repository;

import com.learn.springboot_mongo.entity.AcRole;
import com.learn.springboot_mongo.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AcRoleRepository extends MongoRepository<AcRole, String> {
    Optional<AcRole> findByRoleName(String roleName);
}
