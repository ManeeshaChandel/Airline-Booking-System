package com.booking.airlinebookingsystem.entities;

import jakarta.persistence.*;

@Entity
public class SeatTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int totalEconomySeats;
    private int availableEconomySeats;
    private int totalFirstClassSeats;
    private int availableFirstClassSeats;
    private int totalBusinessClassSeats;
    private int availableBusinessClassSeats;

    @OneToOne(mappedBy = "seatTypes") //mappedBy will create seat_id table in flight
    private Flights flight;

    // Constructors, getters, and setters

    public SeatTypes() {
    }

    public SeatTypes(int id, int totalEconomySeats, int availableEconomySeats, int totalFirstClassSeats, int availableFirstClassSeats, int totalBusinessClassSeats, int availableBusinessClassSeats, Flights flight) {
        this.id = id;
        this.totalEconomySeats = totalEconomySeats;
        this.availableEconomySeats = availableEconomySeats;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.availableFirstClassSeats = availableFirstClassSeats;
        this.totalBusinessClassSeats = totalBusinessClassSeats;
        this.availableBusinessClassSeats = availableBusinessClassSeats;
        this.flight = flight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalEconomySeats() {
        return totalEconomySeats;
    }

    public void setTotalEconomySeats(int totalEconomySeats) {
        this.totalEconomySeats = totalEconomySeats;
    }

    public int getAvailableEconomySeats() {
        return availableEconomySeats;
    }

    public void setAvailableEconomySeats(int availableEconomySeats) {
        this.availableEconomySeats = availableEconomySeats;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public void setTotalFirstClassSeats(int totalFirstClassSeats) {
        this.totalFirstClassSeats = totalFirstClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        return availableFirstClassSeats;
    }

    public void setAvailableFirstClassSeats(int availableFirstClassSeats) {
        this.availableFirstClassSeats = availableFirstClassSeats;
    }

    public int getTotalBusinessClassSeats() {
        return totalBusinessClassSeats;
    }

    public void setTotalBusinessClassSeats(int totalBusinessClassSeats) {
        this.totalBusinessClassSeats = totalBusinessClassSeats;
    }

    public int getAvailableBusinessClassSeats() {
        return availableBusinessClassSeats;
    }

    public void setAvailableBusinessClassSeats(int availableBusinessClassSeats) {
        this.availableBusinessClassSeats = availableBusinessClassSeats;
    }

    public Flights getFlight() {
        return flight;
    }

    public void setFlight(Flights flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "SeatTypes{" +
                "id=" + id +
                ", totalEconomySeats=" + totalEconomySeats +
                ", availableEconomySeats=" + availableEconomySeats +
                ", totalFirstClassSeats=" + totalFirstClassSeats +
                ", availableFirstClassSeats=" + availableFirstClassSeats +
                ", totalBusinessClassSeats=" + totalBusinessClassSeats +
                ", availableBusinessClassSeats=" + availableBusinessClassSeats +
                ", flight=" + flight +
                '}';
    }
}

