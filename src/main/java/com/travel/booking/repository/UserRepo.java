package com.travel.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.booking.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
