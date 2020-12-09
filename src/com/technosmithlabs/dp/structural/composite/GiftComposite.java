package com.technosmithlabs.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GiftComposite implements Gift {

    private final List<Gift> gifts = new ArrayList<>();

    private String giftName;

    public Boolean addGift(Gift gift) {
        return this.gifts.add(gift);
    }

    public List<Gift> getGifts() {
        return this.gifts;
    }

    public Boolean removeGift(Gift gift) {
        return this.gifts.remove(gift);
    }

    @Override
    public void unwrap() {
        gifts.forEach(Gift::unwrap);
    }
}
