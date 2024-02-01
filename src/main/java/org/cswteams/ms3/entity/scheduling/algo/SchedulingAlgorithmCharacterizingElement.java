package org.cswteams.ms3.entity.scheduling.algo;

import lombok.Getter;
import lombok.Setter;
import org.cswteams.ms3.entity.ConcreteShift;
import org.cswteams.ms3.entity.Doctor;
import org.cswteams.ms3.entity.Schedule;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public abstract class SchedulingAlgorithmCharacterizingElement {


    @Id
    @GeneratedValue
    protected Long id;

    /**
     * Utente a cui appartiene questo stato
     */
    @ManyToOne
    protected Doctor doctor;

    /**
     * Pianificazione a cui appartiene questo stato
     */
    @OneToOne
    protected Schedule schedule;

    /** All the concrete shifts assigned to the doctor in the current schedule */
    @Transient
    List<ConcreteShift> assegnazioniTurnoCache;

    public abstract List<ConcreteShift> getAssegnazioniTurnoCache();
}
