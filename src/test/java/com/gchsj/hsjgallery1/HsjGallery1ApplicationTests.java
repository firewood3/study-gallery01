package com.gchsj.hsjgallery1;

import com.gchsj.hsjgallery1.gallery.entity.Gallery;
import com.gchsj.hsjgallery1.gallery.repository.GalleryRepository;
import com.gchsj.hsjgallery1.member.entity.Member;
import com.gchsj.hsjgallery1.member.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HsjGallery1ApplicationTests {

    @Autowired
    private GalleryRepository galleryRepository;
    @Autowired
    private MemberRepository memberRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void save() {
        Member user1 = memberRepository.findByUsername("user1");
        System.out.println(user1.toString());
        galleryRepository.save(Gallery.builder().title("제목1").text("내용1").member(user1).build());
//        memberRepository.save(Member.builder().email("gchsj9838@gmail.com").username("user1").build());
    }

}
