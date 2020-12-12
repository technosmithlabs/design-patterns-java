package com.technosmithlabs.dp.behavioral.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Order iceCream = new IceCream();
        Order biryani = new Biryani();
        OrderMaker firstOrder = new OrderMaker(iceCream);
        firstOrder.completeTheOrder();
        OrderMaker secondOrder = new OrderMaker(biryani);
        secondOrder.completeTheOrder();
    }
}
