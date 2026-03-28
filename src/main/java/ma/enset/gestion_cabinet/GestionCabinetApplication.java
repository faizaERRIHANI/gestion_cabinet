package ma.enset.gestion_cabinet;

import ma.enset.gestion_cabinet.entity.Consultation;
import ma.enset.gestion_cabinet.entity.Patient;
import ma.enset.gestion_cabinet.repository.ConsultationRepository;
import ma.enset.gestion_cabinet.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class GestionCabinetApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private ConsultationRepository consultationRepository;

    public static void main(String[] args) {
        SpringApplication.run(GestionCabinetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        patientRepository.save(new Patient(null, "Errihani", "Faiza", new Date(), "0654556565", "faiza@gmail.com", null));
        patientRepository.save(new Patient(null, "Alami", "Mohamed", new Date(), "0612345678", "alami@gmail.com", null));
        patientRepository.save(new Patient(null, "Benali", "Sara", new Date(), "0698765432", "sara@gmail.com", null));

        System.out.println("✅ Patients ajoutés !");
    }
}