package com.booking.controller;

import com.booking.model.Booking;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BookingController {

    @PostMapping("/create/booking")
    public Booking createBooking(@RequestBody Booking bookingDetails){

        return null;
    }

    @PostMapping("/confirm/booking")
    public Booking confirmBooking(@RequestBody Booking bookingDetails){

        return null;
    }


    
}
