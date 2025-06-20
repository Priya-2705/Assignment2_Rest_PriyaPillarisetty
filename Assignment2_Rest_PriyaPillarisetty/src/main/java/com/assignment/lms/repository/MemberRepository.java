package com.assignment.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.lms.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
