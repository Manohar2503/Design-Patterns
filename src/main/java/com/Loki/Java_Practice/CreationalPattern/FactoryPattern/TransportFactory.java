package com.Loki.Java_Practice.CreationalPattern.FactoryPattern;

public class TransportFactory {
    public static Transport createTransport(String type){
        switch (type.toLowerCase()){
            case "car":
                return new Car();
            case "bus":
                return new Bus();
            default:
                throw new IllegalArgumentException("Unsupported transport ");
        }

    }
}
