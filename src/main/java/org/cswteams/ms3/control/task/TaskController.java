package org.cswteams.ms3.control.task;

import org.cswteams.ms3.dao.TaskDAO;
import org.cswteams.ms3.entity.Doctor;
import org.cswteams.ms3.entity.MedicalService;
import org.cswteams.ms3.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskController implements ITaskController {

    @Autowired
    TaskDAO taskDAO;
/*
    @Override
    public Set<RotationDTO> leggiTurniDiServizio(String servizio) {
        //return MappaTurni.turnoEntityToDTO(turnoDao.findAllByServizioNome(servizio));
        return null;
    }

    @Override
    public Set<RotationDTO> leggiTurni() {
        //return MappaTurni.turnoEntityToDTO(turnoDao.findAll());
        return null;
    }

    @Override
    public Shift creaTurno(RotationDTO turno) throws ShiftException {
        //Shift shiftEntity = MappaTurni.turnoDTOToEntity(turno);
        //return turnoDao.save(shiftEntity);
        return null;
    }*/

    @Override
    public void addDoctor(Task task, Doctor doctor){
        task.addDoctor(doctor);
    }

    @Override
    public void addService(MedicalService medicalService, Doctor doctor) {

    }

}