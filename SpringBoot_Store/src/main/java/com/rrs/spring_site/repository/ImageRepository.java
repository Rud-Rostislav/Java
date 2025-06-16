package com.rrs.spring_site.repository;

import com.rrs.spring_site.models.Photo;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Photo, Long> {
}