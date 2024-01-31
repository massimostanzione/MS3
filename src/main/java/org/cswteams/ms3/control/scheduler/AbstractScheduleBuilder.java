package org.cswteams.ms3.control.scheduler;

import lombok.Getter;
import lombok.Setter;
import org.cswteams.ms3.control.scocciatura.AbstractControllerScocciatura;
import org.cswteams.ms3.control.scocciatura.ControllerScocciaturaUffaPoints;
import org.cswteams.ms3.entity.Schedule;
import org.cswteams.ms3.entity.constraint.Constraint;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.logging.Logger;

public abstract class AbstractScheduleBuilder implements IScheduleBuilder {


    protected final Logger logger = Logger.getLogger(ScheduleBuilderPriority.class.getName());

    /**
     * List of constraints to be applied to each couple (ConcreteShift, User)
     */
    @NotNull
    protected List<Constraint> allConstraints;

    /**
     * Shift schedule to be built
     */
    protected Schedule schedule;


    /**
     * Instance of controllerScocciatura
     */


    @Getter
    @Setter
    protected AbstractControllerScocciatura controllerScocciatura;
    //protected ControllerScocciaturaUffaPoints controllerScocciatura;

    }
