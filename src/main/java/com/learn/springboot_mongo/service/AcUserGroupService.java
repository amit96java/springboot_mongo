package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.repository.AcUserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcUserGroupService {

    @Autowired
    private AcUserGroupRepository acUserGroupRepository;


}
