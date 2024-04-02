package com.booking.controller;

import com.booking.model.Location;
import com.booking.model.Screen;
import com.booking.model.Shows;
import com.booking.model.Theatres;
import com.booking.services.LocationService;
import com.booking.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowController {

    @Autowired
    LocationService objLocationService;

    @Autowired
    TheatreService objTheatreService;

    @GetMapping("/fetch/locations")
    public List<Location> fetchLocations(){

        return objLocationService.fetchLocations();
    }

    @GetMapping("/fetch/all/theatres/{city}")
    public List<Theatres>  fetchAllTheatersByLocation(@PathVariable(name = "city") String city){

        return objTheatreService.fetchAllTheatresByCity(city);
    }

    @GetMapping("/fetch/all/shows/{theatreId}")
    public List<Shows> fetchShowsByTheatres(@RequestParam(name = "theatreId") String theatreId){

        return null;
    }

    @PostMapping("/create/show")
    public void createShow(@RequestBody String Shows){

    }

    @PutMapping("/modify/show")
    public void modifyShow(@RequestBody String Shows){

    }

    @DeleteMapping("/remove/show")
    public void removeShow(String showId){

    }

    @GetMapping("/seats/availability/{theatreId}/{showId}/{screenId}")
    public List<Screen>  checkSeatsAvailability(@RequestParam("theatreId") String theatreId,
                                   @RequestParam("showId") String showId,
                                   @RequestParam("screenID") String screenId){

        return null;
    }



}
