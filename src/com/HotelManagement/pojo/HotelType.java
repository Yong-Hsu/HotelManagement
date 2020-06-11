package com.HotelManagement.pojo;


import java.sql.Timestamp;

public class HotelType {

    private long id;
    private long hotelId;
    private String hotelRoomType;
    private long hotelRoomNumber;
    private double hotelPrice;
    private long hotelPeople;
    private java.sql.Timestamp creationDate;
    private java.sql.Timestamp modifyDate;
    private String hotelName;
    private String hotelAddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelRoomType() {
        return hotelRoomType;
    }

    public void setHotelRoomType(String hotelRoomType) {
        this.hotelRoomType = hotelRoomType;
    }

    public long getHotelRoomNumber() {
        return hotelRoomNumber;
    }

    public void setHotelRoomNumber(long hotelRoomNumber) {
        this.hotelRoomNumber = hotelRoomNumber;
    }

    public double getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(double hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public long getHotelPeople() {
        return hotelPeople;
    }

    public void setHotelPeople(long hotelPeople) {
        this.hotelPeople = hotelPeople;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
}
