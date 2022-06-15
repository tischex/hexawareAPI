package com.api.hexaware.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.api.hexaware.model.Book;
import com.api.hexaware.repository.BookRepository;
import com.api.hexaware.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookrepository) {
		super();
		this.bookRepository = bookrepository;
	}
	
	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
}