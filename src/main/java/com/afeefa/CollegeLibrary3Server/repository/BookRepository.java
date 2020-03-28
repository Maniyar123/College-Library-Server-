package com.afeefa.CollegeLibrary3Server.repository;

import com.afeefa.CollegeLibrary3Server.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
   Optional<Book> findByTitle(String title);

    Book findBookByTitle(String title);
}
