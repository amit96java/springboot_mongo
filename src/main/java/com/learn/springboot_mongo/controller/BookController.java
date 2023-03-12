package com.learn.springboot_mongo.controller;

import com.learn.springboot_mongo.entity.Book;
import com.learn.springboot_mongo.exception.DataValidationException;
import com.learn.springboot_mongo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Object addBook(@RequestBody Book book) {
        try {

            String transId = UUID.randomUUID().toString();
            System.out.println(Thread.currentThread().getName()+" input request "+book.toString()+" with id "+transId);
            Object o = bookService.addBook(book);
            System.out.println(Thread.currentThread().getName()+" completed request "+o.toString()+" with id "+transId);
            return "success";
        } catch (Exception exp) {
            if (exp instanceof DataValidationException) {
                System.out.println("data validation exception...............");
            } else {
                System.out.println("other exception.............");
                exp.printStackTrace();
            }
            return "";
        }

    }
}
