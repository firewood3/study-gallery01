package com.gchsj.hsjgallery1.gallery.repository;

import com.gchsj.hsjgallery1.gallery.entity.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long> {
}
