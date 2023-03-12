package com.learn.springboot_mongo.controller;

import com.learn.springboot_mongo.entity.Teacher;
import com.learn.springboot_mongo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired private TeacherService teacherService;

    @PostMapping
    public Object saveTeacher(@RequestBody Teacher teacher) {
        String transId = UUID.randomUUID().toString();
        System.out.println(Thread.currentThread().getName()+" input request "+teacher.toString()+" with id "+transId);
        Object o = teacherService.saveTeacher(teacher);
        System.out.println(Thread.currentThread().getName()+" completed request "+o.toString()+" with id "+transId);
        return "success";
    }
}
