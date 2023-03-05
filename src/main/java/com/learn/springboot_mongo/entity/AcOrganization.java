package com.learn.springboot_mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document("ac_Organization")
@Data
public class AcOrganization {
    @Id
    @Field
    public String organizationId;
    @Field
    public String organizationName;
    @Field
    public String organizationType;
    @Field
    public Date createdOn;
    @Field
    public Date updatedOn;
}
