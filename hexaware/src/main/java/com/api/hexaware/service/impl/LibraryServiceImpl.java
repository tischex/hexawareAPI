package com.api.hexaware.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.api.hexaware.model.Library;
import com.api.hexaware.repository.LibraryRepository;
import com.api.hexaware.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	private LibraryRepository libraryRepository;
	
	public LibraryServiceImpl(LibraryRepository libraryRepository) {
		super();
		this.libraryRepository = libraryRepository;
	}

	@Override
	public Library saveLibrary(Library library) {
		return libraryRepository.save(library);
	}

	@Override
	public List<Library> getAllLibraries() {
		return libraryRepository.findAll();
	}
}