package com.mediaplayer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mediaplayer.models.MediaPlayer;
import com.mediaplayer.models.MultimediaFile;
import com.mediaplayer.models.MultimediaFileReproduction;
import com.mediaplayer.repository.MediaPlayerRepository;
import com.mediaplayer.repository.MultimediaFileRepository;

@Component
public class DummyData {
	
	@Autowired
	MultimediaFileRepository multimediaFileRepository;
	
	@Autowired
	MediaPlayerRepository mediaPlayerRepository;

	public void loadDataBaseDummyData() {

		MultimediaFile multimediaFile1 = new MultimediaFile();
		multimediaFile1.setName("file 1");
		multimediaFile1.setNumberReproductions(BigInteger.valueOf(100));
		multimediaFileRepository.save(multimediaFile1);

		MultimediaFile multimediaFile2 = new MultimediaFile();
		multimediaFile2.setName("file 2");
		multimediaFile2.setNumberReproductions(BigInteger.valueOf(200));
		multimediaFileRepository.save(multimediaFile2);

		MultimediaFile multimediaFile3 = new MultimediaFile();
		multimediaFile3.setName("file 3");
		multimediaFile3.setNumberReproductions(BigInteger.valueOf(500));
		multimediaFileRepository.save(multimediaFile3);

		MultimediaFile multimediaFile4 = new MultimediaFile();
		multimediaFile4.setName("file 4");
		multimediaFile4.setNumberReproductions(BigInteger.valueOf(700));
		multimediaFileRepository.save(multimediaFile4);
		
		MediaPlayer mediaPlayer1 = new MediaPlayer();
		MultimediaFileReproduction m1 = new MultimediaFileReproduction();
		m1.setNumberReproductions(BigInteger.valueOf(1000));
		m1.setMultimediaFile(multimediaFile1);
		List<MultimediaFileReproduction> list1 = new ArrayList<MultimediaFileReproduction>();
		list1.add(m1);
		mediaPlayer1.setMultimediaFileReproductions(list1);
		mediaPlayerRepository.save(mediaPlayer1);
	}
}
