package com.Loki.Java_Practice.BehaviouralPattern.StatePattern.Problem;

public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        WithoutStatePattern withoutStatePattern = new WithoutStatePattern(TransportationMode.TRAIN);
        withoutStatePattern.setMode(TransportationMode.WALKING);
        withoutStatePattern.getETA();
        withoutStatePattern.getDirections();
    }

}
