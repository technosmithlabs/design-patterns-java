package com.technosmithlabs.dp.behavioral.chainofresponsibility;

public class AssociateJobRole implements JobRole {

    private WorkType workType;

    private JobRole nextJobRole;

    public AssociateJobRole(WorkType workType) {
        this.workType = workType;
        this.nextJobRole = new VPJobRole(workType);
    }

    @Override
    public void executeJob() {
        if (this.workType.equals(WorkType.APP_DEVELOPMENT)) {
            System.out.println("Associate has started working on the work type");
        } else {
            System.out.println("Associate is not eligible for this job. Passing the job to next one in the hierarchy");
            this.nextJobRole.executeJob();
        }
    }
}
