package com.api.hexaware.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="book")
public class Book {
	@Id
	@Column(name="book_id")
	private String book_id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Cascade({CascadeType.ALL})
	private Library library;
	
	@Column(name="book_name")
	private String book_name;

	public String getBook_id() {
		return book_id;
	}
	public void setLibrary_id(String book_id) {
		this.book_id = book_id;
	}

	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
}
