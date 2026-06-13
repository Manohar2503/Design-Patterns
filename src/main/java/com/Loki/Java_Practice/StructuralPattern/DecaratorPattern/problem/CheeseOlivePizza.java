package com.Loki.Java_Practice.StructuralPattern.DecaratorPattern.problem;

public class CheeseOlivePizza extends CheesePizza{
    @Override
    public String description() {
        return super.description() + ", Olive";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
