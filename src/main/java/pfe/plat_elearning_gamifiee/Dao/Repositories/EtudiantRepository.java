package pfe.plat_elearning_gamifiee.Dao.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.plat_elearning_gamifiee.Dao.Entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
}
