package com.booking.airlinebookingsystem.services;

import com.booking.airlinebookingsystem.entities.Flights;
import com.booking.airlinebookingsystem.repositories.FlightRepository;
import org.springframework.stereotype.Component;

@Component
public class AdminService {
    public FlightRepository flightRepository;
    public int addFlight(Flights flight) {
        int id=flight.getId();
        Flights f=flightRepository.findById(id);
        if(f==null){
            flightRepository.save(flight);
            return 0;
        }
        else return 1;
    }
}
