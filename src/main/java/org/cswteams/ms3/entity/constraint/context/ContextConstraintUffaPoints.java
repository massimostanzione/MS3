package org.cswteams.ms3.entity.constraint.context;
//TODO generalizzare con ContextConstraint

import org.cswteams.ms3.entity.ConcreteShift;
import org.cswteams.ms3.entity.scheduling.algo.DoctorScheduleState;

public class ContextConstraintUffaPoints extends ContextConstraint {
// TODO cancellare una volta implementata la gestione delle holiday nell'algoritmo vecchio
    public ContextConstraintUffaPoints(DoctorScheduleState doctorScheduleState, ConcreteShift concreteShift) {
        this.concreteShift = concreteShift;
        this.schedulingAlgorithmCharacterizingElement = doctorScheduleState;
    }

}