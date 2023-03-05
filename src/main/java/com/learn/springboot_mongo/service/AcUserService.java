package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.entity.AcUser;
import com.learn.springboot_mongo.repository.AcUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcUserService {
    @Autowired
    private AcUserRepository acUserRepository;

    public AcUser getUserByUserId(String userId) {
        return acUserRepository.findById(userId).orElse(new AcUser());
    }

    public String getOrganizationIdByUserId(String userId) {
        return getUserByUserId(userId).organizationId;
    }

    public List<AcUser> getUsersByOrganization(String organizationId) {
       return acUserRepository.findByOrganizationId(organizationId).orElse(List.of(new AcUser()));
    }

    public Boolean addUserToOrganization(String userId, String organizationId) {
        AcUser user = getUserByUserId(userId);
        user.organizationId = organizationId;
        acUserRepository.save(user);
        return true;
    }
}
