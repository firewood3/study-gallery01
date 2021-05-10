package com.gchsj.hsjgallery1.member.repository;

import com.gchsj.hsjgallery1.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
