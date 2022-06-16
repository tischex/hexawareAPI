package com.api.hexaware.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.hexaware.model.Book;
import com.api.hexaware.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@PostMapping("/newBook")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		book.toString();
		return new ResponseEntity<Book>(bookService.saveBook(book), HttpStatus.CREATED);
	}
	
	@GetMapping("/bookList")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@GetMapping("/numOfBooks/{library_library_id}")
	public String countBooks(@PathVariable("library_library_id") int library_library_id) throws Exception {
		String numOfBooks = "0 books";
		if(bookService.getCountLibraryByLibraryId(library_library_id) > 0) {
			numOfBooks = "" + bookService.getCountLibraryByLibraryId(library_library_id) + " books";
		}
		return numOfBooks;
	}
}
