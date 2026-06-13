package com.Loki.Java_Practice.StructuralPattern.AdapterPattern.solution;

import com.Loki.Java_Practice.StructuralPattern.AdapterPattern.solution.Notification;

public class SendGridAdapter implements Notification {

    private SendGridService service;

    SendGridAdapter(SendGridService service){
        this.service =service;
    }
    @Override
    public void send(String to, String subject, String text) {
        service.sendEmail(to, subject, text);
    }
}
