package co.simplon.dreamteam.mkt.business.services.implementations;

import org.springframework.stereotype.Service;

import co.simplon.dreamteam.mkt.business.dtos.DreamTeamIdDto;
import co.simplon.dreamteam.mkt.business.entities.Terms;
import co.simplon.dreamteam.mkt.business.mapper.DreamTeamIdMapper;
import co.simplon.dreamteam.mkt.business.repositories.GeneralTermsRepository;
import co.simplon.dreamteam.mkt.business.services.GeneralTermsService;

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
/*		Terms newTerms = new Terms();
		newTerms.setTerms(terms);
		
		repository.saveAndFlush(newTerms);
		
		return terms;*/
		Terms term = repository.findAll().getLast();
		term.setTerms(terms);
		repository.saveAndFlush(term);
		
		return term.getTerms();
	}

}
