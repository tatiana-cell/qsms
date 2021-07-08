package simplon.com.mcq.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simplon.com.mcq.domain.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByByDefaultTrue();
}
