package ma.enset.gestion_cabinet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String tel;
    private String email;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = true) // ✅ supprime les consultations automatiquement
    private List<Consultation> consultations;
}