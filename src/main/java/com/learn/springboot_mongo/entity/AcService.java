package com.learn.springboot_mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document("ac_Service")
@Data
public class AcService {
    @Id
    @Field
    public String serviceId;
    @Field
    public String serviceName;
    @Field
    public Date createdOn;
    @Field
    public Date updatedOn;
}
