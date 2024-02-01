package org.cswteams.ms3.control.scheduler.builder;

import lombok.Getter;
import lombok.Setter;
import org.cswteams.ms3.control.scocciatura.AbstractControllerScocciatura;
import org.cswteams.ms3.entity.ConcreteShift;
import org.cswteams.ms3.entity.Schedule;
import org.cswteams.ms3.entity.constraint.Constraint;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.logging.Logger;

public abstract class ScheduleBuilder {

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

    /**
     * This method add a concrete shift to the schedule manually. The concrete shift shall be already defined with
     * date and doctors.
     *
     * @param concreteShift The concrete shift to be added to the schedule
     * @param isForced      Boolean that represents if it is possible to violate the soft constraints with the new concrete shift
     * @return An instance of the updated shift schedule
     */
    abstract Schedule addConcreteShift(ConcreteShift concreteShift, boolean isForced);

    abstract Schedule build();

    }
