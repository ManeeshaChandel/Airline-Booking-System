package com.booking.airlinebookingsystem.repositories;

import com.booking.airlinebookingsystem.entities.Flights;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FlightRepository extends CrudRepository<Flights,Integer> {
    @Query("Select f from Flights f where f.src =:s and f.dest =:d")
    public List<Flights> getAllFlights(@Param("s") String src, @Param("d")String dest);

    public Flights findById(int id);

}
