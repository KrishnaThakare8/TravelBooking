package com.travel.booking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buses")
public class Bus {

	@Id
	@Column(name="bus_ID")
	private long busId;
	
	@Column(name="bus_num")
	private String busNum;
	
	@Column(name="bus_capacity")
	private int busCapacity;

	public long getBusId() {
		return busId;
	}

	public void setBusId(long busId) {
		this.busId = busId;
	}

	public String getBusNum() {
		return busNum;
	}

	public void setBusNum(String busNum) {
		this.busNum = busNum;
	}

	public int getBusCapacity() {
		return busCapacity;
	}

	public void setBusCapacity(int busCapacity) {
		this.busCapacity = busCapacity;
	}
	
	
	
}
