package co.simplon.dreamteam.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.dreamteam.market.entities.Terms;

@Repository
public interface GeneralTermsRepository extends JpaRepository<Terms, Long> {

}
