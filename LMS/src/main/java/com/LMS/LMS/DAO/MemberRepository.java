package com.LMS.LMS.DAO;

import com.LMS.LMS.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface MemberRepository extends JpaRepository<Member
                , Long> {
    }

