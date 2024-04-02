package com.booking.model;

public class OfferOnShowTime  implements Offers{

    private double  discount =0.20;

    @Override
    public double calculatePrice(double price){
        return (price * discount);
    }
}
