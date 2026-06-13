package com.Loki.Java_Practice.BehaviouralPattern.StatePattern.Solution;

public class Train implements TranspotationMode{
    public int getETA() {
        System.out.println("ETA value of Train: ");
        return 3;
    }

    @Override
    public String directions() {
        return "Train Directions: ";
    }
}
