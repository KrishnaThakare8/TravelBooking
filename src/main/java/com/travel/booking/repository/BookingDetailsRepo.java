package com.travel.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.booking.entities.BookingInfo;

public interface BookingDetailsRepo extends JpaRepository<BookingInfo, Long> {

}
