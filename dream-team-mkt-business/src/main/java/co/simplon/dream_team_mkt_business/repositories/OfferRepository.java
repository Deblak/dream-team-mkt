package co.simplon.dream_team_mkt_business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.dream_team_mkt_business.entities.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

}
