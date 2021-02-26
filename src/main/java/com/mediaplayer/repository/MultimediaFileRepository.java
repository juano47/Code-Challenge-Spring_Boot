package com.mediaplayer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mediaplayer.models.MultimediaFile;

@Repository
public interface MultimediaFileRepository extends CrudRepository<MultimediaFile,Long> {

}
