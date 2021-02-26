package com.mediaplayer.models;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MultimediaFileReproduction")
public class MultimediaFileReproduction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long multimediaFileReproductionId;
	
	@ManyToOne
	@JoinColumn(name = "multimediaFileId")
	private MultimediaFile multimediaFile;
	
    //save the timestamp of each reproduction
	@ElementCollection(targetClass=Date.class)
    private List<Date> timestampReproductions;
    
	private BigInteger numberReproductions;

	public BigInteger getNumberReproductions() {
		return numberReproductions;
	}

	public void setNumberReproductions(BigInteger numberReproductions) {
		this.numberReproductions = numberReproductions;
	}

	public MultimediaFile getMultimediaFile() {
		return multimediaFile;
	}

	public void setMultimediaFile(MultimediaFile multimediaFile) {
		this.multimediaFile = multimediaFile;
	}

	public List<Date> getTimestampReproductions() {
		return timestampReproductions;
	}

	public void setTimestampReproductions(List<Date> timestampReproductions) {
		this.timestampReproductions = timestampReproductions;
	}
	
	
}
