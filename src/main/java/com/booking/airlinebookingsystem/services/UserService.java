package com.booking.airlinebookingsystem.services;

import com.booking.airlinebookingsystem.dto.BookingDTO;
import com.booking.airlinebookingsystem.dto.UserDTO;
import com.booking.airlinebookingsystem.entities.Flights;
import com.booking.airlinebookingsystem.entities.Bookings;
import com.booking.airlinebookingsystem.entities.SeatTypes;
import com.booking.airlinebookingsystem.entities.User;
import com.booking.airlinebookingsystem.repositories.BookingRepository;
import com.booking.airlinebookingsystem.repositories.FlightRepository;
import com.booking.airlinebookingsystem.repositories.SeatTypesRepository;
import com.booking.airlinebookingsystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public BookingRepository bookingRepository;
    @Autowired
    public FlightRepository flightRepository;
    @Autowired
    public SeatTypesRepository seatTypesRepository;
    public int saveData(UserDTO userDTO){
        User user=new User();
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
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
    public int saveBooking(BookingDTO bookingDto){
        Bookings bookings=new Bookings();
        bookings.setSeatNumber(bookingDto.getSeatNumber());
        //System.out.println(bookingDto.getSeatType());
        bookings.setSeatType(bookingDto.getSeatType());
        //System.out.println(bookings.getSeatType());
        Flights flight=flightRepository.findById(bookingDto.getFlightId());
        User user=userRepository.findById(bookingDto.getUserId());
        bookings.setUser(user);
        bookings.setFlight(flight);
        Optional<Bookings> b= bookingRepository.findIfBooked(bookings.getFlight(), bookings.getSeatNumber(), bookings.getSeatType());
        //System.out.println(b);
        if(b.isEmpty()){
            Bookings booking=bookingRepository.save(bookings);
            SeatTypes seatTypes=flight.getSeatTypes();
            //System.out.println(seatTypes);
            if(bookings.getSeatType().equals("economy")){
                int temp=seatTypes.getAvailableEconomySeats();
                //System.out.println(temp);
                temp--;
                seatTypes.setAvailableEconomySeats(temp);
                //System.out.println(seatTypes);
                seatTypesRepository.save(seatTypes);
            }
            else if(bookings.getSeatType().equals("firstClass")){
                int temp= seatTypes.getAvailableFirstClassSeats(); temp--;
                seatTypes.setAvailableFirstClassSeats(temp);
                seatTypesRepository.save(seatTypes);
            }
            else if(bookings.getSeatType().equals("businessClass")) {
                int temp= seatTypes.getAvailableBusinessClassSeats(); temp--;
                //System.out.println(seatTypes);
                seatTypes.setAvailableBusinessClassSeats(temp);
                //System.out.println(seatTypes);
                seatTypesRepository.save(seatTypes);
            }
            return 1;
        }
        return 0;
    }


}
