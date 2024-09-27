package co.simplon.dreamteam.mkt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.dreamteam.mkt.entities.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

}
