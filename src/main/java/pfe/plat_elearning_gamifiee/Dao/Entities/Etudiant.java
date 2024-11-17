package pfe.plat_elearning_gamifiee.Dao.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant extends Utilisateur{
    @Id
    private int niveau ;
    private int pointsExp;
    private int classement;
    private int coursTermines;
    private int nombreMiniJeuxTermines;

}
