package com.booking.airlinebookingsystem.services;

import com.booking.airlinebookingsystem.entities.Flights;
import com.booking.airlinebookingsystem.entities.Bookings;
import com.booking.airlinebookingsystem.entities.SeatTypes;
import com.booking.airlinebookingsystem.entities.User;
import com.booking.airlinebookingsystem.repositories.BookingRepository;
import com.booking.airlinebookingsystem.repositories.FlightRepository;
import com.booking.airlinebookingsystem.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    public UserRepository userRepository;
    public BookingRepository bookingRepository;
    public FlightRepository flightRepository;
    public int saveData(User user){
        User u= userRepository.findByEmail(user.getEmail());
        if(u==null){
            userRepository.save(user);
            return 0;
        }
        return 1;
    }
    public List<Flights> getFlights(String src, String dest) {
        return flightRepository.getAllFlights(src,dest);
    }
    public int saveBooking(Bookings bookings){
        Bookings b= bookingRepository.findIfBooked(bookings.getFlight(), bookings.getSeatNumber(), bookings.getSeatType());
        if(b==null){
            bookingRepository.save(bookings);
            Flights flight=bookings.getFlight();
            SeatTypes seatTypes=flight.getSeatTypes();
            if(bookings.getSeatType()=="economic"){
                int temp=seatTypes.getAvailableFirstClassSeats(); temp--;
                seatTypes.setAvailableEconomySeats(temp);
            }
            else if(bookings.getSeatType()=="firstClass"){
                int temp= seatTypes.getAvailableFirstClassSeats(); temp--;
                seatTypes.setAvailableFirstClassSeats(temp);
            }
            else if(bookings.getSeatType()=="businessClass") {
                int temp= seatTypes.getAvailableBusinessClassSeats(); temp--;
                seatTypes.setAvailableBusinessClassSeats(temp);
            }
            return 1;
        }
        return 0;
    }


}
