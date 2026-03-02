package com.university.ums.service;

import com.university.ums.DTO.*;
import com.university.ums.*;
import com.university.ums.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class UniversityService {

    private final DepartmentRepository departmentRepository;

    public List<DepartmentDTO> getUniversityData() {
        return departmentRepository.fetchDepartmentData();
    }
}
