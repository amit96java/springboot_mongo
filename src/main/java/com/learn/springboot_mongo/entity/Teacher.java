package com.learn.springboot_mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "teacher")
@Data
public class Teacher {
    @Id
    @Field
    public String teacherId;
    @Field
    public String teacherName;
}
