package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.entity.AcUserGroupRoleMap;
import com.learn.springboot_mongo.repository.AcUserGroupRoleMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcUserGroupRoleMapService {
    @Autowired
    private AcUserGroupRoleMapRepository acUserGroupRoleMapRepository;

    public AcUserGroupRoleMap getByUserGroupId(String userGroupId) {
      return  acUserGroupRoleMapRepository.findByUserGroupId(userGroupId).orElse(new AcUserGroupRoleMap());
    }

    public String getRoleIdByUserGroupId(String userGroupId) {
        return getByUserGroupId(userGroupId).roleId;
    }

}
