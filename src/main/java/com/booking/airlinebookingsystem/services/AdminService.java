package com.booking.airlinebookingsystem.services;

import com.booking.airlinebookingsystem.dto.FlightDTO;
import com.booking.airlinebookingsystem.entities.Flights;
import com.booking.airlinebookingsystem.entities.SeatTypes;
import com.booking.airlinebookingsystem.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AdminService {
    @Autowired
    public FlightRepository flightRepository;
    public int addFlight(FlightDTO flightDTO) {
        Flights flight=new Flights();
        flight.setName(flightDTO.getName());
        flight.setSrc(flightDTO.getSrc());
        flight.setDest(flightDTO.getDest());
        flight.setTime(flightDTO.getTime());
        SeatTypes seatTypes=new SeatTypes();
        seatTypes.setTotalEconomySeats(flightDTO.getTotalEconomySeats());
        seatTypes.setAvailableEconomySeats(flightDTO.getAvailableEconomySeats());
        seatTypes.setTotalBusinessClassSeats(flightDTO.getTotalBusinessClassSeats());
        seatTypes.setAvailableBusinessClassSeats(flightDTO.getAvailableBusinessClassSeats());
        seatTypes.setAvailableFirstClassSeats(flightDTO.getAvailableFirstClassSeats());
        seatTypes.setTotalFirstClassSeats(flightDTO.getTotalFirstClassSeats());
        flight.setSeatTypes(seatTypes);
        int id = flight.getId();
        Optional<Flights> existingFlight = Optional.ofNullable(flightRepository.findById(id));
        if (existingFlight.isEmpty()) {
            Flights result=flightRepository.save(flight);
            return 0;
        } else {
            return 1;
        }
    }
}
