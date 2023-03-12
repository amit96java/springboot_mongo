package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.entity.Teacher;
import com.learn.springboot_mongo.repository.teacher.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Object saveTeacher(Teacher teacher) {
       return teacherRepository.save(teacher);

    }
}
