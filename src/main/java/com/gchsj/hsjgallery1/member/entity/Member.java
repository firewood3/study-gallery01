package com.gchsj.hsjgallery1.member.entity;

import com.gchsj.hsjgallery1.common.vo.BasicEntityVo;
import com.gchsj.hsjgallery1.gallery.entity.GalleryRegistration;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MEMBER")
@Setter
@Getter
@ToString
@NoArgsConstructor
@Builder
public class Member extends BasicEntityVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String nickname;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private List<GalleryRegistration> galleryRegistrations = new ArrayList<>();
}
