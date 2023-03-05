package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.entity.AcRole;
import com.learn.springboot_mongo.repository.AcRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AcRoleService {

    @Autowired
    private AcRoleRepository acRoleRepository;
    @Autowired
    private AcUserGroupRoleMapService userGroupRoleMapService;
    @Autowired
    private AcUserGroupUserMapService userGroupUserMapService;

    public AcRole getRoleById(String roleId) {
        return acRoleRepository.findById(roleId).orElse(new AcRole());
    }

    public AcRole getRoleByName(String name) {
        return acRoleRepository.findByRoleName(name).orElse(new AcRole());
    }

    public List<AcRole> getRolesByUser(String userId) {
        //get userGroup using userId
        var userGroupIds = userGroupUserMapService.getUserGroupIdByUserId(userId);
        //get roleId using userGroupId
        List<String> roleIds = userGroupIds.stream()
                .map(userGroupId -> userGroupRoleMapService.getRoleIdByUserGroupId(userGroupId))
                .collect(Collectors.toList());
        //get role using roleId
       return roleIds.stream().map(roleId -> getRoleById(roleId))
                .collect(Collectors.toList());

    }

    public Boolean assignRoleToUser(String roleId, String userId) {
        //find userGroup using userId

        //add roleId with userGroup

        return true;
    }

}
