package com.Loki.Java_Practice.StructuralPattern.DecaratorPattern.solution;

public class PizzaDecorator implements Pizza{

    protected Pizza decorizedpizza;

    public PizzaDecorator(Pizza pizza){
        this.decorizedpizza = pizza;
    }

    public PizzaDecorator() {
    }

    @Override
    public String description() {
        return decorizedpizza.description();
    }

    @Override
    public double cost() {
        return decorizedpizza.cost();
    }
}
