package com.technosmithlabs.dp.behavioral.chainofresponsibility;

public class VPJobRole implements JobRole {

    private WorkType workType;

    private JobRole nextJobRole;

    public VPJobRole(WorkType workType) {
        this.workType = workType;
        this.nextJobRole = new CEOJobRole(workType);
    }

    @Override
    public void executeJob() {
        if (this.workType.equals(WorkType.CONFERENCE)) {
            System.out.println("VP has started working on the work type");
        } else {
            System.out.println("VP is not eligible for this job. Passing the job to next one in the hierarchy");
            this.nextJobRole.executeJob();
        }
    }
}
