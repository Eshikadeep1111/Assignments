package com.university.ums.repository;

import com.university.ums.DTO.DepartmentDTO;
import com.university.ums.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("""
        SELECT new com.university.ums.DTO.DepartmentDTO(
            d.name,
            s.name,
            COUNT(c.id)
        )
        FROM Department d
        JOIN d.students s
        JOIN s.courses c
        GROUP BY d.name, s.name
    """)
    List<DepartmentDTO> fetchDepartmentData();
}