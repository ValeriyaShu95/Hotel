package com.hotel.booking;

import java.util.concurrent.atomic.AtomicInteger;

public class Hotel {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int hotelId;

    private String hotelName;
    private Room[] roomsList = new Room[346];

    public Hotel(String hotelName, Room[] roomsList) {
        this.hotelName = hotelName;
        this.roomsList = roomsList;
        this.hotelId = count.incrementAndGet();
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Room[] getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(Room[] roomsList) {
        this.roomsList = roomsList;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }
}
