package com.technosmithlabs.dp.structural.composite;

public class CarGift implements Gift {
    private String giftName;

    public CarGift(String giftName) {
        this.giftName = giftName;
    }

    @Override
    public void unwrap() {
        System.out.println("Wrapping the gift which is named as: " + this.giftName);
    }
}
