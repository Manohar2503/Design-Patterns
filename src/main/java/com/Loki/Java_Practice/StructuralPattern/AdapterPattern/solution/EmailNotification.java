package com.Loki.Java_Practice.StructuralPattern.AdapterPattern.solution;

public class EmailNotification implements Notification {
    @Override
    public void send(String to, String subject, String text) {
        System.out.println("Sendind mail to :"+to);
        System.out.println("what was the reason :"+subject);
        System.out.println("Actual text sending "+text);
    }
}
