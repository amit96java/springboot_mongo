package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.repository.AcServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcServiceService {
    @Autowired
    private AcServiceRepository acServiceRepository;
}
