package com.booking.airlinebookingsystem.repositories;

import com.booking.airlinebookingsystem.entities.Flights;
import com.booking.airlinebookingsystem.entities.Bookings;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookingRepository extends CrudRepository<Bookings,Integer> {
    List<Bookings> findByUserId(int userId);
    @Query("Select b from Bookings b where b.flight = :flight AND b.seatNumber = :seatNumber AND b.seatType = :seatType")
    public Bookings findIfBooked(@Param("flight") Flights flight,
                                 @Param("seatNumber") int seatNumber,
                                 @Param("seatType") String seatType);
//    @Query("SELECT CASE WHEN COUNT(t) > 0 THEN TRUE ELSE FALSE END " +
//            "FROM Tickets t " +
//            "WHERE t.flight = :flight AND t.seatNumber = :seatNumber AND t.seatType = :seatType")
}
