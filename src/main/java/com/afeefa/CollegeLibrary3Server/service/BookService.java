package com.afeefa.CollegeLibrary3Server.service;

 import com.afeefa.CollegeLibrary3Server.entity.Book;
 import com.afeefa.CollegeLibrary3Server.exception.BookNotFoundException;
 import com.afeefa.CollegeLibrary3Server.repository.BookRepository;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

 import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book findBookByTitle(String title) throws BookNotFoundException {
        Optional<Book> book = bookRepository.findByTitle(title);
        return book.orElseThrow(BookNotFoundException::new);
    }
}
