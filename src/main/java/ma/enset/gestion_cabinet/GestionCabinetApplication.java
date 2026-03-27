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

        // 1. Créer et sauvegarder le patient D'ABORD
        Patient p1 = new Patient();
        p1.setNom("Hamidi");
        p1.setPrenom("Ahmed");
        p1.setEmail("hamidi@gmail.com");
        p1.setTel("06545565656");
        Patient savedPatient = patientRepository.save(p1); // récupérer le patient sauvegardé

        // 2. Créer une consultation APRÈS avec le patient sauvegardé
        Consultation c1 = new Consultation();
        c1.setDateConsultation(new Date());
        c1.setDiagnostic("Grippe saisonnière");
        c1.setPatient(savedPatient); // utiliser l'objet retourné par save()
        consultationRepository.save(c1);

        System.out.println("✅ Patient et consultation sauvegardés avec succès !");
        System.out.println("Patient ID : " + savedPatient.getId());
    }
}