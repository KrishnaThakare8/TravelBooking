package com.travel.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.booking.entities.BookingInfo;
import com.travel.booking.entities.Bus;
import com.travel.booking.entities.BusSchedule;
import com.travel.booking.entities.FindBusQryParam;
import com.travel.booking.entities.User;
import com.travel.booking.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService bookingServ;
	
	@GetMapping("getUsers")
	public List<User> getAllUsers() {
		return bookingServ.getAllUsers();
	}
	
	@PostMapping("register-user")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		bookingServ.addUser(user);
		
		return new ResponseEntity<>("User saved successfully", HttpStatus.OK);
	}
	
	@GetMapping("getBuses")
	public List<Bus> getBuses() {
		return bookingServ.getAllBuses();
	}
	
	@PostMapping("add-bus")
	public ResponseEntity<String> getAllUsers(@RequestBody Bus bus) {
		bookingServ.addBus(bus);;
		
		return new ResponseEntity<>("Bus saved successfully", HttpStatus.OK);
	}
	
	@GetMapping("getBusSchedules")
	public List<BusSchedule> getBusSchedules() {
		return bookingServ.getBusSchedules();
	}
	
	@PostMapping("add-bus-schedule")
	public ResponseEntity<String> addBusSchedule(@RequestBody BusSchedule busSch) {
		bookingServ.addBusSchedule(busSch);
		
		return new ResponseEntity<>("BusSchedule saved successfully", HttpStatus.OK);
	}
	
	@GetMapping("getBookingDetails")
	public List<BookingInfo> getBookingDetails() {
		return bookingServ.getBookingDetails();
	}
	
	@PostMapping("book-ticket")
	public ResponseEntity<String> bookTicket(@RequestBody BookingInfo bookingInfo) {
		bookingServ.bookTicket(bookingInfo);
		
		return new ResponseEntity<>("Ticket booked successfully", HttpStatus.OK);
	}
	
	
	@GetMapping("findBusbyTimeAndLocation")
	public List<BusSchedule> findBusbyTimeAndLocation(@RequestBody FindBusQryParam qryParam) {
		return bookingServ.findBusbyTimeAndLocation(qryParam);
	}
}
