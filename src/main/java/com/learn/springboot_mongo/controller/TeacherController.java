package com.learn.springboot_mongo.controller;

import com.learn.springboot_mongo.entity.Teacher;
import com.learn.springboot_mongo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired private TeacherService teacherService;

    @PostMapping
    public Object saveTeacher(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }
}
