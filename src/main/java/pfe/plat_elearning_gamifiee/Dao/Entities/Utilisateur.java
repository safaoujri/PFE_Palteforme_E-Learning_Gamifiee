package pfe.plat_elearning_gamifiee.Dao.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Compte;
    public String nom_Compte;
    public String Nom;
    public String Prenom;
    public String Email;
    public String Mot_de_Passe;
    public String Photo_de_Profile;
    public Boolean isLocked;

}
