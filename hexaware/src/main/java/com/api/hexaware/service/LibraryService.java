package com.api.hexaware.service;

import java.util.List;

import com.api.hexaware.model.Library;

public interface LibraryService {
	public Library saveLibrary(Library library);
	public List<Library> getAllLibraries();
}