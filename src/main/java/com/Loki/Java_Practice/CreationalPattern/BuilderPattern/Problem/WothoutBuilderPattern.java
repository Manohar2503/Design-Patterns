package com.Loki.Java_Practice.CreationalPattern.BuilderPattern.Problem;

public class WothoutBuilderPattern {
    public static void main(String[] args){
        House house = new House("concrete", "wood", "Shingles", true, false, false);
        System.out.println(house);
    }
}
