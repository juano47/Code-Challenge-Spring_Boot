package com.mediaplayer.service.impl;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.mediaplayer.models.MultimediaFile;
import com.mediaplayer.repository.MultimediaFileRepository;
import com.mediaplayer.service.MultimediaFileService;

@Service
public class MultimediaFileServiceImpl implements MultimediaFileService{
	
	@Autowired
	MultimediaFileRepository multimediaFileRepository;

	@Override
	public BigInteger getNumberReproductionsById(Long id) {
		
		try {
			Optional<MultimediaFile> multimediaFile = multimediaFileRepository.findById(id);
			
			if(!multimediaFile.isPresent()) {
				return BigInteger.valueOf(-1);
			}
			
			return multimediaFile.get().getNumberReproductions();
		}catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
