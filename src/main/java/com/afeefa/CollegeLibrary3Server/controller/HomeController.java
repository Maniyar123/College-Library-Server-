package com.afeefa.CollegeLibrary3Server.controller;

import com.afeefa.CollegeLibrary3Server.entity.Book;
import com.afeefa.CollegeLibrary3Server.exception.BookNotFoundException;
import com.afeefa.CollegeLibrary3Server.repository.BookRepository;
import com.afeefa.CollegeLibrary3Server.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 import java.util.Optional;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private BookService bookService;

   @GetMapping("/book/{title}")
    public Book getBook(@PathVariable String title) throws BookNotFoundException {
        return bookService.findBookByTitle(title);
   }
}



