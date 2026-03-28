package ma.enset.gestion_cabinet.service;

import ma.enset.gestion_cabinet.entity.Patient;
import ma.enset.gestion_cabinet.repository.PatientRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService implements IPatientService {

    private final PatientRepository patientRepository;


    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(long id) {
        return patientRepository.findById(id).orElse(null); // ✅ plus de .get() sans vérification
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void deletePatientById(long id) {
        patientRepository.deleteById(id);
    }
}



