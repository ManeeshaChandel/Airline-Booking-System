package com.booking.airlinebookingsystem.controllers;

import com.booking.airlinebookingsystem.entities.Flights;
import com.booking.airlinebookingsystem.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping("/addFlight")
    public ResponseEntity<String> addFlight(@RequestBody Flights flight){
            int response=this.adminService.addFlight(flight);
            if(response==0) return ResponseEntity.status(HttpStatus.CREATED).build();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Flight with given id already exist");
    }


}
