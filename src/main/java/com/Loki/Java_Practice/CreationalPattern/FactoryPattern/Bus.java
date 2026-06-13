package com.Loki.Java_Practice.CreationalPattern.FactoryPattern;

public class Bus implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by Bus");
    }
}
