package com.booking.services;

import com.booking.model.Location;
import com.booking.repositories.ILocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    ILocationRepository objLocationRepository;

    public List<Location> fetchLocations(){
        return objLocationRepository.findAll(Sort.by("city"));
    }
}
