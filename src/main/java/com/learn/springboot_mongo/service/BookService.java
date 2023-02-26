package com.learn.springboot_mongo.service;

import com.learn.springboot_mongo.entity.Book;
import com.learn.springboot_mongo.exception.CanvaraException;
import com.learn.springboot_mongo.exception.DataValidationException;
import com.learn.springboot_mongo.exception.NotFoundException;
import com.learn.springboot_mongo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public String addBook(Book book) throws CanvaraException {
        try {
            bookRepository.save(book);
            if(true) throw new NotFoundException("manually");
            Book book1 = new Book();
            book1.setId("123");
            book1.setName("updated name");
            bookRepository.save(book1);
            return "success";
        } catch (Exception exp) {
            throw new CanvaraException("",exp);
        }
    }
}
