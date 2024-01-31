package org.cswteams.ms3.control.scocciatura;

import org.cswteams.ms3.entity.ConcreteShift;
import org.cswteams.ms3.entity.DoctorUffaPriority;
import org.cswteams.ms3.entity.scheduling.DoctorScheduleState;
import org.cswteams.ms3.entity.scocciature.ContestoScocciatura;
import org.cswteams.ms3.entity.scocciature.Scocciatura;
import org.cswteams.ms3.enums.PriorityQueueEnum;

import java.util.List;

public abstract class AbstractControllerScocciatura {

    protected List<Scocciatura> scocciature;   //why public!?

    //TODO interfaccia o va bene così?
    abstract int calcolaUffaComplessivoUtenteAssegnazione(ContestoScocciatura contestoScocciatura);

/*
    // FIXME!!!!! - le seguenti non sono davvero ereditarietà!
    public abstract void addUffaTempUtenti(List<DoctorScheduleState> allDoctorScheduleState, ConcreteShift concreteShift);

    public abstract void updatePriorityDoctors(List<DoctorUffaPriority> allDoctorUffaPriority, ConcreteShift concreteShift, PriorityQueueEnum priorityQueueEnum);

    public abstract void normalizeUffaPriority(List<DoctorUffaPriority> allDoctorUffaPriority);

    // queste due di seguito si posso unire?
    public abstract void ordinaByUffa(List<DoctorScheduleState> allDoctorScheduleState);

    public abstract void orderByPriority(List<DoctorUffaPriority> allDoctorUffaPriority, PriorityQueueEnum priorityQueueEnum);
*/
}
