package com.gchsj.hsjgallery1.gallery.service;

import com.gchsj.hsjgallery1.gallery.repository.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GalleryService {

    @Autowired
    private GalleryRepository galleryRepository;

    @Transactional
    public void findById(Long id) {
        galleryRepository.findById(id);
    }
}
