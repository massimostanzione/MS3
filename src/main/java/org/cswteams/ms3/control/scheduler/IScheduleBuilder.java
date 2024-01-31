package org.cswteams.ms3.control.scheduler;

import org.cswteams.ms3.entity.ConcreteShift;
import org.cswteams.ms3.entity.Schedule;

public interface IScheduleBuilder {
    /**
     * This method add a concrete shift to the schedule manually. The concrete shift shall be already defined with
     * date and doctors.
     *
     * @param concreteShift The concrete shift to be added to the schedule
     * @param isForced      Boolean that represents if it is possible to violate the soft constraints with the new concrete shift
     * @return An instance of the updated shift schedule
     */
    Schedule addConcreteShift(ConcreteShift concreteShift, boolean isForced);

    Schedule build();
}
