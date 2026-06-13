package com.Loki.Java_Practice.StructuralPattern.DecaratorPattern.solution;

public class CheeseDecorator extends PizzaDecorator{
    CheeseDecorator(Pizza pizza){
        super(pizza);
    }


    @Override
    public String description() {
        return decorizedpizza.description() + ", cheese";
    }

    @Override
    public double cost() {
        return decorizedpizza.cost() + 1.0;
    }
}
