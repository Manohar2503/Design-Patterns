package com.Loki.Java_Practice.BehaviouralPattern.StatePattern.Solution;

public class Car implements TranspotationMode{

    @Override
    public int getETA() {
        System.out.println("ETA value of car: ");
        return 10;
    }

    @Override
    public String directions() {
        return "Car Directions: ";
    }
}
