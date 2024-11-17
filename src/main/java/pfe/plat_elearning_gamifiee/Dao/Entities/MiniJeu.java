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
public class MiniJeu {
    @Id
    private int idMiniJeu;
    private int idProfesseurFk;
    private int idCoursFk;
    private String description;
    private int nombreDeFoisJoues;
}
