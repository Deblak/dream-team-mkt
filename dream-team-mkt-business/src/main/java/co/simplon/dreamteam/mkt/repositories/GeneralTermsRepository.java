package co.simplon.dreamteam.mkt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.dreamteam.mkt.entities.Terms;

@Repository
public interface GeneralTermsRepository extends JpaRepository<Terms, Long> {

}
