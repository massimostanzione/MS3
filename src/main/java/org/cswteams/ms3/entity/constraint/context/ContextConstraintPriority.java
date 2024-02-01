package org.cswteams.ms3.entity.constraint.context;

import org.cswteams.ms3.entity.ConcreteShift;
import org.cswteams.ms3.entity.DoctorHolidays;
import org.cswteams.ms3.entity.scheduling.algo.DoctorUffaPriority;
import org.cswteams.ms3.entity.Holiday;

import java.util.List;

/**
 * Context for <i>constraints</i> validation.
 */
public class ContextConstraintPriority extends ContextConstraint {



    public ContextConstraintPriority(DoctorUffaPriority doctorUffaPriority, ConcreteShift concreteShift, DoctorHolidays doctorHolidays, List<Holiday> holidays){
        this.concreteShift = concreteShift;
        this.schedulingAlgorithmCharacterizingElement = doctorUffaPriority;
        this.doctorHolidays = doctorHolidays;
        this.holidays = holidays;
    }

}
