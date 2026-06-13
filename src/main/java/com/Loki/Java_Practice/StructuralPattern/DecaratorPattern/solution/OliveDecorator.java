package com.Loki.Java_Practice.StructuralPattern.DecaratorPattern.solution;

public class OliveDecorator extends PizzaDecorator{

    public OliveDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String description() {
        return decorizedpizza.description() + ", Olive";
    }

    @Override
    public double cost() {
        return decorizedpizza.cost() + 0.5;
    }
}
