package com.irctc.dto;

import java.io.Serializable;

public class TrainDTO implements Serializable {

	private static final long serialVersionUID = -5874514538904112024L;
	
	private long trainId;
	private String trainname;
	private String fromCity;
	private String toCity;
	private int vacantSeats;

	public long getTrainId() {
		return trainId;
	}

	public void setTrainId(long trainId) {
		this.trainId = trainId;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
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
