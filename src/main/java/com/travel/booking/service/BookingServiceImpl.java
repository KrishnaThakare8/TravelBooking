package com.travel.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travel.booking.entities.BookingInfo;
import com.travel.booking.entities.Bus;
import com.travel.booking.entities.BusSchedule;
import com.travel.booking.entities.FindBusQryParam;
import com.travel.booking.entities.User;
import com.travel.booking.repository.BookingDetailsRepo;
import com.travel.booking.repository.BusRepo;
import com.travel.booking.repository.BusScheduleRepo;
import com.travel.booking.repository.UserRepo;

@Component
public class BookingServiceImpl implements BookingService {

	@Autowired
	UserRepo bookingRepo;
	
	@Autowired
	BusRepo busRepo;
	
	@Autowired
	BusScheduleRepo busScheduleRepo;
	
	@Autowired
	BookingDetailsRepo bookingDetailsRepo;
	
	@Override
	public List<User> getAllUsers() {
		return bookingRepo.findAll();
	}

	@Override
	public void addUser(User user) {
		bookingRepo.save(user);
	}

	@Override
	public List<Bus> getAllBuses() {
		return busRepo.findAll();
	}

	@Override
	public void addBus(Bus bus) {
		busRepo.save(bus);
	}

	@Override
	public List<BusSchedule> getBusSchedules() {
		return busScheduleRepo.findAll();
	}

	@Override
	public void addBusSchedule(BusSchedule busSchedule) {
		busScheduleRepo.save(busSchedule);
	}

	@Override
	public List<BookingInfo> getBookingDetails() {
		return bookingDetailsRepo.findAll();
	}

	@Override
	public void bookTicket(BookingInfo bookingInfo) {
		bookingDetailsRepo.save(bookingInfo);
	}

	@Override
	public List<BusSchedule> findBusbyTimeAndLocation(FindBusQryParam qryParam) {
		return busScheduleRepo.findBusbyTimeAndLocation(qryParam.getTravelDate(),
				qryParam.getLocationFrom(), qryParam.getLocationTo());
	}

}
