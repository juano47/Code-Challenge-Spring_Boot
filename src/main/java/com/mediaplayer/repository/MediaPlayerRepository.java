package com.mediaplayer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mediaplayer.models.MediaPlayer;

@Repository
public interface MediaPlayerRepository extends CrudRepository<MediaPlayer, Long>{

}
