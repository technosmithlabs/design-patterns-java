package com.technosmithlabs.dp.structural.composite;

public class PlaneGift implements Gift {

    private String giftName;

    public PlaneGift(String giftName) {
        this.giftName = giftName;
    }

    @Override
    public void unwrap() {
        System.out.println("Wrapping the gift which is named as: " + this.giftName);
    }
}
