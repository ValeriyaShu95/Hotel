package com.hotel.booking;

import java.util.concurrent.atomic.AtomicInteger;

public class Room {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int roomId;



    private Integer numberOfPeople;
    private Integer cost;
    private String free;
    private Integer square;

    public Integer getSquare() {
        return square;
    }

    public Room(Integer square) {
        this.square = square;
    }


    public Room(Integer numberOfPeople, Integer cost, String free, Integer square) {
        this.numberOfPeople = numberOfPeople;
        this.cost = cost;
        this.free = free;
        this.square = square;
        this.roomId = count.incrementAndGet();

    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }
}
