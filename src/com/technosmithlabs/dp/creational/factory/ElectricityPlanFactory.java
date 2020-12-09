package com.technosmithlabs.dp.creational.factory;

public class ElectricityPlanFactory {

    public static ElectricityPlan getPlan(ElectricityPlanOptions options) {
        switch (options) {
            case DOMESTIC: {
                return new DomesticPlan();
            }
            case COMMERCIAL: {
                return new CommercialPlan();
            }
            case INTERNATIONAL: {
                return new InternationalPlan();
            }
        }
        return null;
    }

}
