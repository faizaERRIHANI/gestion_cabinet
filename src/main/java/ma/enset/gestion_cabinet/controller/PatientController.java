package ma.enset.gestion_cabinet.controller;

import ma.enset.gestion_cabinet.entity.Patient;
import ma.enset.gestion_cabinet.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public String listPatients(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patients/list";
    }

    @GetMapping("/patients/delete/{id}")
    public String deletePatient(@PathVariable long id) {
        patientService.deletePatientById(id);
        return "redirect:/patients";
    }
    // Afficher le formulaire
    @GetMapping("/patients/new")
    public String showForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "patients/form";
    }

    // Sauvegarder le patient
    @PostMapping("/patients/save")
    public String savePatient(@ModelAttribute Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/patients";
    }
}