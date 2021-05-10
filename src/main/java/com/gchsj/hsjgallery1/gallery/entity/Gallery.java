package com.gchsj.hsjgallery1.gallery.entity;

import com.gchsj.hsjgallery1.common.vo.BasicEntityVo;
import com.gchsj.hsjgallery1.member.entity.Member;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "GALLERY")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Gallery extends BasicEntityVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String text;

    @ManyToOne
    @JoinColumn(name="member_id", insertable = false, updatable = false)
    private Member member;
}
