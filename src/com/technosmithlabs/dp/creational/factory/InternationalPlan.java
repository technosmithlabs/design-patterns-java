package com.technosmithlabs.dp.creational.factory;

public class InternationalPlan implements ElectricityPlan {
    @Override
    public Long getPlanRate() {
        return 11L;
    }
}
