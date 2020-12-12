package com.technosmithlabs.dp.behavioral.command;

public class IceCream implements Order {
    @Override
    public void takeOrder() {
        System.out.println("Ice Cream order is taken");
    }
}
