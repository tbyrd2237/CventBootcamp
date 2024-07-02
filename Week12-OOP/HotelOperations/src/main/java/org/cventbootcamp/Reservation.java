package org.cventbootcamp;

public class Reservation {
    public String roomType;
    public double price;
    public int numberOfNights;
    public boolean isWeekend;
    public double reservationTotal = 0.0;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if(roomType.equals("King")){
            price = 139.00;
        }
        else if(roomType.equals("Double")){
            price = 124.00;
        }

        if(isWeekend){
            price = price + (price * 0.10);
        }
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        reservationTotal = numberOfNights * price;
        return reservationTotal;
    }
}
