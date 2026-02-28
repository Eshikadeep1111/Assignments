package com.LMS.LMS.DAO;

import com.LMS.LMS.Model.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRecordRepository
        extends JpaRepository<BorrowRecord, Long> {
}