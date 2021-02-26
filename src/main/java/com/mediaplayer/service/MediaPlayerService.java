package com.mediaplayer.service;

import java.math.BigInteger;

public interface MediaPlayerService {

	BigInteger getNumberReproductionsByPlayerAndMultimediaFile(Long idPlayer, Long idMedia);

}
