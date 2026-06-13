package com.Loki.Java_Practice.LLD.DesignOfParkingLot;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot findSpot(Vehicle vehicle, List<Floor> floors);
}


