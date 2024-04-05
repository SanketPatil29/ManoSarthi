package com.team9.manosarthi_backend.Services;

import com.team9.manosarthi_backend.DTO.RegisterPatientDTO;
import com.team9.manosarthi_backend.Entities.Patient;
import com.team9.manosarthi_backend.Entities.Worker;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface WorkerService {
    Worker UpdateWorkerProfile(Worker updatedWorker);

    Patient registerPatient(RegisterPatientDTO registerPatientDTO,int workerId);
//    Patient registerPatient(Patient patient);
    List<String> getAabhaid(Integer villagecode);
}
