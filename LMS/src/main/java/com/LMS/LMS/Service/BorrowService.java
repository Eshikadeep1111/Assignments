package com.LMS.LMS.Service;

import com.LMS.LMS.DAO.BookRepository;
import com.LMS.LMS.DAO.MemberRepository;
import com.LMS.LMS.DAO.BorrowRecordRepository;
import com.LMS.LMS.Model.Book;
import com.LMS.LMS.Model.Member;
import com.LMS.LMS.Model.BorrowRecord;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BorrowService {

    private final BorrowRecordRepository borrowRepo;
    private final BookRepository bookRepo;
    private final MemberRepository memberRepo;


    public BorrowRecord borrow(Long bookId, Long memberId) {

        Book book = bookRepo.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        Member member = memberRepo.findById(memberId)
                .orElseThrow(() -> new RuntimeException("Member not found"));



        BorrowRecord record = new BorrowRecord();
        record.setBook(book);
        record.setMember(member);
        record.setBorrowTime(LocalDateTime.now());

        return borrowRepo.save(record);
    }

    public BorrowRecord returnBook(Long borrowId) {

        BorrowRecord record = borrowRepo.findById(borrowId)
                .orElseThrow(() -> new RuntimeException("Record not found"));

        record.setReturnTime(LocalDateTime.now());

        return borrowRepo.save(record);
    }
}