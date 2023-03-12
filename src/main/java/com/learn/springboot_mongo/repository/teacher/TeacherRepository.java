package com.learn.springboot_mongo.repository.teacher;

import com.learn.springboot_mongo.entity.Book;
import com.learn.springboot_mongo.entity.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher, String> {
}
