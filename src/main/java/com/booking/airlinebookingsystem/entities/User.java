package com.booking.airlinebookingsystem.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String password;
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) //mappedBy will create user_id table in tickets
    private List<Bookings> tickets;

    @ManyToMany
    @JoinTable(
            name = "user_flights",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "flight_id")
    )
    private List<Flights> flights;

    //constructors and all...

    public User() {
    }

    public User(int id, String name, String password, String email, List<Bookings> tickets, List<Flights> flights) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.tickets = tickets;
        this.flights = flights;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Bookings> getTickets() {
        return tickets;
    }

    public void setTickets(List<Bookings> tickets) {
        this.tickets = tickets;
    }

    public List<Flights> getFlights() {
        return flights;
    }

    public void setFlights(List<Flights> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", tickets=" + tickets +
                ", flights=" + flights +
                '}';
    }
}

