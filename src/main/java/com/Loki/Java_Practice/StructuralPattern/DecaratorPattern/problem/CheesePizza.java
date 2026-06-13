package com.Loki.Java_Practice.StructuralPattern.DecaratorPattern.problem;

public class CheesePizza extends BasicPizza{

    @Override
    public String description() {
        return super.description() + ", cheese";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
