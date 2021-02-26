package com.mediaplayer.service.impl;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.mediaplayer.models.MediaPlayer;
import com.mediaplayer.models.MultimediaFileReproduction;
import com.mediaplayer.repository.MediaPlayerRepository;
import com.mediaplayer.service.MediaPlayerService;

@Service
public class MediaPlayerServiceImpl implements MediaPlayerService {

	@Autowired
	MediaPlayerRepository mediaPlayerRepository;

	@Override
	public BigInteger getNumberReproductionsByPlayerAndMultimediaFile(Long idPlayer, Long idMedia)  {

		try {
			Optional<MediaPlayer> mediaPlayer = mediaPlayerRepository.findById(idPlayer);
	
			if (!mediaPlayer.isPresent()) {
				return BigInteger.valueOf(-1);
			}
	
			Optional<MultimediaFileReproduction> multimediaFileReproductions = mediaPlayer.get()
					.getMultimediaFileReproductions().stream().filter(m -> m.getMultimediaFile().getId().equals(idMedia))
					.findFirst();
	
			if (!multimediaFileReproductions.isPresent()) {
				return BigInteger.valueOf(-1);
			}
	
			return multimediaFileReproductions.get().getNumberReproductions();
		}catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
