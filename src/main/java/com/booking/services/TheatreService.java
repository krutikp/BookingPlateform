package com.booking.services;

import com.booking.model.Theatres;
import com.booking.repositories.ITheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    @Autowired
    ITheatreRepository objITheatreRepository;

    public List<Theatres> fetchAllTheatresByCity(String city){

        return objITheatreRepository.getAllTheatresByCity(city);
    }
}
