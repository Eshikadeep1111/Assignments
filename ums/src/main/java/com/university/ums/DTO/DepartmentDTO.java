package com.university.ums.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {

    private String departmentName;
    private String studentName;
    private Long coursesCount;   // ⚠ MUST be Long
}