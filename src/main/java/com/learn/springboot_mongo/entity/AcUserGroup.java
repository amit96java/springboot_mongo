package com.learn.springboot_mongo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("ac_UserGroup")
@Data
public class AcUserGroup {
    public String userGroupId;
    public String userGroupName;
    public String parentUserGroupId;
    public Date createdOn;
    public Date updatedOn;
}
