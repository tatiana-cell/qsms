package simplon.com.mcq.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import simplon.com.mcq.domain.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findBycategoryName(String title);

}
