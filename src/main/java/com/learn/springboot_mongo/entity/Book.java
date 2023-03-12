package com.learn.springboot_mongo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "book")
@Data
public class Book {
    @Id
    @Field("id")
    private String id;
    @Field("name")
    private String name;
}
