package com.university.ums.controller;

import com.university.ums.DTO.DepartmentDTO;
import com.university.ums.service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departments")

public class UniversityController {

    private final UniversityService service;

    @GetMapping
    public List<DepartmentDTO> getDepartments() {
        return service.getUniversityData();
    }
}
