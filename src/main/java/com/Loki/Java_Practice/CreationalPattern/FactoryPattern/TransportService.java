package com.Loki.Java_Practice.CreationalPattern.FactoryPattern;

public class TransportService {
    public static void main(String[] args){
        Transport transport = TransportFactory.createTransport("Car");
        transport.deliver();
    }
}
