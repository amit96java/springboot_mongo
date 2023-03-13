package com.learn.springboot_mongo.config;

import canvara.fhir.pojos.exception.DataValidationException;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.learn.springboot_mongo.repository.student"},
        mongoTemplateRef = "studentMongoTemplate"
)
public class StudentMongoConfig {

    private String getMongoUri() throws DataValidationException {
        return "mongodb://localhost:27017";
    }

    public MongoProperties getTeacherDbProps() throws Exception {
        MongoProperties mongoProperties = new MongoProperties();
        String mongoUri = getMongoUri()+"/"+"student";
        mongoProperties.setUri(mongoUri);
        return mongoProperties;
    }

    public MongoDatabaseFactory mongoTeacherDatabaseFactory(MongoProperties mongo) throws Exception {
        return new SimpleMongoClientDatabaseFactory(
                mongo.getUri()
        );
    }

    @Bean(name = "studentMongoTemplate")
    public MongoTemplate dbMongoTemplate() throws Exception {
        return new MongoTemplate(mongoTeacherDatabaseFactory(getTeacherDbProps()));
    }



}
