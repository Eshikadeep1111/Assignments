package com.LMS.LMS.DAO;
import com.LMS.LMS.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}