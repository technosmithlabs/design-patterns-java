package com.technosmithlabs.dp.creational.factory;

public class CommercialPlan implements ElectricityPlan {
    @Override
    public Long getPlanRate() {
        return 8L;
    }
}
