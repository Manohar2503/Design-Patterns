package com.Loki.Java_Practice.LLD.DesignOfParkingLot;

import java.util.List;

public class NearestSpotStrategy implements ParkingStrategy {


    @Override
    public ParkingSpot findSpot(Vehicle vehicle, List<Floor> floors) {
            for(Floor floor : floors){
                ParkingSpot spot = floor.findAvailableSpot(vehicle);
                if(spot != null)
                    return spot;
            }
            return null;
    }
}
