package com.api.hexaware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.hexaware.model.Library;

@Repository("libraryRepository")
public interface LibraryRepository extends JpaRepository<Library, Long> {

}
