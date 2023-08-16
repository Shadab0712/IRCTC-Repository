package com.irctc.dto;

import java.io.Serializable;

public class TicketDTO implements Serializable {

	private static final long serialVersionUID = 6661094025604410643L;

	private long ticketId;
	private String name;
	private int age;
	private long mobileNumber;
	private boolean ticketstatus;

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public boolean isTicketstatus() {
		return ticketstatus;
	}

	public void setTicketstatus(boolean ticketstatus) {
		this.ticketstatus = ticketstatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
