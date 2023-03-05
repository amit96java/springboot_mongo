package com.learn.springboot_mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "ac_Role")
@Data
public class AcRole {
    @Id
    @Field
    public String roleID;
    @Field
    public String roleName;
    @Field
    public Date createdOn;
    @Field
    public Date updatedOn;
}
