package org.cswteams.ms3.control.scocciatura;

import org.cswteams.ms3.entity.scocciature.ContestoScocciatura;
import org.cswteams.ms3.entity.scocciature.Scocciatura;

import java.util.List;

public abstract class ControllerScocciatura {

    protected List<Scocciatura> scocciature;   //why public!?

    abstract int calcolaUffaComplessivoUtenteAssegnazione(ContestoScocciatura contestoScocciatura);

}
