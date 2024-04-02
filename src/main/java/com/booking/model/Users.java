package com.booking.model;

import lombok.Data;

@Data
public class Users {

    private String userId;
    private String name;
    private Contacts contacts;
}
