package ma.enset.gestion_cabinet.service;

import ma.enset.gestion_cabinet.entity.Consultation;
import java.util.List;

public interface IConsultationService {
    Consultation saveConsultation(Consultation consultation);
    Consultation getConsultationById(long id);
    List<Consultation> getAllConsultations();
    void deleteConsultationById(long id);
}