package com.api.hexaware.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@Column(name="book_id")
	private String book_id;
	
	@OneToMany(targetEntity = Library.class)
	private Set<Library> library;
	
	@Column(name="book_name")
	private String book_name;

	public String getBook_id() {
		return book_id;
	}
	public void setLibrary_id(String book_id) {
		this.book_id = book_id;
	}

	public Set<Library> getLibrary() {
		return library;
	}
	public void setLibrary(Set<Library> library) {
		this.library = library;
	}
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
}