package ma.enset.gestion_cabinet.service;

import ma.enset.gestion_cabinet.entity.Consultation;
import ma.enset.gestion_cabinet.repository.ConsultationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConsultationService implements IConsultationService {

    private final ConsultationRepository consultationRepository;

    public ConsultationService(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation); // ✅ pas null
    }

    @Override
    public Consultation getConsultationById(long id) {
        return consultationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    @Override
    public void deleteConsultationById(long id) {
        consultationRepository.deleteById(id);
    }
}