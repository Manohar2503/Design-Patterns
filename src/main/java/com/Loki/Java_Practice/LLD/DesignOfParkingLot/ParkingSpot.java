package com.Loki.Java_Practice.LLD.DesignOfParkingLot;

public class ParkingSpot {
    private int spotId;
    private Vehicle vehicle;
    private boolean isAvailable;
    private SpotType spotType;

    ParkingSpot(int number, SpotType spotType){
        this.isAvailable= false;
        this.spotType=spotType;
        this.spotId=number;
    }
    public boolean isAvailable(){
        return !isAvailable;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        isAvailable=true;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public int getSpotId() {
        return spotId;
    }

    public void removeVehicle(){
        this.vehicle=null;
        isAvailable=false;
    }
    public boolean canFitVehicle(Vehicle vehicle){
        return spotType.name().equals(vehicle.getVehicleType().name());
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
}
