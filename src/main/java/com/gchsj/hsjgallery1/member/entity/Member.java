package com.gchsj.hsjgallery1.member.entity;

import com.gchsj.hsjgallery1.common.vo.BasicEntityVo;
import com.gchsj.hsjgallery1.gallery.entity.Gallery;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MEMBER")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, exclude = "galleries")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Member extends BasicEntityVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String nickname;

    @OneToMany
    @JoinColumn(name = "member_id")
    private List<Gallery> galleries = new ArrayList<>();
}
