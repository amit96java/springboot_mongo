package com.learn.springboot_mongo.controller;

import com.learn.springboot_mongo.entity.Book;
import com.learn.springboot_mongo.exception.CanvaraException;
import com.learn.springboot_mongo.exception.DataValidationException;
import com.learn.springboot_mongo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping
public class BookController {
    @Autowired private BookService bookService;

    @PostMapping
    public String addBook(@RequestBody Book book) {
        try {
            return bookService.addBook(book);
        } catch (Exception exp) {
            if(exp instanceof DataValidationException) {
                System.out.println("data validation exception...............");
            } else {
                System.out.println("other exception.............");
            }
            return "";
        }

    }
}
