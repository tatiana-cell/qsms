package simplon.com.mcq.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import simplon.com.mcq.domain.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);

}
