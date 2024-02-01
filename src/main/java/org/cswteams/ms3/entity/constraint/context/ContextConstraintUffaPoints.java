package org.cswteams.ms3.entity.constraint.context;
//TODO generalizzare con ContextConstraint

import lombok.Data;
import org.cswteams.ms3.entity.ConcreteShift;
import org.cswteams.ms3.entity.scheduling.DoctorScheduleState;

public class ContextConstraintUffaPoints extends ContextConstraint {

    public ContextConstraintUffaPoints(DoctorScheduleState doctorScheduleState, ConcreteShift concreteShift) {
        this.concreteShift = concreteShift;
        this.doctorScheduleState = doctorScheduleState;
    }

}