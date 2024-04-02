package com.booking.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Locations")
public class Location {

    @Id
    @Column(name="location_id")
    @GenericGenerator(name="uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "uuid2")
    public String id;

    @Column(name="location_city")
    public String city;
}
