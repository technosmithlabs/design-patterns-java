package com.technosmithlabs.dp.creational.factory;

public class FactoryPatternDemo {

    public static void main(String args[]) {
        Long electricityUnits = 78l;
        ElectricityPlan planForSam =
                ElectricityPlanFactory.getPlan(ElectricityPlanOptions.DOMESTIC);
        ElectricityPlan planForJosh =
                ElectricityPlanFactory.getPlan(ElectricityPlanOptions.COMMERCIAL);
        ElectricityPlan planForRam =
                ElectricityPlanFactory.getPlan(ElectricityPlanOptions.INTERNATIONAL);
        System.out.println("Electricity bill is: " + planForSam.calculateElectricityBill(electricityUnits));
        System.out.println("Electricity bill is: " + planForJosh.calculateElectricityBill(electricityUnits));
        System.out.println("Electricity bill is: " + planForRam.calculateElectricityBill(electricityUnits));
    }

}
