package ma.enset.gestion_cabinet.service;

import ma.enset.gestion_cabinet.entity.Consultation;

import java.util.List;

public interface IConsultationService {
    void addConsultation(Consultation consultation);
    List<Consultation> getAllConsultations();
    void updateConsultation(Consultation consultation);
    void deleteConsultationById(long id);
}
