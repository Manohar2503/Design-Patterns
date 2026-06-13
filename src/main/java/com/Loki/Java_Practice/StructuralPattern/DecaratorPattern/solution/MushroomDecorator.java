package com.Loki.Java_Practice.StructuralPattern.DecaratorPattern.solution;

public class MushroomDecorator extends PizzaDecorator{
    MushroomDecorator(Pizza pizza){
        super(pizza);
    }


    @Override
    public String description() {
        return decorizedpizza.description() + ", Mushroom";
    }

    @Override
    public double cost() {
        return decorizedpizza.cost() + 2.5;
    }
}
