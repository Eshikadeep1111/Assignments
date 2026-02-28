package com.LMS.LMS.Service;
import com.LMS.LMS.DAO.BookRepository;
import com.LMS.LMS.DTO.BookDTO;
import com.LMS.LMS.Model.Book;
import lombok.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {


    private final BookRepository repo;

    public Book create(BookDTO dto) {

        Book book = new Book();
        book.setBookname(dto.getBookName());
        book.setGenre(Boolean.parseBoolean(dto.getGenre()));
        book.setAuthor(dto.getAuthor());

        return repo.save(book);
    }

    public List<Book> getAll() {
        return repo.findAll();
    }

    public Book getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }
}