package co.simplon.dream_team_mkt_business.services.implementation;

import org.springframework.stereotype.Service;

import co.simplon.dream_team_mkt_business.dtos.DreamTeamIdDto;
import co.simplon.dream_team_mkt_business.entities.Terms;
import co.simplon.dream_team_mkt_business.mapper.DreamTeamIdMapper;
import co.simplon.dream_team_mkt_business.repositories.GeneralTermsRepository;
import co.simplon.dream_team_mkt_business.services.GeneralTermsService;

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
