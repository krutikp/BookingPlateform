package com.booking.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class Screen {

    private String id;
    private String name;
    private List<Seats> seats;

}
