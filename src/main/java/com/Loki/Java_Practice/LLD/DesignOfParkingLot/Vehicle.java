package com.Loki.Java_Practice.LLD.DesignOfParkingLot;

public abstract class Vehicle {
    private  String vehicleNumber;
    private vehicleType vehicleType;

    Vehicle(String number, vehicleType type){
        this.vehicleNumber = number;
        this.vehicleType= type;
    }

        public String getVehicleNumber() {
            return vehicleNumber;
        }
    public vehicleType getVehicleType() {
        return vehicleType;
    }

}
