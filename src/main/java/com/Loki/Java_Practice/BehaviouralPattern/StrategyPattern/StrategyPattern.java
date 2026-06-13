package com.Loki.Java_Practice.BehaviouralPattern.StrategyPattern;


interface StrategyMethod{
    void payment();
}

class PaymentService{
    private StrategyMethod method;

    public void setstrategyMethod(StrategyMethod method){
        this.method = method;
    }

    public void methodpayment() {
        method.payment();
    }
}
class Creditcard implements StrategyMethod{

    @Override
    public void payment() {
        System.out.println("Payment method by credit card");
    }
}
class Debitcard implements StrategyMethod{

    @Override
    public void payment() {
        System.out.println("Payment method by debit card");
    }
}

    public class StrategyPattern {
        public static void main(String[] args){
            PaymentService paymentService = new PaymentService();
            Creditcard cd = new Creditcard();
            paymentService.setstrategyMethod(cd);
            paymentService.methodpayment();
            Debitcard db = new Debitcard();
            paymentService.setstrategyMethod(db);
            paymentService.methodpayment();
        }
    }