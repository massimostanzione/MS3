package org.cswteams.ms3.entity.scheduling;

import org.cswteams.ms3.control.scheduler.ISchedulerController;
import org.cswteams.ms3.control.scheduler.SchedulerControllerUffaPoints;
import org.cswteams.ms3.entity.constraint.IContextConstraint;

public class Scheduler {
  //  private IScheduleBuilder scheduleBuilder;

    private ISchedulerController schedulerController;

  //  private IControllerScocciatura controllerScocciatura;

 //   private IContextConstraint contextConstraint;

    //private IDoctorXY doctorXY;
/*
    public Scheduler(IScheduleBuilder scheduleBuilder, ISchedulerController schedulerController, IControllerScocciatura controllerScocciatura, IContextConstraint contextConstraint) {
        this.scheduleBuilder = scheduleBuilder;
        this.schedulerController = schedulerController;
        this.controllerScocciatura = controllerScocciatura;
        this.contextConstraint = contextConstraint;
    }*/

    public Scheduler(ISchedulerController schedulerController) {
        this.schedulerController = schedulerController;

    }
}
