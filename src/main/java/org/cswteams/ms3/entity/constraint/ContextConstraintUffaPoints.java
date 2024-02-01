package org.cswteams.ms3.entity.constraint;
//TODO generalizzare con ContextConstraint

import lombok.Data;
import org.cswteams.ms3.entity.ConcreteShift;
import org.cswteams.ms3.entity.scheduling.DoctorScheduleState;

import javax.validation.constraints.NotNull;

@Data
public class ContextConstraintUffaPoints implements IContextConstraint{

    @NotNull
    private DoctorScheduleState doctorScheduleState;

    @NotNull
    private ConcreteShift concreteShift;

    public ContextConstraintUffaPoints(DoctorScheduleState doctorScheduleState, ConcreteShift concreteShift) {
        this.concreteShift = concreteShift;
        this.doctorScheduleState = doctorScheduleState;
    }

}