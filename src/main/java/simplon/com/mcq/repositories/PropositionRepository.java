package simplon.com.mcq.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import simplon.com.mcq.domain.entities.Proposition;

public interface PropositionRepository extends JpaRepository<Proposition, Long> {

}
