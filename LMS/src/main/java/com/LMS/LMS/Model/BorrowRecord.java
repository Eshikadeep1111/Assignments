package com.LMS.LMS.Model;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class BorrowRecord {
    @Id
    @GeneratedValue
    private Long borrowId;
    private Long memberId;

    @ManyToOne
    @JoinColumn(name = "bId")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "id")
    private Member member;

    private LocalDateTime borrowTime;
    private LocalDateTime returnTime;
}



