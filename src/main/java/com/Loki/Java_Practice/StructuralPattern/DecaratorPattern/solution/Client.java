package com.Loki.Java_Practice.StructuralPattern.DecaratorPattern.solution;

public class Client {
    public static void main(String[] args){
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);
        pizza = new MushroomDecorator(pizza);

        System.out.println(pizza.description());
        System.out.println(pizza.cost());
    }
}
