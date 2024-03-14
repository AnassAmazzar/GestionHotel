package ma.emsi.gestionhotel.repositories;

import com.projet.gestionhotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel,Integer> {

}
