package simplon.com.mcq.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import simplon.com.mcq.domain.entities.Qcm;

public interface QcmRepository extends JpaRepository<Qcm, Long> {

}
