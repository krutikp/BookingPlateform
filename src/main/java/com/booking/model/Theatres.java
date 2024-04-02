package com.booking.model;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="theatres")
public class Theatres {

    @Id
    @GenericGenerator(name="uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "uuid2")
    @Column(name = "theatre_id")
    private  String id;

    @Column(name="theatre_name")
    private  String name;

    @OneToOne
    @JoinColumn(name="location_id")
    private  Location location;
}