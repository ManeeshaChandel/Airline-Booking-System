package com.booking.airlinebookingsystem.dto;

public class BookingDTO {
    private int seatNumber;
    private String seatType;
    private int flightId;
    private int userId;

    public BookingDTO() {
    }

    public BookingDTO(int seatNumber, String seatType, int flightId, int userId) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.flightId = flightId;
        this.userId = userId;
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

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "seatNumber=" + seatNumber +
                ", seatType='" + seatType + '\'' +
                ", flightId=" + flightId +
                ", userId=" + userId +
                '}';
    }
}
