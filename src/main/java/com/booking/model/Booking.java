package com.booking.model;

import lombok.Data;
import lombok.Getter;

@Data
public class Booking {

    private  String id;
    private  Shows show;
    private  Users user;

}
