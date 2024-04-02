package com.booking.repositories;

import com.booking.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ILocationRepository extends JpaRepository<Location,String> {
}
