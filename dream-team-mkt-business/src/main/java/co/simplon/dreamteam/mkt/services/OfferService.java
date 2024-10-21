package co.simplon.dreamteam.mkt.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.dreamteam.mkt.dtos.OfferDto;
import co.simplon.dreamteam.mkt.mapper.OfferMapper;
import co.simplon.dreamteam.mkt.repositories.OfferRepository;

@Service
public class OfferService {
	private final OfferRepository repository;

	public OfferService(OfferRepository repository) {
		this.repository = repository;
	}

	public List<OfferDto> getAll() {
		return OfferMapper.entitiesToDtos(
				repository.findAll().stream().sorted((o1, o2) -> Long.valueOf(o1.getId()).intValue() - Long.valueOf(o2.getId()).intValue()).toList());
	}

	public void updateData(List<OfferDto> inputs) {
		repository.saveAll(OfferMapper.dtosToEntities(inputs, repository.findAll()));
	}
}
