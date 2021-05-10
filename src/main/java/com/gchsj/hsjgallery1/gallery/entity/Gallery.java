package com.gchsj.hsjgallery1.gallery.entity;

import com.gchsj.hsjgallery1.common.vo.BasicEntityVo;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GALLERY")
@Setter
@Getter
@ToString
@NoArgsConstructor
@Builder
public class Gallery extends BasicEntityVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String text;

    @OneToMany(mappedBy = "gallery", fetch = FetchType.LAZY)
    private List<GalleryRegistration> galleryRegistrations = new ArrayList<>();
}
