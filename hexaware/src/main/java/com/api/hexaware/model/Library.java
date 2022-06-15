package com.api.hexaware.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="library")
public class Library {
	@Id
	@Column(name="library_id")
	private long library_id;
	
	@Column(name="library_name")
	private String library_name;

	public long getLibrary_id() {
		return library_id;
	}
	public void setLibrary_id(long library_id) {
		this.library_id = library_id;
	}
	
	public String getLibrary_name() {
		return library_name;
	}
	public void setLibrary_name(String library_name) {
		this.library_name = library_name;
	}
}
