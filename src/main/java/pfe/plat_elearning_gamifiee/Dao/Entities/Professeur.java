package pfe.plat_elearning_gamifiee.Dao.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professeur {
    @Id
    private int nombreDeCoursCrees;
    private int nombreDeMiniJeux;
}
