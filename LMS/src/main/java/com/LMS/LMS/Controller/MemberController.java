package com.LMS.LMS.Controller;

import com.LMS.LMS.DAO.MemberRepository;
import com.LMS.LMS.DTO.MemberDTO;
import com.LMS.LMS.Model.Member;
import jakarta.validation.*;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository repo;

    @PostMapping
    public ResponseEntity<Member> add(
            @Valid
            @RequestBody MemberDTO dto) {

        Member m = new Member(null, dto.getName());

        return ResponseEntity.ok(repo.save(m));
    }

    @GetMapping
    public ResponseEntity<List<Member>> getAll() {
        return ResponseEntity.ok(repo.findAll());
    }
}