package com.gchsj.hsjgallery1.gallery.entity;

import com.gchsj.hsjgallery1.member.entity.Member;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "GALLERY_REGISTRATION")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GalleryRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "gallery_id")
    private Gallery gallery;
}
