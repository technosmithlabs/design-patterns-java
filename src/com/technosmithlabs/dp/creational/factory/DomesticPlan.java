package com.technosmithlabs.dp.creational.factory;

public class DomesticPlan implements ElectricityPlan {
    @Override
    public Long getPlanRate() {
        return 5L;
    }
}
