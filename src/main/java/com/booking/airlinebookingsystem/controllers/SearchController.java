package com.booking.airlinebookingsystem.controllers;

import com.booking.airlinebookingsystem.entities.Flights;
import com.booking.airlinebookingsystem.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {
    @Autowired
    private FlightService flightService;
    @GetMapping("/searchFlight/{src}/{dest}")
    public ResponseEntity<List<Flights>> GetFlights(@PathVariable("src") String src, @PathVariable("dest") String dest){
        List<Flights> list= flightService.getFlights(src,dest);
        if(list.size()==0) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }
}
