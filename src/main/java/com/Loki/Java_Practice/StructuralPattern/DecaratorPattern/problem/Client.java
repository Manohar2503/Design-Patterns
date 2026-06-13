package com.Loki.Java_Practice.StructuralPattern.DecaratorPattern.problem;

public class Client {
    public static void main(String[] args){
        Pizza cheeseOlivePizza = new CheeseOlivePizza();
        System.out.println(cheeseOlivePizza.description());
        System.out.println(cheeseOlivePizza.cost());
    }
}
