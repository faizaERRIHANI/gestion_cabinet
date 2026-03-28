package ma.enset.gestion_cabinet.service;

import ma.enset.gestion_cabinet.entity.Patient;
import java.util.List;

public interface IPatientService {
    Patient savePatient(Patient patient);
    Patient getPatientById(long id);
    List<Patient> getAllPatients();
    void deletePatientById(long id);
}
