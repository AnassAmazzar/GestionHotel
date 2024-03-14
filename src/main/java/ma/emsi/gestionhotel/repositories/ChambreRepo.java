package ma.emsi.gestionhotel.repositories;

import com.projet.gestionhotel.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepo extends JpaRepository<Chambre,Integer> {
}
