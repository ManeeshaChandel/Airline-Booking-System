package com.booking.airlinebookingsystem.entities;

import jakarta.persistence.*;

@Entity
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int seatNumber;
    private String seatType;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flights flight;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors, getters, and setters

    public Bookings() {
    }

    public Bookings(int id, int seatNumber, String seatType, Flights flight, User user) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.flight = flight;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public Flights getFlight() {
        return flight;
    }

    public void setFlight(Flights flight) {
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "id=" + id +
                ", seatNumber=" + seatNumber +
                ", seatType='" + seatType + '\'' +
                ", flight=" + flight +
                ", user=" + user +
                '}';
    }
}
