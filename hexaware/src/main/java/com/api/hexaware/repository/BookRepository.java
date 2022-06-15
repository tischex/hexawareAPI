package com.api.hexaware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.hexaware.model.Book;

@Repository("bookRepository")
public interface BookRepository extends JpaRepository<Book, Long> {

}