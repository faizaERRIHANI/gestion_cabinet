package ma.enset.gestion_cabinet.service;

import ma.enset.gestion_cabinet.entity.Consultation;
import ma.enset.gestion_cabinet.repository.ConsultationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConsultationService implements IConsultationService{
    private ConsultationRepository consultationRepository;

    public ConsultationService(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    @Override
    public void addConsultation(Consultation consultation) {
        consultationRepository.save(consultation) ;
    }

    @Override
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    @Override
    public void updateConsultation(Consultation consultation) {
        consultationRepository.save(consultation);
    }

    @Override
    public void deleteConsultationById(long id) {
        consultationRepository.deleteById(id) ;
    }
}
