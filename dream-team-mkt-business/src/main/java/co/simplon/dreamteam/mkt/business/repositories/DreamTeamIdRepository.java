package co.simplon.dreamteam.mkt.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.dreamteam.mkt.business.entities.DreamTeamId;

@Repository
public interface DreamTeamIdRepository extends JpaRepository<DreamTeamId, Long> {

}
