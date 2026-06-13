package com.Loki.Java_Practice.BehaviouralPattern.StatePattern.Solution;

public class Client {
    public static void main(String[] args){
        Service service = new Service(new Car());
        service.setMode1(new Train());
        System.out.println(service.getEtA());
        System.out.println(service.getdirections());

    }



}
