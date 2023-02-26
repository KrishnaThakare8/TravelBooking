package com.travel.booking.service;

import java.util.List;

import com.travel.booking.entities.BookingInfo;
import com.travel.booking.entities.Bus;
import com.travel.booking.entities.BusSchedule;
import com.travel.booking.entities.FindBusQryParam;
import com.travel.booking.entities.User;

public interface BookingService {


	public List<User> getAllUsers();
	
	public void addUser(User user);
	
	public List<Bus> getAllBuses();
	
	public void addBus(Bus bus);
	
	public List<BusSchedule> getBusSchedules();
	
	public void addBusSchedule(BusSchedule busSchedule);
	
	public List<BookingInfo> getBookingDetails();
	
	public void bookTicket(BookingInfo bookingInfo);
	
	public List<BusSchedule> findBusbyTimeAndLocation(FindBusQryParam qryParam);
			
	
}
