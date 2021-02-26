package com.mediaplayer.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MediaPlayer")
public class MediaPlayer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mediaPlayerId")
	private Long mediaPlayerId;
	
	private String name;
	private String type;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "multimediaFileReproductionId")
	private List<MultimediaFileReproduction> multimediaFileReproductions;

	public Long getMediaPlayerId() {
		return mediaPlayerId;
	}

	public void setMediaPlayerId(Long mediaPlayerId) {
		this.mediaPlayerId = mediaPlayerId;
	}

	public List<MultimediaFileReproduction> getMultimediaFileReproductions() {
		return multimediaFileReproductions;
	}

	public void setMultimediaFileReproductions(List<MultimediaFileReproduction> multimediaFileReproductions) {
		this.multimediaFileReproductions = multimediaFileReproductions;
	}
	
}