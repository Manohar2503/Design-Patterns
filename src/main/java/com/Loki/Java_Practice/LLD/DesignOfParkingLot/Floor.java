package com.Loki.Java_Practice.LLD.DesignOfParkingLot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class Floor {
    private int floodId;
    private List<ParkingSpot> parkingSpots;

    private Queue<ParkingSpot> availableCarSpots;
    private Queue<ParkingSpot> availableBikeSpots;
    private Queue<ParkingSpot> availableTruckSpots;

    Floor(int floodId){
        this.floodId=floodId;
        parkingSpots = new ArrayList<>();
        availableCarSpots = new LinkedList<>();
        availableBikeSpots = new LinkedList<>();
        availableTruckSpots = new LinkedList<>();
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
        switch (spot.getSpotType()){
            case CAR :
                availableCarSpots.offer(spot);
                break;
            case BIKE:
                availableBikeSpots.offer(spot);
                break;
            case TRUCK:
                availableTruckSpots.offer(spot);
                break;
        }
    }

    public ParkingSpot findAvailableSpot(Vehicle vehicle){
        switch (vehicle.getVehicleType()){
            case CAR:
                return availableCarSpots.poll();
            case BIKE:
                return availableBikeSpots.poll();
            case TRUCK:
                return availableTruckSpots.poll();
        }
        return null;
    }

    public void releaseSpot(ParkingSpot spot){
        spot.removeVehicle();
        switch (spot.getSpotType()){
            case CAR :
                availableCarSpots.offer(spot);
                break;
            case BIKE:
                availableBikeSpots.offer(spot);
                break;
            case TRUCK:
                availableTruckSpots.offer(spot);
                break;
        }
    }

    public int getFloorNumber() {
        return floodId;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
