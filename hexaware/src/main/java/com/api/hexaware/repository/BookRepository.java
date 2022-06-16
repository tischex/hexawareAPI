package com.api.hexaware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.api.hexaware.model.Book;

@Repository("bookRepository")
public interface BookRepository extends JpaRepository<Book, Long> {
	@Query(value = "SELECT COUNT(*) FROM BOOK b WHERE b.library_library_id =?1", nativeQuery = true)
	public int countByLibraryId(@Param("library_library_id") int library_library_id);
}
