package com.technosmithlabs.dp.behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String args[]) {
        JobRole roleFirst = new AssociateJobRole(WorkType.CONFERENCE);
        JobRole roleAnother = new AssociateJobRole(WorkType.NEW_PURCHASE);
        roleFirst.executeJob();
        roleAnother.executeJob();
    }
}
