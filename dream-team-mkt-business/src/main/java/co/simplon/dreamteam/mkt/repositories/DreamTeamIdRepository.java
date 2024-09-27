package co.simplon.dreamteam.mkt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.dreamteam.mkt.entities.DreamTeamId;

@Repository
public interface DreamTeamIdRepository extends JpaRepository<DreamTeamId, Long> {

}
