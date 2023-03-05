package com.learn.springboot_mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "ac_UserGroup_Role_Map")
@Data
public class AcUserGroupRoleMap {
    @Id
    @Field
    public String userGroupRoleMapId;
    @Field
    public String userGroupId;
    @Field
    public String roleId;
    @Field
    public Date createdOn;
    @Field
    public Date updatedOn;
}
