package com.technosmithlabs.dp.behavioral.command;

public class OrderMaker {

    private Order order;

    public OrderMaker(Order order) {
        this.order = order;
    }

    public void completeTheOrder() {
        this.order.takeOrder();
        System.out.println("Order is completed");
    }
}
