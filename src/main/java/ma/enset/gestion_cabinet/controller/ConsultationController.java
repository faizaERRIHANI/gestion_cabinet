package ma.enset.gestion_cabinet.controller;

import ma.enset.gestion_cabinet.entity.Consultation;
import ma.enset.gestion_cabinet.service.IConsultationService;
import ma.enset.gestion_cabinet.service.IPatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ConsultationController {

    private final IConsultationService consultationService;
    private final IPatientService patientService;

    public ConsultationController(IConsultationService consultationService,
                                  IPatientService patientService) {
        this.consultationService = consultationService;
        this.patientService = patientService;
    }

    // Liste des consultations
    @GetMapping("/consultations")
    public String listConsultations(Model model) {
        List<Consultation> consultations = consultationService.getAllConsultations();
        model.addAttribute("consultations", consultations);
        return "consultations/list";
    }

    // Afficher formulaire ajout
    @GetMapping("/consultations/new")
    public String showForm(Model model) {
        model.addAttribute("consultation", new Consultation());
        model.addAttribute("patients", patientService.getAllPatients());
        return "consultations/form";
    }

    // Sauvegarder consultation
    @PostMapping("/consultations/save")
    public String saveConsultation(@ModelAttribute Consultation consultation) {
        consultationService.saveConsultation(consultation);
        return "redirect:/consultations";
    }

    // Supprimer consultation
    @GetMapping("/consultations/delete/{id}")
    public String deleteConsultation(@PathVariable long id) {
        consultationService.deleteConsultationById(id);
        return "redirect:/consultations";
    }
}