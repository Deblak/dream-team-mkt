package co.simplon.dreamteam.market.services.implementations;

import org.springframework.stereotype.Service;

import co.simplon.dreamteam.market.dtos.DreamTeamIdDto;
import co.simplon.dreamteam.market.entities.Terms;
import co.simplon.dreamteam.market.mapper.DreamTeamIdMapper;
import co.simplon.dreamteam.market.repositories.GeneralTermsRepository;
import co.simplon.dreamteam.market.services.GeneralTermsService;

@Service
public class GeneralTermsServiceImpl implements GeneralTermsService {

	private final GeneralTermsRepository repository;

	GeneralTermsServiceImpl(GeneralTermsRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public String get() {
		Terms terms = this.repository.findAll().getLast();
		
		return terms.getTerms();
	}
	
	@Override
	public String updateData(String terms) {
		Terms newTerms = new Terms();
		newTerms.setTerms(terms);
		
		repository.saveAndFlush(newTerms);
		
		return terms;
	}

}
