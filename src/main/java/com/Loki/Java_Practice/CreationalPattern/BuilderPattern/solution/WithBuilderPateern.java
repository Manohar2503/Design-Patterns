package com.Loki.Java_Practice.CreationalPattern.BuilderPattern.solution;

public class WithBuilderPateern {
    public static void main(String[] args){
        House house = new House.HouseBuilder("concrete", "wood","Shingles")
                    .setHasGarbage(true)
                    .setHasSwimmingpoll(true)
                    .setHasGarden(false)
                    .build();
        System.out.println(house);
    }
}
