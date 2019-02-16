package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows-1);

        for(char row = 'A'; row <= lastRow; row++) {
            for(int seatNum =1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNum) {

    // Same Code using java collections and using binary search of collection
        Seat requestedSeat = new Seat(seatNum);
        int foundSeat = Collections.binarySearch(seats, seatNum, null);
        if(foundSeat >=0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("No Such seat " + seatNum);
            return false;
        }

        // code without using collection and liner search applied
//        Seat requestedSeat = null;
//        for (Seat seat : seats) {
//            if(seat.getSeatNumber().equals(seatNum)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if(requestedSeat == null) {
//            System.out.println("No such seat with number " + seatNum);
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    public boolean cancelSeat(String seatNum) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNum)) {
                requestedSeat = seat;
                break;
            }
        }
        if(requestedSeat == null) {
            System.out.println("No such seat with number " + seatNum);
            return false;
        }
        return requestedSeat.cancel();
    }

    public void getSeats() {
        for(Seat seat: seats) {
            System.out.println(seat.getSeatNumber());
        }
    }
}
