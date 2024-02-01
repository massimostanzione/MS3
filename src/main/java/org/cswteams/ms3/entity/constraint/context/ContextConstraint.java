package org.cswteams.ms3.entity.constraint.context;

import lombok.Data;
import org.cswteams.ms3.entity.ConcreteShift;
import org.cswteams.ms3.entity.DoctorHolidays;
import org.cswteams.ms3.entity.scheduling.algo.DoctorUffaPriority;
import org.cswteams.ms3.entity.Holiday;
import org.cswteams.ms3.entity.scheduling.algo.DoctorScheduleState;
import org.cswteams.ms3.entity.scheduling.algo.SchedulingAlgorithmCharacterizingElement;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public abstract class ContextConstraint {
    @NotNull
    protected ConcreteShift concreteShift;

    /**
     * TODO implementare nel vecchio algoritmo
     */
    protected DoctorHolidays doctorHolidays;

    /**
     * TODO implementare nel vecchio algoritmo
     */
    protected List<Holiday> holidays;

    /**
     * @see DoctorScheduleState for UffaPoints ("old") scheduling algorithm
     * @see DoctorUffaPriority for priority ("new") scheduling algorithm
     */
    @NotNull SchedulingAlgorithmCharacterizingElement schedulingAlgorithmCharacterizingElement;

}
