package com.booking.airlinebookingsystem.repositories;

import com.booking.airlinebookingsystem.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,Integer> {
    @Query("Select u from User u where u.email =:e")
    public User findByEmail(@Param("e") String email);


}
