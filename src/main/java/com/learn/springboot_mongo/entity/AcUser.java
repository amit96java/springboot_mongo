package com.learn.springboot_mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document("ac_User")
@Data
public class AcUser {
    @Id
    @Field
    public String userId;
    @Field
    public String organizationId;
    @Field
    public String userName;
    @Field
    public String userEmail;
    @Field
    public Date createdOn;
    @Field
    public Date updatedOn;
}
