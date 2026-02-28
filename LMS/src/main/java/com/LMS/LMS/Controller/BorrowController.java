package com.LMS.LMS.Controller;

import com.LMS.LMS.Model.BorrowRecord;
import com.LMS.LMS.Service.BorrowService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



    @RestController
    @RequestMapping("/borrow")
    @RequiredArgsConstructor
    public class BorrowController {

        private final BorrowService service;

        @PostMapping("/{bookId}/{memberId}")
        public ResponseEntity<BorrowRecord> borrow(
                @PathVariable Long bookId,
                @PathVariable Long memberId) {

            return ResponseEntity.ok(
                    service.borrow(bookId, memberId));
        }

        @PutMapping("/return/{borrowId}")
        public ResponseEntity<BorrowRecord> returnBook(
                @PathVariable Long borrowId) {

            return ResponseEntity.ok(
                    service.returnBook(borrowId));
        }
    }

