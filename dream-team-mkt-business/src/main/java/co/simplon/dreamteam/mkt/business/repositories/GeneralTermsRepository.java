package co.simplon.dreamteam.mkt.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.dreamteam.mkt.business.entities.Terms;

@Repository
public interface GeneralTermsRepository extends JpaRepository<Terms, Long> {

}
