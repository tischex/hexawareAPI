package com.api.hexaware.service;

import java.util.List;
import com.api.hexaware.model.Book;

public interface BookService {
	public Book saveBook(Book book);
	public List<Book> getAllBooks();
}