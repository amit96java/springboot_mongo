package com.learn.springboot_mongo.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "book")
@Data
public class Student {
    @Id
    @Field
    public String studentId;
    @Field
    public String studentName;
}
