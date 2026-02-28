package com.LMS.LMS.DTO;

import jakarta.validation.constraints.*;
import lombok.Data;

    @Data
    public class BookDTO {

        @NotBlank
        private String bookName;

        @NotBlank
        private String genre;

        @NotBlank
        private String author;
    }

