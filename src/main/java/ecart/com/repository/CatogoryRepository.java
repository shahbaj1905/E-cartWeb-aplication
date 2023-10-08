package ecart.com.repository;

import ecart.com.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatogoryRepository extends JpaRepository<Category, Integer> {

}
