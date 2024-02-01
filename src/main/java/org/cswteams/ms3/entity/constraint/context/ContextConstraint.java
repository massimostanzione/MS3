package org.cswteams.ms3.entity.constraint.context;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.cswteams.ms3.entity.ConcreteShift;
import org.cswteams.ms3.entity.DoctorHolidays;
import org.cswteams.ms3.entity.DoctorUffaPriority;
import org.cswteams.ms3.entity.Holiday;
import org.cswteams.ms3.entity.scheduling.DoctorScheduleState;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public abstract class ContextConstraint {
    @NotNull
    protected ConcreteShift concreteShift;

    protected DoctorHolidays doctorHolidays;

    protected List<Holiday> holidays;


    //TODO con l'introduzione delle holidays nell'algoritmo UffaPoints, le due sotto classi potrebbero
    // essere fuse, generalizzando doctorUP/doctorSS

    @NotNull
    protected DoctorUffaPriority doctorUffaPriority;
    @NotNull
    protected DoctorScheduleState doctorScheduleState;



}
