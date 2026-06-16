package com.Loki.Java_Practice.BehaviouralPattern.ObserverPattern;


import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(float temp);
}

interface Subject{
    void attach(Observer obs);
    void detach(Observer obs);
    void notifyObserver();
}
class WeatherStationIn implements Subject{
    private float temp;
    private List<Observer> list;

    WeatherStationIn(){
        this.list = new ArrayList<>();
    }

    public void setTemperature(float temp) {
        this.temp = temp;
    }

    @Override
    public void attach(Observer obs) {
        list.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        list.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for(Observer ob: list){
            ob.update(temp);
        }
    }
}

class DisplayDevice implements Observer{

    private String device;
    DisplayDevice(String device){
        this.device = device;
    }
    @Override
    public void update(float temp) {
        System.out.println(device +" :"+temp);
    }
}

class MobileDevice implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("Mobile Device temp: "+temp);
    }
}

public class ObserverPatternExample {
    public static void main(String[] args){
        Observer device = new DisplayDevice("samsung");
        MobileDevice mobileDevice = new MobileDevice();
        WeatherStationIn ws = new WeatherStationIn();
        ws.attach(device);
        ws.attach(mobileDevice);

        ws.setTemperature(25);
//        ws.detach(mobileDevice);
        ws.setTemperature(26);
        ws.notifyObserver();

    }
}
