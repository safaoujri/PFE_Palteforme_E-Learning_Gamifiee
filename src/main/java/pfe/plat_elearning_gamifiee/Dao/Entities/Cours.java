package pfe.plat_elearning_gamifiee.Dao.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cours {
    @Id
    private int idCours;
    private int idProfesseurFk;
    private String titre;
    private String description;
    private String photoCours;
}
