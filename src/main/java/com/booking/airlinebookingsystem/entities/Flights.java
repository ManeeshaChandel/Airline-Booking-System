package com.booking.airlinebookingsystem.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Flights {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String src;
    private String dest;
    private int time;

    @OneToOne
    @JoinColumn(name = "seat_types_id")
    private SeatTypes seatTypes;

    @OneToMany(mappedBy = "flight") //mappedBy will create flight_id table in tickets
    private List<Bookings> tickets;

    @ManyToMany(mappedBy = "flights") //a new table will create with user_id and flight_id column for this mapping
    private List<User> users;

    public Flights() {
    }

    public Flights(int id, String name, String src, String dest, int time, SeatTypes seatTypes, List<Bookings> tickets, List<User> users) {
        this.id = id;
        this.name = name;
        this.src = src;
        this.dest = dest;
        this.time = time;
        this.seatTypes = seatTypes;
        this.tickets = tickets;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public SeatTypes getSeatTypes() {
        return seatTypes;
    }

    public void setSeatTypes(SeatTypes seatTypes) {
        this.seatTypes = seatTypes;
    }

    public List<Bookings> getTickets() {
        return tickets;
    }

    public void setTickets(List<Bookings> tickets) {
        this.tickets = tickets;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", src='" + src + '\'' +
                ", dest='" + dest + '\'' +
                ", time=" + time +
                ", seatTypes=" + seatTypes +
                ", tickets=" + tickets +
                ", users=" + users +
                '}';
    }
}
