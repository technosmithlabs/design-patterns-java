package com.technosmithlabs.dp.behavioral.command;

public class Biryani implements Order {
    @Override
    public void takeOrder() {
        System.out.println("Biryani order is taken");
    }
}
