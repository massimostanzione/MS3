package org.cswteams.ms3.entity.scheduling;

import org.cswteams.ms3.control.scheduler.ISchedulerController;
import org.cswteams.ms3.control.scheduler.SchedulerControllerPriority;
import org.cswteams.ms3.control.scheduler.SchedulerControllerUffaPoints;

//TODO schedulercontrollerfactory?
public class SchedulerFactory {
    /*
        public Scheduler SchedulerFactory(SchedulerType schedulerType) {
            switch (schedulerType) {
                case SCHEDULER_UFFAPOINTS:
                    return new Scheduler(
                            //new ScheduleBuilderUffaPoints(),
                            new SchedulerControllerUffaPoints()//,
                            //new ControllerScocciaturaUffaPoints(),
                            //new ContextConstraintUffaPoints()
                    );
                case SCHEDULER_UFFAPRIORITY:
                    return new Scheduler(
                            //new ScheduleBuilderPriority(),
                            new SchedulerControllerPriority()//,
                            //new ControllerScocciaturaPriority(),
                            //new ContextConstraintPriority()
                    );
                default:
                    throw new RuntimeException("wut?");
            }
        }

    */
    //TODO createSchedulerController?
    public ISchedulerController createScheduler(SchedulerType schedulerType) {
        switch (schedulerType) {
            case SCHEDULER_UFFAPOINTS:
                return new SchedulerControllerUffaPoints();
            case SCHEDULER_UFFAPRIORITY:
                return new SchedulerControllerPriority();
            default:
                throw new RuntimeException("wut?");
        }
    }

}
