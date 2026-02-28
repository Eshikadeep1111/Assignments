package com.LMS.LMS.Model;
import jakarta.persistence.*;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.annotation.*;

@Data
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long bId;

    private String bookname;
    private String author;
    private boolean genre;
}

