package com.LMS.LMS.Controller;

import com.LMS.LMS.DTO.BookDTO;
import com.LMS.LMS.Model.Book;
import com.LMS.LMS.Service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
//@RequiredArgsConstructor
public class BookController {

    @Autowired
    private  BookService service;

    @PostMapping
    public ResponseEntity<Book> create(
            @Valid @RequestBody BookDTO dto) {

        return ResponseEntity.ok(service.create(dto));
    }

    @GetMapping("/getBooks")
    public ResponseEntity<List<Book>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/getBook/{id}")
    public ResponseEntity<Book> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }
}

