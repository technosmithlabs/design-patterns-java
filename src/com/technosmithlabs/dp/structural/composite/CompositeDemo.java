package com.technosmithlabs.dp.structural.composite;

public class CompositeDemo {
    public static void main(String args[]) {
        Gift plane = new PlaneGift("Plane");
        Gift car = new CarGift("Car");
        GiftComposite gifts = new GiftComposite();
        gifts.addGift(plane);
        gifts.addGift(car);
        gifts.getGifts().forEach(Gift::unwrap);
    }
}
