package com.Loki.Java_Practice.BehaviouralPattern.StrategyPattern;
class PaymentPattern{
    public void payment(String method){
        if(method.equals("Credit Card")){
            System.out.println("payment method by credit card");
        }
        else if(method.equals("Debit Card")){
            System.out.println("payment method by dredit card");
        }
        else {
            System.out.println("Unsupported Payment Method");
        }
    }

}
public class WithoutStrategyPattern {

    public static void main(String[] args){
        PaymentPattern pp = new PaymentPattern();
        pp.payment("Debit Card");
        pp.payment("Credit Card");
    }

}
