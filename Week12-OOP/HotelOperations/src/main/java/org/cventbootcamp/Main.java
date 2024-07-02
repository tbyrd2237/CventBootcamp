package org.cventbootcamp;

public class Main {
    public static void main(String[] args) {
        //Create a New Hotel Room
        Room hotelRoom = new Room(2, 150.00, false, true, false );

        //Get Price
        System.out.println("The Price is: $ " + hotelRoom.getPrice());

        //Create a Reservation
        Reservation tylersReservation = new Reservation("King", 150.00, 3, false, 0.0);
        System.out.println("The Reservation Total is: $ " + tylersReservation.getReservationTotal());
    }
}