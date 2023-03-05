package com.learn.springboot_mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document("ac_UserGroup_User_Map")
@Data
public class AcUserGroupUserMap {
    @Id
    @Field
    public String userGroupUserMapId;
    @Field
    public String userId;
    @Field
    public String userGroupId;
    @Field
    public Date createdOn;
    @Field
    public Date updatedOn;
}
