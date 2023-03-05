package com.learn.springboot_mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document("ac_AccessBit")
@Data
public class AcAccessBit {
    @Id
    @Field
    public String accessId;
    @Field
    public String accessType;
    @Field
    public Date createdOn;
    @Field
    public Date updatedOn;
}
