package com.Loki.Java_Practice.StructuralPattern.DecaratorPattern.solution;

public class BasicPizza implements Pizza{

    @Override
    public String description() {
        return "Basic Pizza";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
