package com.Loki.Java_Practice.BehaviouralPattern.StatePattern.Solution;

public class Walking implements TranspotationMode{
    @Override
    public int getETA() {
        System.out.println("ETA value of walking: ");
        return 5;
    }

    @Override
    public String directions() {
        return "Walking Directions: ";
    }
}
