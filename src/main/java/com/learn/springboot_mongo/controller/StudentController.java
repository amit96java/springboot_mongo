package com.learn.springboot_mongo.controller;

import com.learn.springboot_mongo.entity.Book;
import com.learn.springboot_mongo.entity.Student;
import com.learn.springboot_mongo.exception.DataValidationException;
import com.learn.springboot_mongo.service.BookService;
import com.learn.springboot_mongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Object addStudent(@RequestBody Student student) {
            String transId = UUID.randomUUID().toString();
            System.out.println(Thread.currentThread().getName()+" input request "+student.toString()+" with id "+transId);
            Object o = studentService.saveStudent(student);
            System.out.println(Thread.currentThread().getName()+" completed request "+o.toString()+" with id "+transId);
            return "success";


    }
}
