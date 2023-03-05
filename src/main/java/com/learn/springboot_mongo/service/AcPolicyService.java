package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.repository.AcPolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcPolicyService {
    @Autowired
    private AcPolicyRepository acPolicyRepository;


}
