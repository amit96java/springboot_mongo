package com.learn.springboot_mongo.repository;

import com.learn.springboot_mongo.entity.AcAccessBit;
import com.learn.springboot_mongo.entity.AcOrganization;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public interface AcOrganizationRepository extends MongoRepository<AcOrganization, String> {


}
