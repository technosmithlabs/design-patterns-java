package com.technosmithlabs.dp.behavioral.chainofresponsibility;

public class CEOJobRole implements JobRole {

    private WorkType workType;

    private JobRole nextJobRole;

    public CEOJobRole(WorkType workType) {
        this.workType = workType;
        this.nextJobRole = null;
    }

    @Override
    public void executeJob() {
        System.out.println("CEO can do anything");
    }
}
