package com.api.hexaware.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.hexaware.model.Library;
import com.api.hexaware.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {
	private LibraryService libraryService;

	public LibraryController(LibraryService libraryService) {
		super();
		this.libraryService = libraryService;
	}
	
	@PostMapping("/newLibrary")
	public ResponseEntity<Library> saveLibrary(@RequestBody Library library) {
		library.toString();
		return new ResponseEntity<Library>(libraryService.saveLibrary(library), HttpStatus.CREATED);
	}
	
	@GetMapping("/libraryList")
	public List<Library> getAllLibraries() {
		return libraryService.getAllLibraries();
	}
}