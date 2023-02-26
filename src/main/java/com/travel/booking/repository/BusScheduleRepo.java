package com.travel.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.travel.booking.entities.BusSchedule;

public interface BusScheduleRepo extends JpaRepository<BusSchedule, Long> {

	@Query(value = "from BusSchedule where travelDate = :travelDate "
			+ "and locationFrom = :locationFrom and locationTo = :locationTo")
	public List<BusSchedule> findBusbyTimeAndLocation(@Param("travelDate") String travelDate,
			@Param("locationFrom") String locationFrom, @Param("locationTo") String locationTo);

//	@Query(value="from BusSchedule where "
//			+ " locationFrom = :locationFrom and locationTo = :locationTo")
//	public List<BusSchedule> findBusbyTimeAndLocation(
//            @Param("locationFrom") String locationFrom, @Param("locationTo") String locationTo);

}
