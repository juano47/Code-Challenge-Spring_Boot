package com.mediaplayer.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.mediaplayer.service.MultimediaFileService;

@RestController
public class MultimediaFileController {

	@Autowired
	MultimediaFileService multimediaFileService;

	@GetMapping(value = "/multimedia/{id}/times")
	public BigInteger getNumberReproductions(@PathVariable Long id) {

		BigInteger numberReproductions = multimediaFileService.getNumberReproductionsById(id);

		if (numberReproductions.equals(BigInteger.valueOf(-1))) {
			throw new ResponseStatusException((HttpStatus.NOT_FOUND));
		}
		return numberReproductions;
	}
}
