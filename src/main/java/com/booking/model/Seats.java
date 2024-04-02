package com.booking.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Seats {

    private String id;
    private int rowNo;
    private int seatNo;
}
