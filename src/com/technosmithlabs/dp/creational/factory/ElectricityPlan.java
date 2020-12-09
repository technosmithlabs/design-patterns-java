package com.technosmithlabs.dp.creational.factory;

public interface ElectricityPlan {

    public Long getPlanRate();

    public default Long calculateElectricityBill(Long units) {
        return units*getPlanRate();
    }
}
