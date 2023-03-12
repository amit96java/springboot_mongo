package com.learn.springboot_mongo.config;

import canvara.fhir.pojos.exception.DataValidationException;
import canvara.fhir.pojos.service.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableMongoRepositories(basePackages = {"com.learn.springboot_mongo.repository.book"},
        mongoTemplateRef = "mongoTemplate"
)
public class BookMongoConfig {

    private String getMongoUri() throws DataValidationException {
        return "mongodb://localhost:27017";
    }


    public MongoProperties getBookDbProps() throws Exception {
        MongoProperties mongoProperties = new MongoProperties();
        String mongoUri = getMongoUri()+"/"+"book";
        mongoProperties.setUri(mongoUri);
        return mongoProperties;
    }


    public MongoDatabaseFactory bookMongoDatabaseFactory(MongoProperties mongo) throws Exception {
        return new SimpleMongoClientDatabaseFactory(
                mongo.getUri()
        );
    }

    @Primary
    @Bean(name = "mongoTemplate")
    public MongoTemplate dbMongoTemplate() throws Exception {
        return new MongoTemplate(bookMongoDatabaseFactory(getBookDbProps()));
    }



}
