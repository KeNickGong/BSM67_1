package com.demo.inject;

public class EmailService implements Service{
    @Override
    public boolean send(String msg) {
        System.out.println("From Email Send");
        return true;
    }
}
