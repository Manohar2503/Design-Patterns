package com.Loki.Java_Practice.LLD.DesignOfParkingLot;

import java.util.List;

public class ParkingLot {
    private List<Floor> floors;
    private String parkingLotName;
    private ParkingStrategy parkingStrategy;
    private static ParkingLot instance;


    private ParkingLot(String name, List<Floor> floors, ParkingStrategy parkingStrategy){
        this.parkingLotName=name;
        this.floors=floors;
        this.parkingStrategy=parkingStrategy;
    }

    public static ParkingLot getInstance(String parkingLotName, List<Floor> floors, ParkingStrategy strategy) {
        if (instance == null) {
            instance = new ParkingLot(parkingLotName, floors, strategy);
        }
        return instance;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public synchronized Ticket parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = parkingStrategy.findSpot(vehicle, floors);
        if (spot == null) {
            throw new RuntimeException("No available spot for this vehicle");
        }
        spot.parkVehicle(vehicle);
        return new Ticket(vehicle,spot);
    }

    public void removeVehicle(String vehicleNumber) {
        for (Floor floor : floors) {
            for (ParkingSpot spot : floor.getParkingSpots()) {
                if (!spot.isAvailable() &&
                        spot.getVehicle().getVehicleNumber().equals(vehicleNumber)) {
                    floor.releaseSpot(spot);
                    return;
                }
            }
        }
        throw new RuntimeException("Vehicle not found");
    }


}
