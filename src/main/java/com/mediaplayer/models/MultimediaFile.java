package com.mediaplayer.models;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MultimediaFile")
public class MultimediaFile {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "multimediaFileId")
	private Long multimediaFileId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	private BigInteger numberReproductions;
	
	public Long getId() {
		return multimediaFileId;
	}
	public void setMultimediaFileId(Long multimediaFileId) {
		this.multimediaFileId = multimediaFileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigInteger getNumberReproductions() {
		return numberReproductions;
	}
	public void setNumberReproductions(BigInteger numberReproductions) {
		this.numberReproductions = numberReproductions;
	}	
}
