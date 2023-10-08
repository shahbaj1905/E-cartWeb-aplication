package ecart.com.repository;

import ecart.com.model.Deliviry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliviryRepository extends JpaRepository<Deliviry,Integer> {
}
