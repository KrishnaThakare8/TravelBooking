package com.travel.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.booking.entities.Bus;

public interface BusRepo extends JpaRepository<Bus, Long> {

}
