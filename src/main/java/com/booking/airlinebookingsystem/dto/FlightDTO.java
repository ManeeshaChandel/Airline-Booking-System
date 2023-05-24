package com.booking.airlinebookingsystem.dto;

import com.booking.airlinebookingsystem.entities.SeatTypes;
import jakarta.persistence.*;

public class FlightDTO {
    private String name;
    private String src;
    private String dest;
    private int time;

    private int totalEconomySeats;
    private int availableEconomySeats;
    private int totalFirstClassSeats;
    private int availableFirstClassSeats;
    private int totalBusinessClassSeats;
    private int availableBusinessClassSeats;

    public FlightDTO() {
    }

    public FlightDTO(String name, String src, String dest, int time, int totalEconomySeats, int availableEconomySeats, int totalFirstClassSeats, int availableFirstClassSeats, int totalBusinessClassSeats, int availableBusinessClassSeats) {
        this.name = name;
        this.src = src;
        this.dest = dest;
        this.time = time;
        this.totalEconomySeats = totalEconomySeats;
        this.availableEconomySeats = availableEconomySeats;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.availableFirstClassSeats = availableFirstClassSeats;
        this.totalBusinessClassSeats = totalBusinessClassSeats;
        this.availableBusinessClassSeats = availableBusinessClassSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
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

    @Override
    public String toString() {
        return "FlightDTO{" +
                "name='" + name + '\'' +
                ", src='" + src + '\'' +
                ", dest='" + dest + '\'' +
                ", time=" + time +
                ", totalEconomySeats=" + totalEconomySeats +
                ", availableEconomySeats=" + availableEconomySeats +
                ", totalFirstClassSeats=" + totalFirstClassSeats +
                ", availableFirstClassSeats=" + availableFirstClassSeats +
                ", totalBusinessClassSeats=" + totalBusinessClassSeats +
                ", availableBusinessClassSeats=" + availableBusinessClassSeats +
                '}';
    }
}
