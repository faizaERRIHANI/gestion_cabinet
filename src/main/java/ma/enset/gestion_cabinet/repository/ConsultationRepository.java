package ma.enset.gestion_cabinet.repository;

import ma.enset.gestion_cabinet.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

}