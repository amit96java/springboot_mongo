package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.entity.Student;
import com.learn.springboot_mongo.repository.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired private StudentRepository studentRepository;

    public Object saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
