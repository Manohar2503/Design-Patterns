package com.Loki.Java_Practice.BehaviouralPattern.ObserverPattern;

class DisplayDesign{
    public void display(float temp){
        System.out.println("Current Temp:"+temp+"c");
    }
}

class WeatherStation{
    private float temparature;
    private DisplayDesign design;

    WeatherStation(DisplayDesign design){
        this.design= design;
    }

    public void setTemparature(float temp){
        this.temparature = temp;
        display();
    }

    public void display() {
        design.display(temparature);
    }
}

public class WeatherObserverPattern {

    public static  void main(String[] args){
        DisplayDesign dd = new DisplayDesign();
        WeatherStation weatherStation = new WeatherStation(dd);

        weatherStation.setTemparature(26);
        weatherStation.setTemparature(40);
    }
}
