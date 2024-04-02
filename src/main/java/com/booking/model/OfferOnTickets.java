package com.booking.model;

public class OfferOnTickets implements Offers{

    private double offerOnEachThiredTicket = 0.5;

    public double calculatePrice(double price){
        return (price * offerOnEachThiredTicket);
    }

}
