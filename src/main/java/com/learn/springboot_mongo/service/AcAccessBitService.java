package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.repository.AcAccessBitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcAccessBitService {
    @Autowired
    private AcAccessBitRepository acAccessBitRepository;

}
