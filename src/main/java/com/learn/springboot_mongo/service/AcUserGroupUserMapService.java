package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.entity.AcUserGroupUserMap;
import com.learn.springboot_mongo.repository.AcUserGroupUserMapRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AcUserGroupUserMapService {

    private AcUserGroupUserMapRepository acUserGroupUserMapRepository;


    public List<AcUserGroupUserMap> getUserGroupUserMapByUserId(String userId) {
        return acUserGroupUserMapRepository.findByUserId(userId).orElse(List.of(new AcUserGroupUserMap()));
    }

    public List<String> getUserGroupIdByUserId(String userId) {
        return getUserGroupUserMapByUserId(userId).stream()
                .map(dto -> dto.userGroupId).collect(Collectors.toList());
    }
}
