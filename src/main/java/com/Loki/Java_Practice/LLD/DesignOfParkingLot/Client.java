package com.Loki.Java_Practice.LLD.DesignOfParkingLot;

import java.util.ArrayList;
import java.util.List;

import static com.Loki.Java_Practice.LLD.DesignOfParkingLot.vehicleType.*;

public class Client {
    public static void main(String[] args){
        Vehicle car1 = new Car("CAR-101", CAR);
        Vehicle car2 = new Car("CAR-102", CAR);
        Vehicle bike1 = new BIke("BIKE-101", BIKE);
        Vehicle truck1 = new Truck("TRUCK-101", TRUCK);

        // ===== FLOOR 1 =====
        Floor floor1 = new Floor(1);

        floor1.addParkingSpot(
                new ParkingSpot(1, SpotType.CAR));

        floor1.addParkingSpot(
                new ParkingSpot(2, SpotType.CAR));

        floor1.addParkingSpot(
                new ParkingSpot(3, SpotType.BIKE));


        // ===== FLOOR 2 =====
        Floor floor2 = new Floor(2);

        floor2.addParkingSpot(
                new ParkingSpot(4, SpotType.CAR));

        floor2.addParkingSpot(
                new ParkingSpot(5, SpotType.BIKE));

        floor2.addParkingSpot(
                new ParkingSpot(6, SpotType.TRUCK));


        // ===== FLOOR 3 =====
        Floor floor3 = new Floor(3);

        floor3.addParkingSpot(
                new ParkingSpot(7, SpotType.CAR));

        floor3.addParkingSpot(
                new ParkingSpot(8, SpotType.TRUCK));

        floor3.addParkingSpot(
                new ParkingSpot(9, SpotType.TRUCK));

        List<Floor> floors = new ArrayList<>();
        floors.add(floor1);
        floors.add(floor2);
        floors.add(floor3);

        // Strategy
        ParkingStrategy strategy = new NearestSpotStrategy();

        // Parking Lot
        ParkingLot parkingLot = ParkingLot.getInstance("Loki Parking Lot", floors, strategy);

        // Park Vehicles
        Ticket ticket1 = parkingLot.parkVehicle(car1);

        Ticket ticket2 = parkingLot.parkVehicle(car2);

        Ticket ticket3 = parkingLot.parkVehicle(bike1);

        Ticket ticket4 = parkingLot.parkVehicle(truck1);


        // Print Tickets
        System.out.println(ticket1);
        System.out.println();

        System.out.println(ticket2);
        System.out.println();

        System.out.println(ticket3);
        System.out.println();

        System.out.println(ticket4);
    }
}
