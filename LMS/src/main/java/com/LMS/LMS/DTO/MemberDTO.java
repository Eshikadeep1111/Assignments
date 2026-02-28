package com.LMS.LMS.DTO;
import jakarta.validation.constraints.*;
import lombok.Data;

    @Data
    public class MemberDTO {

        @NotBlank
        private String name;

        @Email
        private String email;
    }

