package com.booking.model;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
public class Shows {

    private  String showId;
    private  Theatres theatres;
    private  Movies movie;
    private  Screen screen;
    private  Date startTime;
    private  Integer durationInSeconds;

}
