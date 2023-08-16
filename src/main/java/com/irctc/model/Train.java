package com.irctc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Train {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private long trainId;
	private String trainName;
	private String fromCity;
	private String toCity;
	private int vacantSeats;

	public long getTrainId() {
		return trainId;
	}

	public void setTrainId(long trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public int getVacantSeats() {
		return vacantSeats;
	}

	public void setVacantSeats(int vacantSeats) {
		this.vacantSeats = vacantSeats;
	}

}
