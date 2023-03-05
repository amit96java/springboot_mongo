package com.learn.springboot_mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document("ac_Policy")
@Data
public class AcPolicy {
    @Id
    @Field
    public String policyId;
    @Field
    public String policyName;
    @Field
    public Date createdOn;
    @Field
    public Date updatedOn;
}
