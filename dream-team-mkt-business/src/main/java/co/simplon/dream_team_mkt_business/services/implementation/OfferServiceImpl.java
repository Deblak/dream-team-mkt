package co.simplon.dream_team_mkt_business.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.dream_team_mkt_business.entities.Offer;
import co.simplon.dream_team_mkt_business.repositories.OfferRepository;
import co.simplon.dream_team_mkt_business.services.OfferService;

@Service
public class OfferServiceImpl implements OfferService {
    private final OfferRepository repository;

    public OfferServiceImpl(OfferRepository repository) {
	super();
	this.repository = repository;
    }

    @Override
    public List<Offer> getAll() {
	return repository.findAll();
    }

}
