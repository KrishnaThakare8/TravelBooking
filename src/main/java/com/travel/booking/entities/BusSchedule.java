package com.travel.booking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BUS_SCHEDULE")
public class BusSchedule {
	
	@Id
	@Column(name="schedule_ID")
	private long scheduleId;
	
	@Column(name="bus_ID")
	private long busId;
	
	@Column(name="Travel_Date")
	private String travelDate;
	
	@Column(name="Location_From")
	private String locationFrom;
	
	@Column(name="Location_To")
	private String locationTo;
	
	@Column(name="Time")
	private String travelTime;
	
	public long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public long getBusId() {
		return busId;
	}
	public void setBusId(long busId) {
		this.busId = busId;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getLocationFrom() {
		return locationFrom;
	}
	public void setLocationFrom(String locationFrom) {
		this.locationFrom = locationFrom;
	}
	public String getLocationTo() {
		return locationTo;
	}
	public void setLocationTo(String locationTo) {
		this.locationTo = locationTo;
	}
	public String getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}
	
	

}
