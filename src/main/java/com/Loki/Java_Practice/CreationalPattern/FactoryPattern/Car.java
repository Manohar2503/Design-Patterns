package com.Loki.Java_Practice.CreationalPattern.FactoryPattern;

public class Car implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by car");
    }
}
