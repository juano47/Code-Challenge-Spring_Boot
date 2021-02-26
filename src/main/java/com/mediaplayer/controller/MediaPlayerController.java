package com.mediaplayer.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.mediaplayer.service.MediaPlayerService;

@RestController
public class MediaPlayerController {

	@Autowired
	MediaPlayerService mediaPlayerService;

	@GetMapping(value = "/players/{idPlayer}/multimedia/{idMedia}")
	public BigInteger getNumberReproductions(@PathVariable Long idPlayer, @PathVariable Long idMedia) {

		BigInteger numberReproductions;

		numberReproductions = mediaPlayerService.getNumberReproductionsByPlayerAndMultimediaFile(idPlayer, idMedia);

		if (numberReproductions.equals(BigInteger.valueOf(-1))) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return numberReproductions;
	}
}
