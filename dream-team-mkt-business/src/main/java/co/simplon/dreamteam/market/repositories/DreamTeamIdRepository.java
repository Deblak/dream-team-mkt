package co.simplon.dreamteam.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.dreamteam.market.entities.DreamTeamId;

@Repository
public interface DreamTeamIdRepository extends JpaRepository<DreamTeamId, Long> {

}
