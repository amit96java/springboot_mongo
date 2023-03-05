package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.repository.AcPolicyRoleMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcPolicyRoleMapService {
    @Autowired
    private AcPolicyRoleMapRepository acPolicyRoleMapRepository;

    
}
