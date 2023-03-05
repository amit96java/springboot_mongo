package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.entity.AcOrganization;
import com.learn.springboot_mongo.repository.AcOrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcOrganizationService {
    @Autowired
    private AcOrganizationRepository acOrganizationRepository;
    @Autowired
    private AcUserService userService;

    public AcOrganization getOrganizationsByUser(String userId) {
        //get organizationIds by userId
        String organizationId = userService.getOrganizationIdByUserId(userId);
        //get organizations by organizationIds
        return acOrganizationRepository.findById(organizationId).orElse(new AcOrganization());
    }


}
