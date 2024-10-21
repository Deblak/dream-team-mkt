package co.simplon.dreamteam.mkt.services;

import org.springframework.stereotype.Service;

import co.simplon.dreamteam.mkt.entities.Terms;
import co.simplon.dreamteam.mkt.repositories.GeneralTermsRepository;

@Service
public class GeneralTermsService {

	private final GeneralTermsRepository repository;

	GeneralTermsService(GeneralTermsRepository repository) {
		this.repository = repository;
	}

	public String get() {
		Terms terms = this.repository.findAll().getLast();

		return terms.getTerms();
	}

	public String updateData(String terms) {
		Terms newTerms = new Terms();
		newTerms.setTerms(terms);

		repository.saveAndFlush(newTerms);

		return terms;
	}

}
